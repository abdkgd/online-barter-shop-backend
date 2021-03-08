package org.fujitsu.training.development.service;

import java.util.List;

import org.fujitsu.training.development.model.User;
import org.fujitsu.training.development.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
}
