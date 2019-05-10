package com.mphasis.griffin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.mphasis.griffin.dao.UserSignInDao;
import com.mphasis.griffin.entities.SignIn;
import com.mphasis.griffin.service.UserSignInService;

public class UserController {
	
	@Autowired
	UserSignInService userService;
	
	@RequestMapping(value = "/login/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody SignIn user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getEmail());
  
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/login/{id}").buildAndExpand(user.getEmail()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
}
