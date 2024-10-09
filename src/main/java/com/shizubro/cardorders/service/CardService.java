package com.shizubro.cardorders.service;

import com.shizubro.cardorders.dto.MagicCardDto;


public interface CardService {
    void fetchBulkData();
    void processMagicCard(MagicCardDto magicCardDto);
}
