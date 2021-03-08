package org.fujitsu.training.development.service;

import java.util.List;

import org.fujitsu.training.development.model.Item;
import org.fujitsu.training.development.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItem() {
		return itemRepository.findAll();
	}
}
