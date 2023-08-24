package com.example.demo.Day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Day6.Repository.iplrepo;
import com.example.demo.Day6.model.iplmodel;


@Service
public class iplservice {
	@Autowired
	public iplrepo hpo;
	//post the data
	public iplmodel saveDetails(iplmodel hr)
	{
		return hpo.save(hr);
	}
	//get the data
	public List<iplmodel>getDetails()
	{
		return hpo.findAll();
	}

}
