package com.example.spring.micro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.micro.model.AdvertiseCategory;

@Repository
public interface AdvertiseCatagoryRepository extends JpaRepository<AdvertiseCategory, Integer> {
	

}
