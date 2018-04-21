package com.lilei.next1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class C2 {

	@RequestMapping("/page1")
	public String page1(){
		return "page1";
	}
	

}
