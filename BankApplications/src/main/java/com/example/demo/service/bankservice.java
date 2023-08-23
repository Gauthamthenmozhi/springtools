package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repository.bankrepo;
import com.example.demo.model.bankingmodel;

@Service
public class bankservice {
	@Autowired
	public bankrepo hpo;
	//post the data
	public bankingmodel saveDetails(bankingmodel hr)
	{
		return hpo.save(hr);
	}
	//get the data
	public List<bankingmodel>getDetails()
	{
		return hpo.findAll();
	}
	//update the data
	public bankingmodel updateDetails(bankingmodel hcr)
	{
		return hpo.saveAndFlush(hcr);
	}
	//delete if id is present
		public boolean deletebankinfos(int bankId)
		{
			if(hpo.existsById(bankId))
			{
				hpo.deleteById(bankId);
				return true;
			}
			return false;
		}
	public boolean deletebankinfo(int bankId)
	{
		if(hpo.existsById(bankId))
		{
			hpo.deleteById(bankId);
			return true;
		}
		return false;
	}
    //delete the data
	public void deleteDetails(int id)
	{
		System.out.println("Deleted");
		hpo.deleteById(id);
	}
	//get the data
	   public Optional<bankingmodel> getUserId(int userId)
	   {
		   Optional<bankingmodel>hotel=hpo.findById(userId);
		   if(hotel.isPresent())
		   {
			   return hotel;
		   }
		   return null;
	   }
	 //update if id is present
		public boolean updateStudInfo(int studId)
		{
			if(hpo.existsById(studId))
			{
				return true;
			}
			return false;
		}
}
