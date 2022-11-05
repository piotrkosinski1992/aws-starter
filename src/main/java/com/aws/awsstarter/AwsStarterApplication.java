package com.aws.awsstarter;

import com.aws.awsstarter.infra.MessageRepository;
import com.aws.awsstarter.model.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AwsStarterApplication implements CommandLineRunner {

    private final MessageRepository messageRepository;

    public AwsStarterApplication(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsStarterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageRepository.saveAll(List.of(new Message("Piotr", "Zdrowia!"),
                new Message("Jan", "Miłego dnia")));
    }
}
