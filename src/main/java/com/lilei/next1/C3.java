package com.lilei.next1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class C3 {

	@Autowired
	private User user;
	
	@RequestMapping("/c3/user1")
	public String getUser(){
		return user.toString();
	}
}
