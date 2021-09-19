package com.ibm.training.spring.boot.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.spring.boot.mongodb.domain.Users;
import com.ibm.training.spring.boot.mongodb.service.UsersService;

@RestController
public class AppController {

	@Autowired
	private UsersService service;
	
	@GetMapping(value="/users",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers(){
		
      return service.fetchAllUsers();
	}
}
