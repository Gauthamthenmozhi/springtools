package com.example.demo.Day6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Day6.model.iplmodel;

public interface iplrepo extends JpaRepository<iplmodel, Integer> {

}
