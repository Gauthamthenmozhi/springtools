package com.example.demo.day8.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Studentmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	private String stdName;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="aidaddress")
	private Addmodel stdAdd;
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
	public Addmodel getStdAdd() {
		return stdAdd;
	}
	public void setStdAdd(Addmodel stdAdd) {
		this.stdAdd = stdAdd;
	}
	
	
	

}
