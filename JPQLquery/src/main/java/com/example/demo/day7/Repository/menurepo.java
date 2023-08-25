package com.example.demo.day7.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.day7.model.menumodel;

import jakarta.transaction.Transactional;

public interface menurepo extends JpaRepository<menumodel, Integer>{
	

	//native query
	
	@Query(value="select * from menumodel",nativeQuery=true)
	public List<menumodel>getAllRows();

	//using model name
	@Query("select h from menumodel h where h.menudish like %?1%")
	public List<menumodel>getByname(@Param("name") String name);
	
	
	
	@Query(value="select*from menumodel where menudish=:d and price=:p",nativeQuery=true )
	public List<menumodel>getSpecRows(@Param("d")String d,@Param("p")String p);
	
	//like
	@Query(value="select*from menumodel where menudish like %?1%",nativeQuery=true )
	public List<menumodel>getbyname(@Param("d")String d);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM menumodel WHERE menuid=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
	@Modifying
	@Transactional
	@Query(value="update menumodel set menudish=:d where menuid=:id",nativeQuery=true)
	public Integer updateById(@Param("d")String d,@Param("id")int id);
	
	//using model name delete
	@Modifying
	@Transactional
	@Query("delete from menumodel h where h.menuid=:id")
	public int gautham(@Param("id") int id);
	
	//get model name modelclass
	@Query(value="select h from menumodel h")
	public List<menumodel>getrowsss();
	
	

}
