package com.example.spring.micro.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class AdvertiseStatus {
	@Id
	private long id;
	private String status;
	public AdvertiseStatus() {
		super();
	}
	public AdvertiseStatus(long id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdvertiseStatus [id=" + id + ", status=" + status + "]";
	}

	
	
	
}
