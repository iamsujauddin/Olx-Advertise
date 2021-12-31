package com.example.spring.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.micro.model.AdvertiseCategory;
import com.example.spring.micro.model.AdvertiseStatus;
import com.example.spring.micro.model.services.AdvertiseCatagoryService;
import com.example.spring.micro.model.services.AdvertiseStatusService;

@RestController
@RequestMapping("/master")	
public class OlxMaster {

	@Autowired
	private AdvertiseCatagoryService advertiseCatagoryService;
	
	@Autowired
	private AdvertiseStatusService advertiseStatusService;
	
	@GetMapping("/advertise/category")
	public List<AdvertiseCategory> getAdvertiseCatagory() {
		System.out.println("list of category");
		return advertiseCatagoryService.getAdvertiseCatagories();
	}
	
	@GetMapping("/advertise/status")
	public List<AdvertiseStatus> getAdvertiseStatus() {
		System.out.println("list of status");
		return advertiseStatusService.getAdvertiseStatus();
	}
	
}
