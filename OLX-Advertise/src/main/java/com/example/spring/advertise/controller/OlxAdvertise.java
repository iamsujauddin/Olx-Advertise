package com.example.spring.advertise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.advertise.model.Advertise;
import com.example.spring.advertise.model.AdvertiseResponse;
import com.example.spring.advertise.services.AdvertiseService;

@RestController
@RequestMapping("/adv")
public class OlxAdvertise {
	
	@Autowired
	private AdvertiseService advertiseService;
	
	public Advertise handleError( Advertise advertise,Exception exception) {
		Advertise newAdvertise=new Advertise();
		newAdvertise.setId(0);
		newAdvertise.setCategoryId(0);
		newAdvertise.setDescription("unknown");
		newAdvertise.setPrice(0);
		newAdvertise.setStatusId(0);
		newAdvertise.setTitle("Sujauddin");
		newAdvertise.setUsername("sujauddin");
		
		return newAdvertise;
		
		
	}
	
	
	@PostMapping("/advertise")
	public AdvertiseResponse createAdvertise(@RequestBody Advertise advertise) {
		System.out.println("list of advertise posted");
		return advertiseService.insertAdvertise(advertise);
	}
	
	@GetMapping("advertise/{postId}")
	public AdvertiseResponse getAdvertise(@PathVariable("postId")long postId) {
		return advertiseService.getAdvertise(postId);
	}
	@DeleteMapping("advertise/{postId}")
	public boolean deleteAdvertise(@PathVariable("postId")long postId) {
		return advertiseService.deleteAdvertise(postId);
	}
	@PutMapping("advertise/{postId}")
	public AdvertiseResponse updateAdvertise(@RequestBody Advertise advertise,@PathVariable("postId")long postId) {
		return advertiseService.updateAdvertise(advertise,postId);
	}
	

}
