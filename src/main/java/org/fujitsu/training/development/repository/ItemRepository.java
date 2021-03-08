package org.fujitsu.training.development.repository;

import org.fujitsu.training.development.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
