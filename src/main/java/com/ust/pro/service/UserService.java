package com.ust.pro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pro.entity.User;
import com.ust.pro.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	public User registerUser(User user)
	{
		User userSaved = repository.save(user);
		return userSaved;
	}
	
	public User getUserByname(String name)  {
		
		return repository.findByName(name);
	}
}
