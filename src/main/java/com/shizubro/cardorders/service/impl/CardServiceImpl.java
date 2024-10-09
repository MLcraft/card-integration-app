package com.shizubro.cardorders.service.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shizubro.cardorders.dto.BulkDataDto;
import com.shizubro.cardorders.dto.MagicCardDto;
import com.shizubro.cardorders.dto.ScryfallCardDataDto;
import com.shizubro.cardorders.queue.ScryfallCardDataPublisher;
import com.shizubro.cardorders.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CardServiceImpl implements CardService {

    private ObjectMapper mapper = new ObjectMapper();
    private final ExternalApiClientService externalApiClientService;
    private final ScryfallCardDataPublisher scryfallCardDataPublisher;

    @Autowired
    public CardServiceImpl(ExternalApiClientService externalApiClientService, ScryfallCardDataPublisher scryfallCardDataPublisher) {
        this.externalApiClientService = externalApiClientService;
        this.scryfallCardDataPublisher = scryfallCardDataPublisher;
    }

    @Override
    public void fetchBulkData() {
        BulkDataDto bulkDataDto = this.externalApiClientService.getBulkData();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<MagicCardDto> magicCardDtoList = new ArrayList<>();
        try {
            InputStream input = this.getClass().getResourceAsStream("/data/oracle-cards-20241005210544.json");
            String text = IOUtils.toString(input, "UTF-8");
            log.info(text);
            magicCardDtoList = this.mapper.readerForListOf(MagicCardDto.class).readValue(text);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        magicCardDtoList.forEach(magicCardDto -> {
            this.processMagicCard(magicCardDto);
        });
    }

    @Override
    public void processMagicCard(MagicCardDto magicCardDto) {
        String cardImageUrl = null;
        if (magicCardDto.getImageUris() != null) {
            cardImageUrl = magicCardDto.getImageUris().getPng();
        }
        ScryfallCardDataDto scryfallCardDataDto = new ScryfallCardDataDto(magicCardDto.getId(), magicCardDto.getName(), cardImageUrl);
        log.info(scryfallCardDataDto.toString());
        this.scryfallCardDataPublisher.publish(scryfallCardDataDto);
    }
}
