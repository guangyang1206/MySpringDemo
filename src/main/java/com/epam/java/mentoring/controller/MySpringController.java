package com.epam.java.mentoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.java.mentoring.entities.Accident;
import com.epam.java.mentoring.service.MySpringDemoService;

@RestController
public class MySpringController {

	@Autowired
	private MySpringDemoService mySpringDemoService;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Guang!";
	}

	@RequestMapping("/findAccident")
	public Accident findAccidentByIndex(String accidentId) {
		return mySpringDemoService.findAccidentByIndex(accidentId);
	}
}
