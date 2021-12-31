package com.example.spring.advertise.model;

import java.util.Date;

public class AdvertiseResponse {

	private long id;
	private String title;
	private int price;
	private String category;
	private String description;
	private String username="annand";
	private Date createdDate=new Date();
	private Date modifiedDate=new Date();
	private String status;
	public AdvertiseResponse() {
		super();
	}
	public AdvertiseResponse(long id, String title, int price, String category, String description, String username,
			Date createdDate, Date modifiedDate, String status) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.category = category;
		this.description = description;
		this.username = username;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdvertiseReturn [id=" + id + ", title=" + title + ", price=" + price + ", category=" + category
				+ ", description=" + description + ", username=" + username + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", status=" + status + "]";
	}
	
	
	
}
