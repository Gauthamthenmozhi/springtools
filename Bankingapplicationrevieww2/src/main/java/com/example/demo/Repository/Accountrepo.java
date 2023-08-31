package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Account;


import jakarta.transaction.Transactional;

public interface Accountrepo extends JpaRepository<Account, Long>{
	
	@Query(value = "SELECT * FROM accounttable", nativeQuery = true)
	public List<Account> getAllRows();
	
	//get specific row
	@Query(value="select*from accounttable where accholdername=:d where accountid=:id",nativeQuery=true )
	public List<Account>getSpecRows(@Param("d")String d,@Param("id")int id);

	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM accounttable WHERE accountid=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
		@Modifying
		@Transactional
		@Query(value="update accounttable set accountholderName=:d where accountid=:id",nativeQuery=true)
		public Integer updateById(@Param("d")String d,@Param("id")int id);
	

}
