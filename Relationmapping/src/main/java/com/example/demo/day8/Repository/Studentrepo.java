package com.example.demo.day8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day8.model.Studentmodel;

public interface Studentrepo extends JpaRepository<Studentmodel, Integer> {

}
