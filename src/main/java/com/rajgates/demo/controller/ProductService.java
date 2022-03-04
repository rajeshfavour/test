package com.rajgates.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {
	
	@GetMapping("/welcome") 
	public String getWelcomeMessage() {
		return "Welcome to some Sample";
	}
	

}
