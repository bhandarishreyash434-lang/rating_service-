package com.rating.iservices;

import java.util.List;

import com.rating.model.rating_model;

public interface Rating_iservices {

	public rating_model create(rating_model rating);
	
	public List<rating_model> getallrating();
	
	public List<rating_model> getRatingByUser(String userId);
	
	public List<rating_model>getRatingByHotelId(String hotelId);
}
