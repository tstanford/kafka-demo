package com.example.demo.handler;

import com.example.demo.event.SpecialMessageEvent;
import org.springframework.stereotype.Component;

@Component
public class SpecialMessageHandler implements MessageHandler<SpecialMessageEvent> {

    public void handle(SpecialMessageEvent message) {
            System.out.println(message.getName());
            System.out.println(message.getAge());
    }
}
