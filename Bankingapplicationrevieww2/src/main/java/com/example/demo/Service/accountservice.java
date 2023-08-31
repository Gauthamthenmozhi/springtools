package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Account;

import com.example.demo.Repository.Accountrepo;




@Service
public class accountservice {
	@Autowired
	public Accountrepo mr;
	//post the data
		public Account saveDetails(Account hm)
		{
			return mr.save(hm);
		}
		//get the data
		public List<Account>getDetails()
		{
			return mr.findAll();
		}
	//get all the data
	   
	   public List<Account>getAllrows()
	   {
		   return mr.getAllRows();
	   }
	   
	   //get specfic data
	    public List<Account>getSpecrows(String d,int id)
	    {
	 	   return mr.getSpecRows(d,id);
	    }  
	    
	  //update
	    public Integer updateRow(String d,int id)
	    {
	    	return mr.updateById(d, id);
	    }
	    

         //delete the data
          public int deleteByid(int id)
          {
         	return mr.deleted(id);
             }
          
          //sorting (ascending)
    		public List<Account> sortAsc(String name)
    		{
    			return mr.findAll(Sort.by(name));
    		}
    		
    		//sorting (descending)
    		public List<Account> sortDes(String name)
    		{
    			return mr.findAll(Sort.by(name).descending());
    		}
    		
    		//pagination
    		public List<Account> pagination(int pageNum,int pageSize)
    		{
    			Page<Account> cus=mr.findAll(PageRequest.of(pageNum, pageSize));
    			return cus.getContent();
    		}
    		
    		//pagination and sorting
    		public List<Account> paginationSorting(int pageNum,int pageSize,String name)
    		{
    			Page<Account> cus=mr.findAll(PageRequest.of(pageNum, pageSize,Sort.by(name)));
    			return cus.getContent();
    		}


}
