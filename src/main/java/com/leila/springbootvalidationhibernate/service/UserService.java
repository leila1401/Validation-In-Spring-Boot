package com.leila.springbootvalidationhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leila.springbootvalidationhibernate.UserRepository;
import com.leila.springbootvalidationhibernate.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	
	public User createUser(User user) {
		return ur.save(user);
	}

}
