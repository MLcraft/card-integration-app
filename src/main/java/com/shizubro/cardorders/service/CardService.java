package com.shizubro.cardorders.service;

import com.shizubro.cardorders.dto.BulkDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class CardService {

    final private RestClient restClient;

    @Autowired
    public CardService(RestClient restClient) {
        this.restClient = restClient;
    }

    public BulkDataDto getBulkData() {
        BulkDataDto bulkDataDto = restClient
                .get()
                .uri("https://api.scryfall.com/bulk-data")
                .retrieve()
                .body(BulkDataDto.class);
        return bulkDataDto;
    }

}
