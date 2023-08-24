package com.example.demo.Day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Day6.model.iplmodel;
import com.example.demo.Day6.service.iplservice;


@RestController
public class iplcontroller {
	@Autowired
	public iplservice gf;
	@PostMapping("/postipl")
	public String iplmodel(@RequestBody iplmodel hc)
	{
		gf.saveDetails(hc);
		return "Data Saved";
	}
	@GetMapping("/getipl")
	public List<iplmodel>getprabhu()
	{
		return gf.getDetails();
	}
	

}
