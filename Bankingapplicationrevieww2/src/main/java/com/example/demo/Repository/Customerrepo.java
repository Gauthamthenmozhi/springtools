package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Customer;

import jakarta.transaction.Transactional;

public interface Customerrepo extends JpaRepository<Customer, Long>{
	
	@Query(value = "SELECT * FROM customertable", nativeQuery = true)
	public List<Customer> getAllRows();
	
	//get specific row
	@Query(value="select*from customertable where custname=:d where custid=:id",nativeQuery=true )
	public List<Customer>getSpecRows(@Param("d")String d,@Param("id")int id);

	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM customertable WHERE cusid=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
		@Modifying
		@Transactional
		@Query(value="update customer set custname=:d where cusid=:id",nativeQuery=true)
		public Integer updateById(@Param("d")String d,@Param("id")int id);
	

}
