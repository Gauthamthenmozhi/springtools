package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.Account;

import com.example.demo.Service.accountservice;



@RestController

public class AccountController {
	  @Autowired
	  public accountservice mms;
	  @PostMapping("/postaccount")
		public  String Account (@RequestBody Account hs)
		{
			mms.saveDetails(hs);
			return "Data saved";
		}
		@GetMapping("/getaccount")
		public List<Account>getrithick()
		{
			return mms.getDetails();
		}
	  
	  		@GetMapping("/getaccountdet")
	  		public List<Account>getallRows()
	  		{
	  			return mms.getAllrows();
	  		}
	  	//get specific data
			@GetMapping("getdet/{d}/{id}")
			public List<Account>getSpecRows(@PathVariable String d,@PathVariable int id)
			{
				return mms.getSpecrows(d,id);
			}
			//delete
			@DeleteMapping("deletevalue/{id}")
			public String deleted(@PathVariable("id") int id)
			{
				return mms.deleteByid(id)+" rows dreleted";
			}
	       //update
			@PutMapping("/updatevalue/{d}/{id}")
			public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
	        {
	        	return mms.updateRow(d,id)+" updated";
				
			}
			//Sorting by Asc
			@GetMapping("/sortgau")
			public List<Account> sortByAsc(@RequestParam ("name") String name)
			{
				return mms.sortAsc(name);
			}
			
			//Sorting by Des
			@GetMapping("/sortgautha")
			public List<Account> sortByDes(@RequestParam ("name") String name)
			{
				return mms.sortDes(name);
			}
			
			//pagination
			@GetMapping("paginationss/{num}/{size}")
			public List<Account> paginationDetails(@PathVariable("num") int num, @PathVariable("size") int size)
			{
				return mms.pagination(num, size);
			}
			
			//pagination and sorting
			@GetMapping("paginationsa/{num}/{size}/{name}")
			public List<Account> paginationSortingDetails(@PathVariable("num") int num, @PathVariable("size") int size,@PathVariable("name") String name)
			{
				return mms.paginationSorting(num, size, name);
			}



}
