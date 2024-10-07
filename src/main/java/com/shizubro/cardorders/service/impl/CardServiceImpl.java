package com.shizubro.cardorders.service.impl;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.dto.MagicCard;
import com.shizubro.cardorders.mapper.Mapper;
import com.shizubro.cardorders.model.BulkObject;
import com.shizubro.cardorders.repository.BulkObjectRepository;
import com.shizubro.cardorders.service.CardService;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {
    private final Mapper mapper;
    private final BulkObjectRepository bulkObjectRepository;

    public CardServiceImpl(Mapper mapper, BulkObjectRepository bulkObjectRepository) {
        this.mapper = mapper;
        this.bulkObjectRepository = bulkObjectRepository;

    }

    @Override
    public void processMagicCard(MagicCard mc) {
        //TODO implement the logic, to process the message and save / update DB
        //map to database obj
        //do update or insert

    }

    @Override
    public void processBulkObject(BulkObjectDto bulkObjectDto) {
        BulkObject bulkObject = mapper.bulkObjectToEntity(bulkObjectDto);
        bulkObjectRepository.save(bulkObject);
    }
}
