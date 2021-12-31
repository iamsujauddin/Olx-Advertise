package com.example.spring.advertise.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private int price;
	private int categoryId;
	private String description;
	private String username="annand";
	private Date createdDate=new Date();
	private Date modifiedDate=new Date();
	private int statusId;
	public Advertise() {
		super();
	}
	public Advertise(long id, String title, int price, int categoryId, String description, String username,
			Date createdDate, Date modifiedDate, int statusId) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.categoryId = categoryId;
		this.description = description;
		this.username = username;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.statusId = statusId;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	@Override
	public String toString() {
		return "Advertise [id=" + id + ", title=" + title + ", price=" + price + ", categoryId=" + categoryId
				+ ", description=" + description + ", username=" + username + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", statusId=" + statusId + "]";
	}
	


}
