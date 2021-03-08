package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Messages;
import org.fujitsu.training.development.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping
	public List<Messages> showAllItem(){
		return messageService.getAllMessage();
	}
}
