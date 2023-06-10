package com.gopal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to Gopalraj Mishra";
		
	}
	
	
}
