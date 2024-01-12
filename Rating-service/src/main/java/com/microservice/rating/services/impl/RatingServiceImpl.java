package com.microservice.rating.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.rating.entities.Rating;
import com.microservice.rating.repo.RatingRepo;
import com.microservice.rating.services.RatingService;


@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
public RatingRepo ratingRepo;
	
	@Override
	public Rating create(Rating rating) {
		rating.setRatingId(UUID.randomUUID().toString());
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		 
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return this.ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}

}
