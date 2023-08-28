package com.example.demo.day8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day8.Repository.Studentrepo;
import com.example.demo.day8.model.Studentmodel;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
	
	@Autowired
	Studentrepo sp;
	@PostMapping("/add")
	public Studentmodel get(@RequestBody Studentmodel s)
	{
		return sp.save(s);
	}
	@GetMapping("/view")
	public List<Studentmodel>getDetails()
	{
		return sp.findAll();
	}
	//@DeleteMapping("/{id}")
	//public String deleteStudent(@PathVariable int id)
	//{
	//	return sp.dele
	//}
	

}
