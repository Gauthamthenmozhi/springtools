package com.example.Day4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;


@Entity

public class Collegedetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Rollnumber;
	@Column(name="StudentName")
	private String Name;
	private String address;
	public int getRollnumber() {
		return Rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
