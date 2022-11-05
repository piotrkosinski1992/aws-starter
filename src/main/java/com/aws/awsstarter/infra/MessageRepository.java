package com.aws.awsstarter.infra;

import com.aws.awsstarter.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
