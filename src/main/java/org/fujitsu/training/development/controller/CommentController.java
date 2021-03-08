package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Comment;
import org.fujitsu.training.development.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@GetMapping
	public List<Comment> showAllComment(){
		return commentService.getAllComment();
	}
}
