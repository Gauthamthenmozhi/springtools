package com.example.demo.Day6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class iplmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iplid;
	private String iplteamname;
	@Transient
	private String iplvenue;
	public int getIplid() {
		return iplid;
	}
	public void setIplid(int iplid) {
		this.iplid = iplid;
	}
	public String getIplteamname() {
		return iplteamname;
	}
	public void setIplteamname(String iplteamname) {
		this.iplteamname = iplteamname;
	}
	public String getIplvenue() {
		return iplvenue;
	}
	public void setIplvenue(String iplvenue) {
		this.iplvenue = iplvenue;
	}

}
