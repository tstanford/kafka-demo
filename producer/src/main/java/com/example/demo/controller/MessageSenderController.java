package com.example.demo.controller;

import com.example.demo.event.SpecialMessageEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSenderController {
    public static final String SPECIAL_MESSAGE_TOPIC = "special-message";
    private final KafkaTemplate<String, SpecialMessageEvent> kafkaTemplate;

    public MessageSenderController(KafkaTemplate<String, SpecialMessageEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendMessage(@RequestBody SpecialMessageEvent specialMessage){
        kafkaTemplate.send(SPECIAL_MESSAGE_TOPIC, specialMessage);
    }
}
