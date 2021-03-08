package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

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
	
	public Comment getCommentById(Integer id) {
		return commentRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public Comment saveComment(Comment c){
		return commentRepository.save(c);
	}
	
	@Transactional
	public List<Comment> saveAllComment(List<Comment> c){
		return commentRepository.saveAll(c);
	}
	
	@Transactional
	public String deleteComment(Integer id) {
		commentRepository.deleteById(id);
		return "Comment Deleted: " + id;
	}
	
	@Transactional
	public Comment updateComment(Comment c) {
		Comment oldComment = commentRepository.findById(c.getId()).orElse(null);
		oldComment.setId(c.getId());
		oldComment.setCommentDate(c.getCommentDate());
		oldComment.setReceiverId(c.getReceiverId());
		oldComment.setSenderId(c.getSenderId());
		oldComment.setText(c.getText());
		return commentRepository.save(oldComment);
	}
}
