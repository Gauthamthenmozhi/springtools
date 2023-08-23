package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bankingmodel;

public interface bankrepo extends JpaRepository<bankingmodel, Integer> {

}
