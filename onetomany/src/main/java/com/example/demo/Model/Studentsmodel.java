package com.example.demo.Model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Studentsmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stuid")
	private int stuId;
	private String stdName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_aid",referencedColumnName = "stuid")
	private List<Addressmodel> address;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public List<Addressmodel> getAddress() {
		return address;
	}
	public void setAddress(List<Addressmodel> address) {
		this.address = address;
	}



}
