package com.example.demo.Day1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EX3 {
	@Value("Yellow")
	public String favColor;
	
	@GetMapping("/display2")
	public String getFavColor()
	{
		return "My Favourite color is "+favColor;
	}

}
