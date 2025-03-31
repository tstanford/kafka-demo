package com.example.demo.service;

import com.example.demo.event.SpecialMessageEvent;
import com.example.demo.handler.SpecialMessageHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class SpecialEventService {
    private final SpecialMessageHandler specialMessageHandler;

    public SpecialEventService(SpecialMessageHandler specialMessageHandler) {
        this.specialMessageHandler = specialMessageHandler;
    }

    @KafkaListener(topics = "special-message", properties = {"spring.json.value.default.type=com.example.demo.event.SpecialMessageEvent"})
    public void retrieveSpecialMessage(SpecialMessageEvent message) {
        specialMessageHandler.handle(message);
    }
}
