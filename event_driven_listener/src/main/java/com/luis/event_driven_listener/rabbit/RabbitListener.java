package com.luis.event_driven_listener.rabbit;

import com.luis.event_driven_listener.model.User;
import org.springframework.stereotype.Component;

@Component
public class RabbitListener {

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "user.queue")
    public void listener(User user) {
        System.out.printf("\nWelcome to the system, %s", user.name());
    }
}
