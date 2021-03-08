package org.fujitsu.training.development.model;

import java.time.LocalDate;

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
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "messagetbl")
@Entity(name = "messagetbl")
public class Messages {

	@Id
	@SequenceGenerator(
			name = "messagetbl_seq",
			sequenceName = "messagetbl_seq",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "messagetbl_seq"
			)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "text")
	private String text;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "message_date")
	private LocalDate messageDate;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "receiver_id")
	private int receiverId;

	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "sender_id")
	private int senderId;
	
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

	public LocalDate getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(LocalDate messageDate) {
		this.messageDate = messageDate;
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
