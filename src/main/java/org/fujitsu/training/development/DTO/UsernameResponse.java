package org.fujitsu.training.development.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("unused")
public class UsernameResponse {

	private String usernames;

	public UsernameResponse(String usernames) {
		this.usernames = usernames;
	}

	public String getUsernames() {
		return usernames;
	}

	public void setUsernames(String usernames) {
		this.usernames = usernames;
	}
}
