package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Addressmodel;

public interface Addressrepo extends JpaRepository<Addressmodel, Integer>{

}
