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
	
//	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
//	@Column(name = "owner_id")
//	private int ownerId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "description")
	private String description;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "photos")
	private String photos;
	
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
	private LocalDateTime publishDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "tade_end_data")
	private LocalDateTime tradeEndDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM dd, yyyy")
	@Column(name = "update_date")
	private LocalDateTime updateDate;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "receiver_id")
	private int receiverId;
	
}
