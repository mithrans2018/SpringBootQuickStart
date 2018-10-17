package com.example.bein.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	@PostMapping("/hello")
	public String greet(){
		return "Hello from me";
	}
}
