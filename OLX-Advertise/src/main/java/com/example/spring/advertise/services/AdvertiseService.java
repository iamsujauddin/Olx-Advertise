package com.example.spring.advertise.services;

import com.example.spring.advertise.model.Advertise;
import com.example.spring.advertise.model.AdvertiseResponse;


public interface AdvertiseService {

	AdvertiseResponse insertAdvertise(Advertise advertise);

	AdvertiseResponse getAdvertise(long postId);
	
	boolean deleteAdvertise(long postId);

	AdvertiseResponse updateAdvertise(Advertise advertise, long postId);

}
