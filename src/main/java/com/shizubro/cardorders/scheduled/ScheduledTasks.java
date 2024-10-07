package com.shizubro.cardorders.scheduled;

import com.shizubro.cardorders.processor.DataProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private final DataProcessor dataProcessor;

    @Autowired
    public ScheduledTasks(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    @Scheduled(fixedRate = 24*60*60*1000)
    public void processData() {
        this.dataProcessor.process();
    }

    @Scheduled(fixedRate = 24*60*60*1000)
    public void processOracleCards() {
        this.dataProcessor.processOracleCards();
    }
}
