package com.example.demo.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;


import com.example.demo.day7.Repository.menurepo;
import com.example.demo.day7.model.menumodel;

import jakarta.transaction.Transactional;

@Service
public class menuservice {
	@Autowired
	public menurepo mr;
	//get all the data
	   
	   public List<menumodel>getAllrows()
	   {
		   return mr.getAllRows();
	   }
	   
	 //get specfic data
	    public List<menumodel>getSpecrows(String d,String p)
	    {
	 	   return mr.getSpecRows(d,p);
	    }
     //delete the data
	    public int deleteByid(int id)
	    {
	    	return mr.deleted(id);
	    }
	    //update
	    public Integer updateRow(String d,int id)
	    {
	    	return mr.updateById(d, id);
	    }
	    //same name
	    public List<menumodel>getbyName(String d)
	    {
	    	return mr.getbyname(d);
	    }
	    //using model menuname
       public List<menumodel>getBynamemodel(String name)
	    {
    	return mr.getByname(name);
	    }
       //using model menuid delete
       public Integer getBymodelid(int id)
	    {
   	       return mr.gautham(id);
	    }
       //update using modelget
       public List<menumodel>getrow()
       {
    	   return mr.getrowsss();
       }
       
	    
	    
}
