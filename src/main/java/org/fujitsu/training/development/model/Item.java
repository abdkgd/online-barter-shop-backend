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
@Table(name = "itemtbl")
@Entity(name = "itemtbl")
public class Item {

	@Id
	@SequenceGenerator(
			name = "itemtbl_seq",
			sequenceName = "itemtbl_seq",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "itemtbl_seq"
			)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "owner_id")
	private int ownerId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "description")
	private String description;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "category")
	private String category;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "location")
	private String location;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "status")
	private String status;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT)
	@Column(name = "price")
	private double price;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "is_tradeable")
	private String isTradeable;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "item_specification")
	private String itemSpecification;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "publish_date")
	private LocalDate publishDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "photo")
	private String photo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "receiver_id")
	private String receiverId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsTradeable() {
		return isTradeable;
	}

	public void setIsTradeable(String isTradeable) {
		this.isTradeable = isTradeable;
	}

	public String getItemSpecification() {
		return itemSpecification;
	}

	public void setItemSpecification(String itemSpecification) {
		this.itemSpecification = itemSpecification;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	
	
}
