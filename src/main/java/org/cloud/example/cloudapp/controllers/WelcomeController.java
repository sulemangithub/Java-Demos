package org.cloud.example.cloudapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/CloudApp/api/welcome")
	public String welcome()
	{
		return "Welcome to AWS Cloud";
	}
	
	
}
