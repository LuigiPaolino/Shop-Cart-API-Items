package com.shopcart.items.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {

	private @Id @GeneratedValue Long id;
	private String name;
	private String price;
	private String description;
	
	public Item() {}
	
	public Item(String name, String price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
