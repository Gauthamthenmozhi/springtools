package com.example.demo.Day1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EX1 {
	public String message;
	@RequestMapping("/display")
	
	public String Welcome()
	{
		return "Welcome";
	}

}
