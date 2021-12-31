package com.example.spring.advertise.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.advertise.config.AdvertiseCategoryClient;
import com.example.spring.advertise.model.Advertise;
import com.example.spring.advertise.model.AdvertiseCategory;
import com.example.spring.advertise.model.AdvertiseResponse;
import com.example.spring.advertise.model.AdvertiseStatus;
import com.example.spring.advertise.repository.AdvertiseRepository;


@Service
public class AdvertiseServiceoImpl1 implements AdvertiseService {

	@Autowired
	private AdvertiseRepository advertiseRepository;



	@Autowired
	private AdvertiseCategoryClient advertiseCategoryClient;

	@Override
	public AdvertiseResponse insertAdvertise(Advertise advertise) {
		advertiseRepository.save(advertise);
		AdvertiseResponse advertiseResponse=thirdPartyResponse(advertise);
		return advertiseResponse;
	}

	@Override
	public AdvertiseResponse getAdvertise(long postId) {
		Advertise advertise=advertiseRepository.findById(postId);
		if (Objects.isNull(advertise)) {
			return null;
		}
		AdvertiseResponse advertiseResponse=thirdPartyResponse(advertise);
		return advertiseResponse;
	}

	@Override
	public boolean deleteAdvertise(long postId) {

		Advertise advertise = advertiseRepository.findById(postId);
		if (Objects.isNull(advertise)) {
			return false;
		} else {
			advertiseRepository.deleteById(postId);
		}
		return true;
	}

	@Override
	public AdvertiseResponse updateAdvertise(Advertise advertise, long postId) {

		Advertise advertiseNew = advertiseRepository.findById(postId);
		if (Objects.isNull(advertiseNew)) {
			return null;
		}
		advertiseNew.setCategoryId(advertise.getCategoryId());
		advertiseNew.setPrice(advertise.getPrice());
		advertiseNew.setTitle(advertise.getTitle());
		advertiseNew.setDescription(advertise.getDescription());
		advertiseNew.setStatusId(advertise.getStatusId());
		advertiseRepository.save(advertiseNew);
		AdvertiseResponse advertiseResponse=thirdPartyResponse(advertiseNew);
		return advertiseResponse;
	}
	
	public AdvertiseResponse thirdPartyResponse(Advertise advertise) {
		
		List<AdvertiseCategory> advertiseCategory = advertiseCategoryClient.getAdvertiseCategory();
		List<AdvertiseStatus> advertiseStatus = advertiseCategoryClient.getAdvertiseStatus();
		AdvertiseResponse advertiseResponse=new AdvertiseResponse();
		advertiseResponse.setId(advertise.getId());
		advertiseResponse.setTitle(advertise.getTitle());
		advertiseResponse.setDescription(advertise.getDescription());
		advertiseResponse.setPrice(advertise.getPrice());
		int categoryId = advertise.getCategoryId();
		if(categoryId==1 || categoryId==2 ||categoryId==3 ||categoryId==4 ||categoryId==5) {
		String category = advertiseCategory.get(categoryId - 1).getCategory();
		advertiseResponse.setCategory(category);
		}
		int statusId = advertise.getStatusId();
		if(statusId==1 || statusId==2) {
		String status = advertiseStatus.get(statusId - 1).getStatus();
		advertiseResponse.setStatus(status);
		}
		return advertiseResponse;
	}

}
