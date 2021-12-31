package com.example.spring.advertise.config;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring.advertise.model.AdvertiseCategory;
import com.example.spring.advertise.model.AdvertiseStatus;


@FeignClient("GATEWAY-SERVICE")
public interface AdvertiseCategoryClient {

	@GetMapping("/master/advertise/category")
	List<AdvertiseCategory> getAdvertiseCategory();
	
	@GetMapping("/master/advertise/status")
	List<AdvertiseStatus> getAdvertiseStatus();
}
