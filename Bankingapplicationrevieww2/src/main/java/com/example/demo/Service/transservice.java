package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Model.Transcation;

import com.example.demo.Repository.Transcationrepo;

@Service
public class transservice {
	
	@Autowired
	public Transcationrepo mrs;
	//post the data
		public Transcation saveDetails(Transcation hmr)
		{
			return mrs.save(hmr);
		}
		//get the data
		public List<Transcation>getDetails()
		{
			return mrs.findAll();
		}
	//get all the data
	   
	   public List<Transcation>getAllrows()
	   {
		   return mrs.getAllRows();
	   }
	   
	   //get specfic data
	    public List<Transcation>getSpecrows(String d,int id)
	    {
	 	   return mrs.getSpecRows(d,id);
	    }  
	    
	  //update
	    public Integer updateRow(String d,int id)
	    {
	    	return mrs.updateById(d, id);
	    }
	    

         //delete the data
          public int deleteByid(int id)
          {
         	return mrs.deleted(id);
             }

}
