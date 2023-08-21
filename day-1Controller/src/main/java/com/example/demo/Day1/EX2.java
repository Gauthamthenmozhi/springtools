package com.example.demo.Day1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EX2 {
	@Value("Gautham")
	public String studentName;
	
	@RequestMapping("/display1")
	 public String getName()
	 {
		return "Welcome "+studentName+" !";
	 }

}
