package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

import org.fujitsu.training.development.model.Messages;
import org.fujitsu.training.development.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	public List<Messages> getAllMessage() {
		return messageRepository.findAll();
	}
	
	public Messages getMessageById(Integer id) {
		return messageRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public Messages saveMessage(Messages m){
		return messageRepository.save(m);
	}
	
	@Transactional
	public List<Messages> saveAllMessage(List<Messages> m){
		return messageRepository.saveAll(m);
	}
	
	@Transactional
	public String deleteMessage(Integer id) {
		messageRepository.deleteById(id);
		return "Message Deleted: " + id;
	}
	
	@Transactional
	public Messages updateMessage(Messages m) {
		Messages oldMessage = messageRepository.findById(m.getId()).orElse(null);
		oldMessage.setId(m.getId());
		oldMessage.setMessageDate(m.getMessageDate());
		oldMessage.setReceiverId(m.getReceiverId());
		oldMessage.setText(m.getText());
		oldMessage.setNotification(m.getNotification());
		return messageRepository.save(oldMessage);
	}
}
