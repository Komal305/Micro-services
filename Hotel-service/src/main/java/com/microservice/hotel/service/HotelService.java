package com.microservice.hotel.service;

import java.util.List;

import com.microservice.hotel.entities.Hotels;
import com.microservice.hotel.exception.IDNotFoundException;

public interface HotelService  {
  
	List<Hotels> getall();


	Hotels addHotel(Hotels hotel);


	Hotels getById(int id) throws IDNotFoundException;


	boolean deleteById(int id) throws IDNotFoundException;


	Hotels updateHotel(Hotels hotel) throws IDNotFoundException;

	
}




//List<Hotels> getAllHotels();
//Hotels addHotel(Hotels h);
//Hotels updateHotel(Hotels h);
//List<Hotels> removeHotel(int ratings);
//List<Hotels> getHotelByLocation();

//boolean checkAvailability();
//String seeLocation();
//long ContactNumber(long contactNum);