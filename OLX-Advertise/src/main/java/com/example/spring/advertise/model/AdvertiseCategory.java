package com.example.spring.advertise.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AdvertiseCategory {

	@Id
	private long id;
	private String category;
	public AdvertiseCategory() {
		super();
	}
	public AdvertiseCategory(long id, String category) {
		super();
		this.id = id;
		this.category = category;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		return "AdvertiseCatagory [id=" + id + ", category=" + category + "]";
	}
	
	
	
}
