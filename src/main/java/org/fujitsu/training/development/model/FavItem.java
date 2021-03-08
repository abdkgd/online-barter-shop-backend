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
@Table(name = "fav_item")
@Entity(name = "fav_item")
public class FavItem {
	
	@Id
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private int id;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	@Column(name = "fav_item_id")
	private int favItemId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFavItemId() {
		return favItemId;
	}

	public void setFavItemId(int favItemId) {
		this.favItemId = favItemId;
	}
	
	
}
