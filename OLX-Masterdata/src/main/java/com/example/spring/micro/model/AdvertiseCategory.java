package com.example.spring.micro.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AdvertiseCategory {

	@Id
	private int id;
	private String category;
	public AdvertiseCategory() {
		super();
	}
	public AdvertiseCategory(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "AdvertiseCategory [id=" + id + ", category=" + category + "]";
	}


	
	
	
}
