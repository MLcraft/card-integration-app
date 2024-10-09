package com.shizubro.cardorders.service;

import com.shizubro.cardorders.queue.ScryfallCardDataPublisher;
import com.shizubro.cardorders.service.impl.ExternalApiClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExternalApiClientServiceTest {
    @Autowired
    ExternalApiClientService externalApiClientService;

    @Autowired
    ScryfallCardDataPublisher scryfallCardDataPublisher;

    @Test
    public void testGetBulkData() {

    }
}
