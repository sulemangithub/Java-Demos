package org.cloud.example.cloudapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/CloudApp/api/login")
	public String login()
	{
		return "Login successful";
	}
	
	
}
