package com.shizubro.cardorders.service;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.dto.MagicCard;


public interface CardService {
    void processMagicCard(MagicCard mc);
    void processBulkObject(BulkObjectDto bulkObjectDto);
}
