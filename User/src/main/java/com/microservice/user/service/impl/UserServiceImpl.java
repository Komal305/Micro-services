package com.microservice.user.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.user.entities.Hotels;
import com.microservice.user.entities.Rating;
import com.microservice.user.entities.User;
import com.microservice.user.externalservice.HotelService;
import com.microservice.user.repo.UserRepo;
import com.microservice.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Autowired
	RestTemplate restTemplate;
	 @Autowired
	    private HotelService hotelService;
	
	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepo.save(user);
	}

	@Override
	public  List<User> getAllUser() {
		List<User> user = userRepo.findAll();
		return user;
	}

	@Override
	public User getUser(String userId) {
		User user= userRepo.findById(userId).orElseThrow(()->new ArithmeticException("User with given id does not exist in the server"));
		 Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/" + user.getUserId(), Rating[].class);
		 List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();
	        List<Rating> ratingList = ratings.stream().map(rating -> {
	            
	            Hotels hotel = hotelService.getHotel(rating.getHotelId());
	            // logger.info("response status code: {} ",forEntity.getStatusCode());
	            //set the hotel to rating
	            rating.setHotel(hotel);
	            //return the rating
	            return rating;
	        }).collect(Collectors.toList());

	        user.setRating(ratingList);

	        return user;
		
	}

}