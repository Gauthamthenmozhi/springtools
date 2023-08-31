package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Branch;

import com.example.demo.Service.branchservice;


@RestController
public class BranchController {
	 @Autowired
	 public branchservice mma;
	 @PostMapping("/postbank")
		public  String Branch (@RequestBody Branch ho)
		{
			mma.saveDetails(ho);
			return "Data saved";
		}
		@GetMapping("/getcust")
		public List<Branch>getrithick()
		{
			return mma.getDetails();
		}
	    //get all the data
		@GetMapping("/getbank")
		public List<Branch>getallRows()
		{
			return mma.getAllrows();
		}
	//get specific data
		@GetMapping("getAllbank/{d}/{id}")
		public List<Branch>getSpecRows(@PathVariable String d,@PathVariable int id)
		{
			return mma.getSpecrows(d,id);
		}
		//delete
		@DeleteMapping("deletebank/{id}")
		public String deleted(@PathVariable("id") int id)
		{
			return mma.deleteByid(id)+" rows dreleted";
		}
    //update
		@PutMapping("/updatedbank/{d}/{id}")
		public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
     {
     	return mma.updateRow(d,id)+" updated";
			
		}

   
    

}
