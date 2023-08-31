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


import com.example.demo.Model.Customer;

import com.example.demo.Service.cusservice;


@RestController

public class Customercontroller {
	 @Autowired
	 public cusservice mmn;
	  //  private Customerrepo customerRepository;

	   // @PostMapping("/post")
	  //  public Customer createCustomer(@RequestBody Customer customer) {
	   //     return customerRepository.save(customer);
	  //  }
	  //  @GetMapping("/get")
	  //  public List<Customer> getAllCustomers() {
	  //      return customerRepository.findAll();
	  //  }
	 @PostMapping("/postcust")
		public  String Customer (@RequestBody Customer hz)
		{
			mmn.saveDetails(hz);
			return "Data saved";
		}
		@GetMapping("/getcustomer")
		public List<Customer>getrithick()
		{
			return mmn.getDetails();
		}
	    //get all the data
  		@GetMapping("/getval")
  		public List<Customer>getallRows()
  		{
  			return mmn.getAllrows();
  		}
  	//get specific data
		@GetMapping("getAllval/{d}/{id}")
		public List<Customer>getSpecRows(@PathVariable String d,@PathVariable int id)
		{
			return mmn.getSpecrows(d,id);
		}
		//delete
		@DeleteMapping("deletehn/{id}")
		public String deleted(@PathVariable("id") int id)
		{
			return mmn.deleteByid(id)+" rows dreleted";
		}
       //update
		@PutMapping("/updateds/{d}/{id}")
		public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
        {
        	return mmn.updateRow(d,id)+" updated";
			
		}
		//Sorting by Asc
				@GetMapping("/sortAsc")
				public List<Customer> sortByAsc(@RequestParam ("name") String name)
				{
					return mmn.sortAsc(name);
				}
				
				//Sorting by Des
				@GetMapping("/sortDes")
				public List<Customer> sortByDes(@RequestParam ("name") String name)
				{
					return mmn.sortDes(name);
				}
				
				//pagination
				@GetMapping("pagination/{num}/{size}")
				public List<Customer> paginationDetails(@PathVariable("num") int num, @PathVariable("size") int size)
				{
					return mmn.pagination(num, size);
				}
				
				//pagination and sorting
				@GetMapping("pagination/{num}/{size}/{name}")
				public List<Customer> paginationSortingDetails(@PathVariable("num") int num, @PathVariable("size") int size,@PathVariable("name") String name)
				{
					return mmn.paginationSorting(num, size, name);
				}



}
