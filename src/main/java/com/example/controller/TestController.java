package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/api/{status}")
	public String getStatus(@PathVariable String status) {
		if ("success".equalsIgnoreCase(status)) {
			return "success";
		} else {
			return "fail";
		}
	}
	
	@PostMapping("/api/{status}")
	public String postStatus(@PathVariable String status) {
		if ("success".equalsIgnoreCase(status)) {
			return "success";
		} else {
			return "fail";
		}
	}

}
