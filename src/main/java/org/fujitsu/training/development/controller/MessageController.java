package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Messages;
import org.fujitsu.training.development.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path = "/{id}")
	public Messages showMessage(@PathVariable Integer id) {
		return messageService.getMessageById(id);
	}
	
	@PostMapping
	public Messages saveMessage(@RequestBody Messages m) {
		return messageService.saveMessage(m);
	}
	
	@PutMapping
	public Messages updateMessage(@RequestBody Messages m) {
		return messageService.updateMessage(m);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteMessage(@PathVariable Integer id) {
		return messageService.deleteMessage(id);
	}
}
