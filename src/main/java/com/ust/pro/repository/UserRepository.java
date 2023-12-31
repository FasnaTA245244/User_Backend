package com.ust.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.pro.entity.User;

//import com.ust.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

//	public List<User> findByUsernameAndPassword(String username, String password);
	public User findByName(String name);
	
}