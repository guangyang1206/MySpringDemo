package com.epam.java.mentoring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Guang!";
	}
}
