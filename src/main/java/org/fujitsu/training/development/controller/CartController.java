package org.fujitsu.training.development.controller;

import java.util.List;

import org.fujitsu.training.development.model.Cart;
import org.fujitsu.training.development.service.CartService;
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
@RequestMapping(path = "api/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping
	public List<Cart> showAllCart(){
		return cartService.getAllCart();
	}
	
	@GetMapping(path = "/{id}")
	public Cart showCart(@PathVariable Integer id) {
		return cartService.getCartById(id);
	}
	
	@PostMapping
	public Cart saveCart(@RequestBody Cart i) {
		return cartService.saveCart(i);
	}
	
	@PutMapping
	public Cart updateCart(@RequestBody Cart c) {
		return cartService.updateCart(c);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public String deleteCart(@PathVariable Integer id) {
		return cartService.deleteCart(id);
	}
}
