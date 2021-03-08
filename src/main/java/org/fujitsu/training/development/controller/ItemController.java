package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Item;
import org.fujitsu.training.development.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
