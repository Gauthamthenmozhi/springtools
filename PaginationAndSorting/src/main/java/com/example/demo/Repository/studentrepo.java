package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.studentmodel;

public interface studentrepo extends JpaRepository<studentmodel, Integer>{

}
