package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.example.demo.Model.Branch;

import com.example.demo.Repository.Branchrepo;


@Service
public class branchservice {
	@Autowired
	public Branchrepo mrss;
	//post the data
		public Branch saveDetails(Branch hmrr)
		{
			return mrss.save(hmrr);
		}
		//get the data
		public List<Branch>getDetails()
		{
			return mrss.findAll();
		}
	//get all the data
	   
	   public List<Branch>getAllrows()
	   {
		   return mrss.getAllRows();
	   }
	   
	   //get specfic data
	    public List<Branch>getSpecrows(String d,int id)
	    {
	 	   return mrss.getSpecRows(d,id);
	    }  
	    
	  //update
	    public Integer updateRow(String d,int id)
	    {
	    	return mrss.updateById(d, id);
	    }
	    

         //delete the data
          public int deleteByid(int id)
          {
         	return mrss.deleted(id);
             }
        



}
