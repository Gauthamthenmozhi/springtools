package com.example.Day4.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day4.model.Collegedetails;

public interface Collegerep extends JpaRepository <Collegedetails, Integer> {

}
