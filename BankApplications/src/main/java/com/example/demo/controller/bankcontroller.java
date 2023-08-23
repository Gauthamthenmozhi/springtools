package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.bankingmodel;
import com.example.demo.service.bankservice;
@RestController
public class bankcontroller {
	@Autowired
	public bankservice mmm;
	@PostMapping("/postbank")
	public  String bankingmodel (@RequestBody bankingmodel h)
	{
		mmm.saveDetails(h);
		return "Data Saved";
	}
	@GetMapping("/getbank")
	public List<bankingmodel>getprabhu()
	{
		return mmm.getDetails();
	}
	@PutMapping("/updatebank")
	public bankingmodel updateprabhu(@RequestBody bankingmodel haa)
	{
		return mmm.updateDetails(haa);
	}
	//delete by path variable
		@DeleteMapping("/deletebank/{id}")
		public String removeprabhu(@PathVariable("id") int hid)
		{
			mmm.deleteDetails(hid);
			return "Bank with Id"+hid+"is deleted";
		}
		//delete mapping using request parm
		@DeleteMapping("/byrepparm")
		public String removedByRequestpam(@RequestParam("id") int id)
		{
			mmm.deleteDetails(id);
			return "Bank with Id "+id+" is deleted";
		}
		//getuserById
		@GetMapping("/users/{userId}")
		public ResponseEntity<?>getUserId(@PathVariable int userId)
		{
		Optional<bankingmodel>hotel=mmm.getUserId(userId);
		if(hotel!=null) {
			return ResponseEntity.ok(hotel); //return the users data if available
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");
			
		}
		@DeleteMapping("/deletebankif/{id}")
		public ResponseEntity<String>deletebankinfo(@PathVariable int id)
		{
			boolean deleted=mmm.deletebankinfo(id);
			if(deleted)
			{
				return ResponseEntity.ok("Bank with ID "+ id +" deleted successfully");
			}
			else
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Bank with ID "+ id +" not found");
			}
		}
		@PutMapping("/upbankInfo/{id}")
		public ResponseEntity<String> updateStudDetails(@PathVariable int id)
		{
			boolean updated = mmm.updateStudInfo(id);
			if(updated)
			{
				return ResponseEntity.ok("Bank with Id "+id+" updated successfully");
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Bank with Id "+id+" not found");
			}
		}
		
	}  


