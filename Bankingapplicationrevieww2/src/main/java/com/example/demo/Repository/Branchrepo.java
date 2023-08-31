package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Branch;


import jakarta.transaction.Transactional;

public interface Branchrepo extends JpaRepository<Branch, Long> {

	@Query(value = "SELECT * FROM branchtable", nativeQuery = true)
	public List<Branch> getAllRows();
	
	//get specific row
	@Query(value="select*from branchtable where branchname=:d where branchid=:id",nativeQuery=true )
	public List<Branch>getSpecRows(@Param("d")String d,@Param("id")int id);

	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM branchtable WHERE branchid=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
		@Modifying
		@Transactional
		@Query(value="update branchtable set branchname=:d where branchid=:id",nativeQuery=true)
		public Integer updateById(@Param("d")String d,@Param("id")int id);
	


}
