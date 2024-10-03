package com.shizubro.cardorders.service;

import com.shizubro.cardorders.queue.CardDataPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardServiceTest {
    @Autowired
    CardService cardService;

    @Autowired
    CardDataPublisher cardDataPublisher;

    @Test
    public void testGetBulkData() {
        System.out.println(cardService.getBulkData());
        cardDataPublisher.publish("a test message");
    }
}
