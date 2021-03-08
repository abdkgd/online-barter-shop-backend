package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Comment;
import org.fujitsu.training.development.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path = "/{id}")
	public Comment showComment(@PathVariable Integer id) {
		return commentService.getCommentById(id);
	}
	
	@PostMapping
	public Comment saveComment(@RequestBody Comment c) {
		return commentService.saveComment(c);
	}
	
	@PutMapping
	public Comment updateComment(@RequestBody Comment c) {
		return commentService.updateComment(c);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteComment(@PathVariable Integer id) {
		return commentService.deleteComment(id);
	}
}
