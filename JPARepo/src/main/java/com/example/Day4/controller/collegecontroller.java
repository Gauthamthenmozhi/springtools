package com.example.Day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day4.model.Collegedetails;
import com.example.Day4.service.collegeservice;

@RestController
public class collegecontroller {
	@Autowired
     public collegeservice cs;
 @PostMapping("/postcollege")
	public Collegedetails savegautham(@RequestBody Collegedetails pb) 
	{
		return cs.saveDetails(pb);
	}
	@GetMapping("/getcollege")
	public List<Collegedetails> getgautham()
	{
		return cs.getDetails();
	}
}
