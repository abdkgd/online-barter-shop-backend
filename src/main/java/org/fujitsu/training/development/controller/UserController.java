package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.User;
import org.fujitsu.training.development.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
