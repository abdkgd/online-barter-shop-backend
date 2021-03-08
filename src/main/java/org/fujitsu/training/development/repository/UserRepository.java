package org.fujitsu.training.development.repository;

import java.util.List;

import org.fujitsu.training.development.DTO.LoginResponse;
import org.fujitsu.training.development.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select new org.fujitsu.training.development.DTO.LoginResponse(u.username, u.password) from usertbl as u")
	List<LoginResponse> getUsernameAndPassword();
}
