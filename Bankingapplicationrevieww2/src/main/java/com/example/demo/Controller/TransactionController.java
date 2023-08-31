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


import com.example.demo.Model.Transcation;

import com.example.demo.Service.transservice;



@RestController

public class TransactionController {
	 @Autowired
	 public transservice mq;
	   // private Transcationrepo transactionRepository;

	   // @PostMapping("/postt")
	  //  public Transcation createTransaction(@RequestBody Transcation transaction) {
	   //     return transactionRepository.save(transaction);
	  //  }


	  //  @GetMapping("/gett")
	  //  public List<Transcation> getAllTransactions() {
	       // return transactionRepository.findAll();
	  //  }
	 @PostMapping("/posttrans")
		public  String Transcation (@RequestBody Transcation hx)
		{
			mq.saveDetails(hx);
			return "Data saved";
		}
		@GetMapping("/gettrans")
		public List<Transcation>getrithick()
		{
			return mq.getDetails();
		}
	    
	    //get all the data
  		@GetMapping("/getjk")
  		public List<Transcation>getallRows()
  		{
  			return mq.getAllrows();
  		}
  	//get specific data
		@GetMapping("getkl/{d}/{id}")
		public List<Transcation>getSpecRows(@PathVariable String d,@PathVariable int id)
		{
			return mq.getSpecrows(d,id);
		}
		//delete
		@DeleteMapping("deletegh/{id}")
		public String deleted(@PathVariable("id") int id)
		{
			return mq.deleteByid(id)+" rows dreleted";
		}
       //update
		@PutMapping("/updatenb/{d}/{id}")
		public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
        {
        	return mq.updateRow(d,id)+" updated";
			
		}


}
