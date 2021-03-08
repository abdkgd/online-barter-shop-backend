package org.fujitsu.training.development.repository;

import org.fujitsu.training.development.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
