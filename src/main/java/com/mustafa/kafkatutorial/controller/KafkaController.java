package com.mustafa.kafkatutorial.controller;

import com.mustafa.kafkatutorial.publisher.KafkaPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    private final KafkaPublisher kafkaPublisher;

    public KafkaController(KafkaPublisher kafkaPublisher) {
        this.kafkaPublisher = kafkaPublisher;
    }

    @PostMapping(value = "/")
    public String sendMessage(@RequestParam String message) {
        return kafkaPublisher.sendMessage(message);
    }
}
