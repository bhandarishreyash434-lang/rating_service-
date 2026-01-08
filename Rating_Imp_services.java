package com.rating.imp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.iservices.Rating_iservices;
import com.rating.model.rating_model;
import com.rating.repository.Rating_reopsitory;
@Service
public class Rating_Imp_services implements Rating_iservices{
	
	@Autowired
	private Rating_reopsitory repo;

	@Override
	public rating_model create(rating_model rating) {
		return repo.save(rating);
	}

	@Override
	public List<rating_model> getallrating() {
		return repo.findAll();
	}

	@Override
	public List<rating_model> getRatingByUser(String userId) {
		return repo.findByUserId(userId);
	}

	@Override
	public List<rating_model> getRatingByHotelId(String hotelId) {
	
		return repo.findByHotelId(hotelId);
	}

}
