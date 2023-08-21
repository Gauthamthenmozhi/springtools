package com.example.demo.Application;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueApplication {
	@Value(value="${myName}")
	public String studentName;
	@Value(value="${age:18}")
	public int age;
	@Value(value="${std}")
	public String stdvalue;
	@GetMapping("display")
	public String displayStudent()
	{
		return "My name is " + studentName +" age is "+age+" currently studing:"+stdvalue;
	}

}
