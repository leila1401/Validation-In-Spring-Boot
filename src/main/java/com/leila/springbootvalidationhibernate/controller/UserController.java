package com.leila.springbootvalidationhibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leila.springbootvalidationhibernate.model.User;
import com.leila.springbootvalidationhibernate.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService us;
	
	
	@PostMapping("users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		return new ResponseEntity<User>(us.createUser(user), HttpStatus.CREATED);
	}

}
