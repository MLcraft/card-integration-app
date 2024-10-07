package com.shizubro.cardorders.service;

import com.shizubro.cardorders.queue.CardDataPublisher;
import com.shizubro.cardorders.service.impl.ExternalApiClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExternalApiClientServiceTest {
    @Autowired
    ExternalApiClientService externalApiClientService;

    @Autowired
    CardDataPublisher cardDataPublisher;

    @Test
    public void testGetBulkData() {

    }
}
