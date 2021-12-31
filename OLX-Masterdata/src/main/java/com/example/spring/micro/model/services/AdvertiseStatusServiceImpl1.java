package com.example.spring.micro.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.micro.model.AdvertiseStatus;
import com.example.spring.micro.model.repository.AdvertiseStatusRepository;

@Service
public class AdvertiseStatusServiceImpl1 implements AdvertiseStatusService {

	@Autowired
	private AdvertiseStatusRepository advertiseStatusRepository;

	@Override
	public List<AdvertiseStatus> getAdvertiseStatus() {
		
		return advertiseStatusRepository.findAll();
	}	
	
	
	
}
