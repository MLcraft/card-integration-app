package com.shizubro.cardorders.queue;

import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

import java.util.function.Consumer;

@Slf4j
@Controller
@Configuration
public class CardOrderReceiver {
    public void handle(@NotNull final Message<String> message) {
        log.info("Consume a message from queue");
        System.out.println("Consume a message from queue");
        System.out.println(message);
    }

    @Bean
    public Consumer<Message<String>> cardDataMessage() {
        return payload -> handle(payload);
    }
}
