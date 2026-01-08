
package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.imp.services.Rating_Imp_services;
import com.rating.model.rating_model;

@RestController
@RequestMapping("/rating")
public class Rating_controller {
@Autowired
private Rating_Imp_services rs;
@PostMapping
	public ResponseEntity<rating_model> create(@RequestBody rating_model rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(rs.create(rating));
	}
	@GetMapping
	public ResponseEntity<List<rating_model>> getAllRating(){
		return ResponseEntity.ok(rs.getallrating());
		
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<rating_model>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(rs.getRatingByUser(userId));
	}
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<rating_model>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(rs.getRatingByHotelId(hotelId));
	}

}
