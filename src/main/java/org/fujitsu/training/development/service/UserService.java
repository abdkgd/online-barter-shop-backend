package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

import org.fujitsu.training.development.DTO.LoginResponse;
import org.fujitsu.training.development.DTO.UsernameResponse;
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
	
	public User getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User getUserByName(String name) {
		return userRepository.findByUsername(name);
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
		oldUser.setUsername(u.getUsername());
		oldUser.setRating(u.getRating());
		oldUser.setNrating(u.getNrating());
		return userRepository.save(oldUser);
	}
	
	public List<UsernameResponse> getCheckUsername(){
		return userRepository.getUsername();
	}
	
	public Boolean getLogin(LoginResponse incoming){
		List<LoginResponse> accounts = userRepository.getUsernameAndPassword();
		for (LoginResponse loginAccounts : accounts) {
			if(loginAccounts.getUsername().equals(incoming.getUsername()) && loginAccounts.getPassword().equals(incoming.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
