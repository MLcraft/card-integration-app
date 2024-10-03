package com.shizubro.cardorders.queue;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CardDataPublisher {
    public static final String CARD_DATA_PRODUCER_OUT = "card-data-message-out-0";
    protected static final String ROUTING_KEY_HEADER = "X-Routingkey";
    protected static final String ROUTING_KEY_VALUE = "card-message-routing-key";
    private final StreamBridge streamBridge;

    public CardDataPublisher(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public boolean publish(String message) {
        return streamBridge.send(CARD_DATA_PRODUCER_OUT, message);
    }
    private Message<String> buildMessage(String message) {
        MessageBuilder<String> builder = MessageBuilder.withPayload(message);
        builder.setHeader(ROUTING_KEY_HEADER, ROUTING_KEY_VALUE);
        return builder.build();
    }
}
