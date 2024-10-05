package com.shizubro.cardorders.service;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.queue.CardDataPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class CardServiceTest {
    @Autowired
    CardService cardService;

    @Autowired
    CardDataPublisher cardDataPublisher;

    @Test
    public void testGetBulkData() {
        UUID testUUID = UUID.randomUUID();
        BulkObjectDto testBulkObjectDto = new BulkObjectDto(testUUID, "oracle_cards", "https://data.scryfall.io/oracle-cards/oracle-cards-20241001210332.json");
        cardDataPublisher.publish(testBulkObjectDto);
    }
}
