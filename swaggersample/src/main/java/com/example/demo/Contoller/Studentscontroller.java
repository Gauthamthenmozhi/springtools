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

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/student")

public class Studentscontroller {

	@Autowired
	Studentsrepo sp;
	@PostMapping("/add")
	@Tag(name="Add Users", description= "Add users to database")
	public Studentsmodel get(@RequestBody Studentsmodel s)
	{
		return sp.save(s);
	}
	@GetMapping("/view")
	@Tag(name="Get Users", description= "Get all users from database")
	public List<Studentsmodel>getDetails()
	{
		return sp.findAll();
	}
	
}
