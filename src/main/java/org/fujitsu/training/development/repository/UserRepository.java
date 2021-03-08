package org.fujitsu.training.development.repository;

import org.fujitsu.training.development.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
