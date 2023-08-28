package com.example.demo.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Studentsmodel;
import com.example.demo.Repository.Studentsrepo;


@RestController
@RequestMapping("/student")

public class Studentscontroller {

	@Autowired
	Studentsrepo sp;
	@PostMapping("/add")
	public Studentsmodel get(@RequestBody Studentsmodel s)
	{
		return sp.save(s);
	}
	@GetMapping("/view")
	public List<Studentsmodel>getDetails()
	{
		return sp.findAll();
	}
	
}
