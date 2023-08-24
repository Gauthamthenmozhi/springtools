package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.studentrepo;
import com.example.demo.model.studentmodel;

@Service
public class studentservice {
	@Autowired
	public studentrepo hpo;
	//post the data
	public studentmodel saveDetails(studentmodel hr)
	{
		return hpo.save(hr);
	}
	//sorting
	
	public List<studentmodel> sortByAsc(String name)
	{
		return hpo.findAll(Sort.by(name).ascending());
	}
	public List<studentmodel> sortByDes(String name)
	{
		return hpo.findAll(Sort.by(name).descending());
	}
	//pagination
	public List<studentmodel>pagination( int pageNo,int pagesize)
	{
		Page<studentmodel> cont=hpo.findAll(PageRequest.of(pageNo, pagesize));
				return cont.getContent();
	}
//pagination and sorting(asc)
	public List<studentmodel>paginationAndSorting( int pageNo,int pagesize,String name)
	{
		Page<studentmodel> cont1=hpo.findAll(PageRequest.of(pageNo, pagesize,Sort.by(name).ascending()));
				return cont1.getContent();
	}
	//pagination and sorting(des)
	public List<studentmodel>paginationAndSortings( int pageNo,int pagesize,String name)
	{
		Page<studentmodel> cont2=hpo.findAll(PageRequest.of(pageNo, pagesize,Sort.by(name).descending()));
				return cont2.getContent();
	}
}
