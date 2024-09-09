package com.luis.event_driven_producer.rabbit;

import com.luis.event_driven_producer.model.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class RabbitSender implements Consumer<User> {

    protected String exchange = "default";

    protected String queue = "user.queue";

    @Autowired
    protected RabbitTemplate rabbitTemplate;

    @Override
    public void accept(User user) {
        try {
            rabbitTemplate.convertAndSend(exchange, queue, user);
            System.out.printf("\nUser %s sent to \"%s\" queue with exchange \"%s\"", user.name(), queue, exchange);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
