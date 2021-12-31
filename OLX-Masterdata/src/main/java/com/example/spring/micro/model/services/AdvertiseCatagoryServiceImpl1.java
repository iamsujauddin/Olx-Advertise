package com.example.spring.micro.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.micro.model.AdvertiseCategory;
import com.example.spring.micro.model.repository.AdvertiseCatagoryRepository;

@Service
public class AdvertiseCatagoryServiceImpl1 implements AdvertiseCatagoryService {
	
	@Autowired
	private AdvertiseCatagoryRepository advertiseCatagoryRepository;

	@Override
	public List<AdvertiseCategory> getAdvertiseCatagories() {
		
		return advertiseCatagoryRepository.findAll();
	}

}
