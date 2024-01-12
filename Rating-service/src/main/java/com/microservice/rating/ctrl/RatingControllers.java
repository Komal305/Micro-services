package com.microservice.rating.ctrl;

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

import com.microservice.rating.entities.Rating;
import com.microservice.rating.services.RatingService;



@RestController
@RequestMapping("/api/rating")
public class RatingControllers {
    @Autowired
	RatingService ratingService;
    
    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating createdRating = ratingService.create(rating);
        return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
    }
	
	//controller logic in service
	@GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }
 
    //get all of hotels
	@GetMapping("")
	public ResponseEntity<List<Rating>> getAll(){
		return ResponseEntity.ok(ratingService.getAllRating());
	}

	
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }	
}
