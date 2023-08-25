package com.example.demo.day7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class menumodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int menuid;
	private String menudish;
	private String Quantity;
	private String price;
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenudish() {
		return menudish;
	}
	public void setMenudish(String menudish) {
		this.menudish = menudish;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
