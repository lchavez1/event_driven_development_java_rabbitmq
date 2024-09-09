package com.luis.event_driven_producer.controller;

import com.luis.event_driven_producer.model.User;
import com.luis.event_driven_producer.rabbit.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    RabbitSender rabbitSender;

    @PostMapping("/user/{name}")
    public String sendUserToQueue(@PathVariable String name) {
        User user = new User(name);
        rabbitSender.accept(user);
        return "User has been sent to the queue";
    }
}
