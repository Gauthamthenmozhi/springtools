package com.example.Day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day4.model.Collegedetails;
import com.example.Day4.reporitory.Collegerep;

@Service
public class collegeservice {
	@Autowired
	public Collegerep college;
	//post the data
	public Collegedetails saveDetails(Collegedetails c)
	{
		return college.save(c);
	}
	//get the data
	public List<Collegedetails> getDetails()
	{
		return college.findAll();
	}

}
