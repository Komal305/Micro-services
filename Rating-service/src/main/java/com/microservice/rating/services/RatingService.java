package com.microservice.rating.services;


import java.util.List;


import com.microservice.rating.entities.Rating;
 

public interface RatingService {
	Rating create(Rating rating);
	List<Rating>  getAllRating();
	//get all by UserId
    List<Rating> getRatingByUserId(String userId);
 
    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
 
	

}
