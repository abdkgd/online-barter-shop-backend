package org.fujitsu.training.development.model;

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
@Table(name = "usertbl")
@Entity(name = "usertbl")
public class User {
	
	@Id
	@SequenceGenerator(
			name = "usertbl_seq",
			sequenceName = "usertbl_seq",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "usertbl_seq"
			)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
		
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "username")
	private String username;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "password")
	private String password;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "firstname")
	private String firstname;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "lastname")
	private String lastname;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "email")
	private String email;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "rating")
	private int rating;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "nrating")
	private int nrating;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "profile_photo")
	private String profilePhoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	
	public int getNrating() {
		return nrating;
	}

	public void setNrating(int nrating) {
		this.nrating = nrating;
	}
	
//	@JsonFormat(shape = JsonFormat.Shape.ANY)
//	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "owner_id", referencedColumnName = "id")
//	private List<Item> items;
	
//	@JsonFormat(shape = JsonFormat.Shape.ANY)
//	@OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "sender_id", referencedColumnName = "id")
//	private List<Comment> comments;
	
//	@JsonFormat(shape = JsonFormat.Shape.ANY)
//	@OneToMany(targetEntity = Messages.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "sender_id", referencedColumnName = "id")
//	private List<Messages> messages;
	
//	@JsonFormat(shape = JsonFormat.Shape.ANY)
//	@OneToMany(targetEntity = FavItem.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "item_id", referencedColumnName = "id")
//	private List<FavItem> favItems;
	
//	@JsonFormat(shape = JsonFormat.Shape.ANY)
//	@OneToMany(targetEntity = FavOwner.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "owner_id", referencedColumnName = "id")
//	private List<FavOwner> favOwners;
}
