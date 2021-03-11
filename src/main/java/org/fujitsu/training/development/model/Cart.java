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
@Table(name = "carttbl")
@Entity(name = "carttbl")
public class Cart {

	@Id
	@SequenceGenerator(
			name = "carttbl_seq",
			sequenceName = "carttbl_seq",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "carttbl_seq"
			)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "request_id")
	private int requesterId;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "owner_id")
	private int ownerId;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "requester_item_id")
	private int requesterItemId;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "owner_item_id")
	private int ownerItemId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "accept_trade")
	private String acceptTrade;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "transaction_date")
	private LocalDate transactionDate;

	public Cart() {
	}
	
	public Cart(int id, int requesterId, int ownerId, int requesterItemId, int ownerItemId, String acceptTrade, LocalDate transactionDate) {
		this.id = id;
		this.requesterId = requesterId;
		this.ownerId = ownerId;
		this.requesterItemId = requesterItemId;
		this.ownerItemId = ownerItemId;
		this.acceptTrade = acceptTrade;
		this.transactionDate = transactionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(int requesterId) {
		this.requesterId = requesterId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getRequesterItemId() {
		return requesterItemId;
	}

	public void setRequesterItemId(int requesterItemId) {
		this.requesterItemId = requesterItemId;
	}

	public int getOwnerItemId() {
		return ownerItemId;
	}

	public void setOwnerItemId(int ownerItemId) {
		this.ownerItemId = ownerItemId;
	}

	public String getAcceptTrade() {
		return acceptTrade;
	}

	public void setAcceptTrade(String acceptTrade) {
		this.acceptTrade = acceptTrade;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
}
