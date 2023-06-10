package com.gopal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to PNB....!!";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		
		return "Successfull transfer";
			
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		
		return "check Balance";
	}
	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		
		return "aboutUs";
		
	}
	
	
}
