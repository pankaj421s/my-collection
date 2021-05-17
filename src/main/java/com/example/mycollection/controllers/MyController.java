package com.example.mycollection.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	public String sayHello()
	{
		return "Hello,  This is me";
	}
	

}
