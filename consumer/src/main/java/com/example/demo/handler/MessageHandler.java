package com.example.demo.handler;

public interface MessageHandler<T> {
    void handle(T message);
}
