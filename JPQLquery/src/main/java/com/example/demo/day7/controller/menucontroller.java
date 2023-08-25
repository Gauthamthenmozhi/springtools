package com.example.demo.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.day7.model.menumodel;
import com.example.demo.day7.service.menuservice;

@RestController
public class menucontroller {
	@Autowired
	public menuservice mm;
	
	//get all the data
		@GetMapping("/getAllrows")
		public List<menumodel>getallRows()
		{
			return mm.getAllrows();
		}
		//get specific data
		@GetMapping("getAllrowss/{d}/{p}")
		public List<menumodel>getSpecRows(@PathVariable String d,@PathVariable String p)
		{
			return mm.getSpecrows(d,p);
		}
		//delete
		@DeleteMapping("deleterow/{id}")
		public String deleted(@PathVariable("id") int id)
		{
			return mm.deleteByid(id)+" rows dreleted";
		}
       //update
		@PutMapping("/update/{d}/{id}")
		public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
        {
        	return mm.updateRow(d,id)+" updated";
			
		}
		//same name
		@GetMapping("/likeAllrows/{d}")
		public List<menumodel>getbyname(@PathVariable("d") String d)
		{
			return mm.getbyName(d);
		}
		//using model query
		@GetMapping("/get/{name}")
		public List<menumodel>getByname(@PathVariable("name") String name)
		{
			return mm.getBynamemodel(name);
		}
		//using modeid
		@DeleteMapping("/thala/{id}")
		public String gautham (@PathVariable("id") int id)
		{
		return mm.getBymodelid(id)+" Deleted";
		}
		@GetMapping("/row")
		public List<menumodel>getrowsss()
		{
			return mm.getrow();
		}
}
