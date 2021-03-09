package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.DTO.LoginResponse;
import org.fujitsu.training.development.DTO.UsernameResponse;
import org.fujitsu.training.development.model.User;
import org.fujitsu.training.development.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> showAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping(path = "/usernames")
	public List<UsernameResponse> showUsername(){
		return userService.getCheckUsername();
	}
	
	@GetMapping(path = "/{id}")
	public User showUser(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	
	/*
	 * Transactional
	 * 
	 */
	@PostMapping(path = "/validate/login")
	public Integer validateLogin(@RequestBody LoginResponse l) {
		boolean isValid = userService.getLogin(l);
		if(isValid) {
			User logginIn = userService.getUserByName(l.getUsername());
			return logginIn.getId();
		}
		return -1;
	}
	
	@PostMapping
	public User saveUser(@RequestBody User u) {
		return userService.saveUser(u);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User u) {
		return userService.updateUser(u);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteUser(@PathVariable Integer id) {
		return userService.deleteUser(id);
	}
	
	
}
