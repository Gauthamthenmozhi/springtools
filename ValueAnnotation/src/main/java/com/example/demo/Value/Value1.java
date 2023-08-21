package com.example.demo.Value;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Value1 {
	@Value("121")
	public int regnum;
	@Value("Gautham")
	public String name;
	@RequestMapping("/display")
	
	public String display()
	{
		return"My name is " + name +" Reg number is " +regnum;
	}
	

}
