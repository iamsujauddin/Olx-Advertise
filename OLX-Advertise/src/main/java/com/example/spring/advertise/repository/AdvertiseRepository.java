package com.example.spring.advertise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.advertise.model.Advertise;

public interface AdvertiseRepository extends JpaRepository<Advertise, Long> {

	Advertise findById(long postId);

	
}
