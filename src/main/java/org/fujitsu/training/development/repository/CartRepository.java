package org.fujitsu.training.development.repository;

import org.fujitsu.training.development.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
