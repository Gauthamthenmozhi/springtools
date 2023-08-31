package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.Model.Customer;

import com.example.demo.Repository.Customerrepo;


@Service
public class cusservice {
	@Autowired
	public Customerrepo mrr;
	//post the data
		public Customer saveDetails(Customer hmm)
		{
			return mrr.save(hmm);
		}
		//get the data
		public List<Customer>getDetails()
		{
			return mrr.findAll();
		}
	//get all the data
	   
	   public List<Customer>getAllrows()
	   {
		   return mrr.getAllRows();
	   }
	   
	   //get specfic data
	    public List<Customer>getSpecrows(String d,int id)
	    {
	 	   return mrr.getSpecRows(d,id);
	    }  
	    
	  //update
	    public Integer updateRow(String d,int id)
	    {
	    	return mrr.updateById(d, id);
	    }
	    

         //delete the data
          public int deleteByid(int id)
          {
         	return mrr.deleted(id);
             }
          
        //sorting (ascending)
  		public List<Customer> sortAsc(String name)
  		{
  			return mrr.findAll(Sort.by(name));
  		}
  		
  		//sorting (descending)
  		public List<Customer> sortDes(String name)
  		{
  			return mrr.findAll(Sort.by(name).descending());
  		}
  		
  		//pagination
  		public List<Customer> pagination(int pageNum,int pageSize)
  		{
  			Page<Customer> cus=mrr.findAll(PageRequest.of(pageNum, pageSize));
  			return cus.getContent();
  		}
  		
  		//pagination and sorting
  		public List<Customer> paginationSorting(int pageNum,int pageSize,String name)
  		{
  			Page<Customer> cus=mrr.findAll(PageRequest.of(pageNum, pageSize,Sort.by(name)));
  			return cus.getContent();
  		}

}
