package org.fujitsu.training.development.service;

import java.util.List;

import org.fujitsu.training.development.model.Comment;
import org.fujitsu.training.development.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	public List<Comment> getAllComment() {
		return commentRepository.findAll();
	}
}
