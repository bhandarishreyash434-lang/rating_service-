package com.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.model.rating_model;

public interface Rating_reopsitory extends MongoRepository<rating_model,String>{

	List<rating_model>findByUserId(String userId);
	List<rating_model>findByHotelId(String hotelId);
}
