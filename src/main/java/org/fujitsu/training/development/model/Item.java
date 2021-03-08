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
	private int id;
	@Column(name = "owner_id")
	private int ownerId;
	@Column(name = "description")
	private String description;
	@Column(name = "photos")
	private String photos;
	@Column(name = "category")
	private String category;
	@Column(name = "location")
	private String location;
	@Column(name = "status")
	private String status;
	@Column(name = "price")
	private double price;
	@Column(name = "is_tradeable")
	private String isTradeable;
	@Column(name = "item_specification")
	private String itemSpecification;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "publish_date")
	private LocalDateTime publishDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "tade_end_data")
	private LocalDateTime tradeEndDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "update_date")
	private LocalDateTime updateDate;
	@Column(name = "receiver_id")
	private int receiverId;
	
	public Item() {
	}

	public Item(int id, int ownerId, String description, String photos, String category, String location, String status,
			double price, String isTradeable, String itemSpecification, LocalDateTime publishDate,
			LocalDateTime tradeEndDate, LocalDateTime updateDate, int receiverId) {
		this.id = id;
		this.ownerId = ownerId;
		this.description = description;
		this.photos = photos;
		this.category = category;
		this.location = location;
		this.status = status;
		this.price = price;
		this.isTradeable = isTradeable;
		this.itemSpecification = itemSpecification;
		this.publishDate = publishDate;
		this.tradeEndDate = tradeEndDate;
		this.updateDate = updateDate;
		this.receiverId = receiverId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
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

	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}

	public LocalDateTime getTradeEndDate() {
		return tradeEndDate;
	}

	public void setTradeEndDate(LocalDateTime tradeEndDate) {
		this.tradeEndDate = tradeEndDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	
	
}
