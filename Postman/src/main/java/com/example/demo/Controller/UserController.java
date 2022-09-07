package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@GetMapping("/user/{name}")
	public String helloworld (@PathVariable String name) {
		return name;
	}
	
	public static void main(String args[]) {
		System.out.println("hi");
	}
}




