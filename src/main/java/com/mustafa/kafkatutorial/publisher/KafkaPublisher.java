package com.mustafa.kafkatutorial.publisher;

import com.mustafa.kafkatutorial.enm.EnmKafkaTopics;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisher {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage(String message) {
        kafkaTemplate.send(EnmKafkaTopics.TEST_TOPIC.getName(), message);

        return "Message sent : " + message;
    }
}
