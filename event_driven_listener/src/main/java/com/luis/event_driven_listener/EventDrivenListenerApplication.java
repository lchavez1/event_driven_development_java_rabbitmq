package com.luis.event_driven_listener;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EventDrivenListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventDrivenListenerApplication.class, args);
	}

}
