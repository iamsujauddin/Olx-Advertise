package com.example.spring.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.spring.micro.model.AdvertiseCategory;
import com.example.spring.micro.model.AdvertiseStatus;
import com.example.spring.micro.model.repository.AdvertiseCatagoryRepository;
import com.example.spring.micro.model.repository.AdvertiseStatusRepository;

@SpringBootApplication
@EnableEurekaClient
public class OlxMasterdataApplication implements ApplicationRunner {
	
	@Autowired 
	private AdvertiseCatagoryRepository advertiseCatagoryRepository;
	
	@Autowired 
	private AdvertiseStatusRepository advertiseStatusRepository;

	public static void main(String[] args) {
		SpringApplication.run(OlxMasterdataApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		advertiseCatagoryRepository.save(new AdvertiseCategory(1,"Furniture"));
		advertiseCatagoryRepository.save(new AdvertiseCategory(2,"Cars"));
		advertiseCatagoryRepository.save(new AdvertiseCategory(3,"Mobiles"));
		advertiseCatagoryRepository.save(new AdvertiseCategory(4,"Real Estate"));
		advertiseCatagoryRepository.save(new AdvertiseCategory(5,"Sports"));
		advertiseStatusRepository.save(new AdvertiseStatus(1,"OPEN"));
		advertiseStatusRepository.save(new AdvertiseStatus(2,"CLOSED"));
	}

}
