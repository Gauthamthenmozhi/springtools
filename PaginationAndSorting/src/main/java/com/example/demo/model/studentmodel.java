package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class studentmodel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentid;
	private String studentname;
	private String studentrollno;
	private String studentphno;
	private String studentnative;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentrollno() {
		return studentrollno;
	}
	public void setStudentrollno(String studentrollno) {
		this.studentrollno = studentrollno;
	}
	public String getStudentphno() {
		return studentphno;
	}
	public void setStudentphno(String studentphno) {
		this.studentphno = studentphno;
	}
	public String getStudentnative() {
		return studentnative;
	}
	public void setStudentnative(String studentnative) {
		this.studentnative = studentnative;
	}
	
	

}
