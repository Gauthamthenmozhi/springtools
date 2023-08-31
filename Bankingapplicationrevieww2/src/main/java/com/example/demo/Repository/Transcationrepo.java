package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.Model.Transcation;

import jakarta.transaction.Transactional;

public interface Transcationrepo extends JpaRepository<Transcation, Long> {
	

	@Query(value = "SELECT * FROM transcationtable", nativeQuery = true)
	public List<Transcation> getAllRows();
	
	//get specific row
	@Query(value="select*from transcationtable where description=:d where transid=:id",nativeQuery=true )
	public List<Transcation>getSpecRows(@Param("d")String d,@Param("id")int id);

	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM transcationtable WHERE transid=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
		@Modifying
		@Transactional
		@Query(value="update transcationtable set description=:d where transid=:id",nativeQuery=true)
		public Integer updateById(@Param("d")String d,@Param("id")int id);
	


}
