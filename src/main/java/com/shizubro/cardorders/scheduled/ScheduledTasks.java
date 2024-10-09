package com.shizubro.cardorders.scheduled;

import com.shizubro.cardorders.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private final CardService cardService;

    @Autowired
    public ScheduledTasks(CardService cardService) {
        this.cardService = cardService;
    }

    @Scheduled(fixedRate = 24*60*60*1000)
    public void processData() {
        this.cardService.fetchBulkData();
    }
}
