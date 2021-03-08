package org.fujitsu.training.development.repository;

import org.fujitsu.training.development.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Messages, Integer>{

}
