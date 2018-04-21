package com.lilei.next1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;



@ServletComponentScan
@SpringBootApplication
public class App extends SpringBootServletInitializer {
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
	}

}
