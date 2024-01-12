package com.microservice.user.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.microservice.user.entities.Rating;



@FeignClient(name = "RATINGSERVICE")
public interface RatingService {
	@GetMapping("/rating/{ratingId}")
Rating getRating(@PathVariable("hotelId") String hotelId);
}