package com.shizubro.cardorders.queue;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.mapper.Mapper;
import com.shizubro.cardorders.repository.BulkObjectRepository;
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
    private final BulkObjectRepository bulkObjectRepository;
    private final Mapper mapper;

    public CardOrderReceiver(BulkObjectRepository bulkObjectRepository, Mapper mapper) {
        this.bulkObjectRepository = bulkObjectRepository;
        this.mapper = mapper;
    }

    public void handle(@NotNull final Message<BulkObjectDto> message) {
        System.out.println("Consume a message from queue");
        System.out.println(message);
        System.out.println(message.getPayload().getDownloadUri());
        System.out.println(this.mapper.bulkObjectToEntity(message.getPayload()));
//        this.bulkObjectRepository.save();
    }

    @Bean
    public Consumer<Message<BulkObjectDto>> cardDataMessage() {
        return payload -> handle(payload);
    }
}
