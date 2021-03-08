package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Item;
import org.fujitsu.training.development.service.ItemService;
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
@RequestMapping(path = "api/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> showAllItem(){
		return itemService.getAllItem();
	}
	
	@GetMapping(path = "/{id}")
	public Item showItem(@PathVariable Integer id) {
		return itemService.getItemById(id);
	}
	
	@PostMapping
	public Item saveItem(@RequestBody Item i) {
		return itemService.saveItem(i);
	}
	
	@PutMapping
	public Item updateItem(@RequestBody Item i) {
		return itemService.updateItem(i);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteItem(@PathVariable Integer id) {
		return itemService.deleteItem(id);
	}
}
