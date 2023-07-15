package com.mustafa.kafkatutorial.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumer {
    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "test_topic", groupId = "kafka_tutorial")
    public void consume(String message) {
        LOGGER.info("Received message : " + message);
    }
}
