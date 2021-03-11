package org.fujitsu.training.development.service;

import java.util.List;

import javax.transaction.Transactional;

import org.fujitsu.training.development.model.Cart;
import org.fujitsu.training.development.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	public List<Cart> getAllCart() {
		return cartRepository.findAll();
	}
	
	public Cart getCartById(Integer id) {
		return cartRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public Cart saveCart(Cart c){
		return cartRepository.save(c);
	}
	
	@Transactional
	public String deleteCart(Integer id) {
		cartRepository.deleteById(id);
		return "Cart Deleted: " + id;
	}
	
	@Transactional
	public Cart updateCart(Cart c) {
		Cart oldCart = cartRepository.findById(c.getId()).orElse(null);
		oldCart.setId(c.getId());
		oldCart.setAcceptTrade(c.getAcceptTrade());
		oldCart.setOwnerId(c.getOwnerId());
		oldCart.setOwnerItemId(c.getOwnerItemId());
		oldCart.setRequesterId(c.getRequesterId());
		oldCart.setRequesterItemId(c.getRequesterItemId());
		oldCart.setTransactionDate(c.getTransactionDate());
		return cartRepository.save(oldCart);
	}
}
