package org.fujitsu.training.development.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "commenttbl")
@Entity(name = "commenttbl")
public class Comment {

	@Id
	@SequenceGenerator(
			name = "commenttbl_seq",
			sequenceName = "usertbl_seq",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "commenttbl_seq"
			)
	@Column(name = "id")
	private int id;
	@Column(name = "text")
	private String text;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "comment_date")
	private LocalDateTime commentDate;
	@Column(name = "receiver_id")
	private int receiverId;
	@Column(name = "sender_id")
	private int senderId;

	public Comment() {
	}

	public Comment(int id, String text, LocalDateTime commentDate, int receiverId, int senderId) {
		this.id = id;
		this.text = text;
		this.commentDate = commentDate;
		this.receiverId = receiverId;
		this.senderId = senderId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(LocalDateTime commentDate) {
		this.commentDate = commentDate;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	
	
	
}
