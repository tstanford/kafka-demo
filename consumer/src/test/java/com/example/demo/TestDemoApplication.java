package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaConsumerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
