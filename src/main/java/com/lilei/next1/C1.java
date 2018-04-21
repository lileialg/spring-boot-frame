package com.lilei.next1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class C1 {

	private static final Logger logger = LoggerFactory.getLogger(C1.class);
	
	@Autowired
	private User user;
	
	@Value("${param1}")
	private String param1;
	
	@Value("${param2}")
	private String param2;
	
	@RequestMapping("/get")
	public String get(){
		logger.info("iiiiiiiiiiii");
		logger.error("eeeeeeee");
		logger.warn("wwwwwwwwwwwwwww");
		logger.debug("ddddddddddddddddddddddddd");
		logger.trace("ttttttttttttttttt");
		
		return "hello";
	}
	
	@RequestMapping("/user1")
	public String getUser(){
		return user.toString();
	}
	
	
	@RequestMapping("/param1")
	public String param1(){
		return param1 + " "+ param2;
	}
}
