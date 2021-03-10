package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

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
	
	public Item getItemById(Integer id) {
		return itemRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public Item saveItem(Item i){
		return itemRepository.save(i);
	}
	
	@Transactional
	public List<Item> saveAllItem(List<Item> i){
		return itemRepository.saveAll(i);
	}
	
	@Transactional
	public String deleteItem(Integer id) {
		itemRepository.deleteById(id);
		return "Item Deleted: " + id;
	}
	
	@Transactional
	public Item updateItem(Item i) {
		Item oldItem = itemRepository.findById(i.getId()).orElse(null);
		oldItem.setId(i.getId());
		oldItem.setCategory(i.getCategory());
		oldItem.setDescription(i.getDescription());
		oldItem.setIsTradeable(i.getIsTradeable());
		oldItem.setItemSpecification(i.getItemSpecification());
		oldItem.setLocation(i.getLocation());
		oldItem.setOwnerId(i.getOwnerId());
		oldItem.setPrice(i.getPrice());
		oldItem.setPublishDate(i.getPublishDate());
		oldItem.setStatus(i.getStatus());
		oldItem.setPhoto(i.getPhoto());
		return itemRepository.save(oldItem);
	}
}
