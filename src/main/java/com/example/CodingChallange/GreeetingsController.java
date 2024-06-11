package com.example.CodingChallange;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeetingsController {

	@GetMapping("/greetings") 
	public String greetings() {

		return "Hello,Good Morning,how are you";

	}

}
