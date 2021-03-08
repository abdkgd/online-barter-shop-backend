package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

import org.fujitsu.training.development.DTO.LoginResponse;
import org.fujitsu.training.development.model.User;
import org.fujitsu.training.development.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	public User getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public User saveUser(User u){
		return userRepository.save(u);
	}
	
	@Transactional
	public List<User> saveAllUser(List<User> u){
		return userRepository.saveAll(u);
	}
	
	@Transactional
	public String deleteUser(Integer id) {
		userRepository.deleteById(id);
		return "User Deleted: " + id;
	}
	
	@Transactional
	public User updateUser(User u) {
		User oldUser = userRepository.findById(u.getId()).orElse(null);
		oldUser.setId(u.getId());
		oldUser.setEmail(u.getEmail());
		oldUser.setFirstname(u.getFirstname());
		oldUser.setLastname(u.getLastname());
		oldUser.setPassword(u.getPassword());
		oldUser.setPhoneNumber(u.getPhoneNumber());
		oldUser.setProfilePhoto(u.getProfilePhoto());
		oldUser.setRating(u.getRating());
		oldUser.setUsername(u.getUsername());
		return userRepository.save(oldUser);
	}
	
	@GetMapping
	public List<LoginResponse> getCheckUsername(){
		return userRepository.getUsername();
	}
}
