package com.shizubro.cardorders.queue;


import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.service.CardService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

import java.util.function.Consumer;

@Slf4j
@Controller
@Configuration
public class CardOrderReceiver {

    private final CardService cardService;

    @Autowired
    public CardOrderReceiver(CardService cardService) {
        this.cardService = cardService;
    }

    public void handle(@NotNull final Message<BulkObjectDto> message) {
        log.info("Consume a message from queue");
        cardService.processBulkObject(message.getPayload());
    }

    @Bean
    public Consumer<Message<BulkObjectDto>> cardDataMessage() {
        return payload -> handle(payload);
    }


    //TODO add one more consumer to consume the MagicCard data

}
