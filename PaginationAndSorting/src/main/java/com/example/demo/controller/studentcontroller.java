package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.studentmodel;
import com.example.demo.service.studentservice;

@RestController
public class studentcontroller {
	@Autowired
	public studentservice mmm;
	@PostMapping("/poststudent")
	public  String studentmodel (@RequestBody studentmodel h)
	{
		mmm.saveDetails(h);
		return "Data Saved";
	}
	//sort by asc
	
			@GetMapping("/sortAsc/{name}")
			public List<studentmodel>sortAsc(@PathVariable("name") String name)
			{
				return mmm.sortByAsc(name);
			}
			
	//sort by des
			
			@GetMapping("/sortDes/{name}")
			public List<studentmodel>sortDes(@PathVariable("name") String name)
			{
				return mmm.sortByDes(name);
			}
		//pagination
			@GetMapping("/pagination/{num}/{size}")
			public List<studentmodel>paginationEx(@PathVariable("num") int num,@PathVariable("size") int size)
			{
				return mmm.pagination(num, size);
			}
			//pagination and sorting
			@GetMapping("/paginations/{num}/{size}/{name}")
			public List<studentmodel>paginationAndsorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name)
			{
				return mmm.paginationAndSortings(num, size, name);
			}
			

}
