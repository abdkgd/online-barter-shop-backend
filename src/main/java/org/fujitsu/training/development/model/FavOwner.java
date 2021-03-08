package org.fujitsu.training.development.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "fav_owner")
@Entity(name = "fav_owner")
public class FavOwner {

	@Id
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "fav_owner_id")
	private int favOwnerId;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "owner_id")
	private int ownerId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFavOwnerId() {
		return favOwnerId;
	}

	public void setFavOwnerId(int favOwnerId) {
		this.favOwnerId = favOwnerId;
	}
	
	
}
