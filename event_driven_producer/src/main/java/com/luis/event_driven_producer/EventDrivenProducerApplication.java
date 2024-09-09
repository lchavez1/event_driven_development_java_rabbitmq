package com.luis.event_driven_producer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EventDrivenProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventDrivenProducerApplication.class, args);
	}

}
