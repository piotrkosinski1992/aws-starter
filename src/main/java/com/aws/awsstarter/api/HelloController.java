package com.aws.awsstarter.api;

import com.aws.awsstarter.infra.MessageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HelloController {

    public HelloController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    private final MessageRepository messageRepository;

    @GetMapping("/messages")
    public List<String> getMessages() {
        return messageRepository.findAll().stream()
                .map(message -> String.format("Hello, it's message from %s: %s", message.getUserName(), message.getMessage()))
                .collect(Collectors.toList());
    }
}
