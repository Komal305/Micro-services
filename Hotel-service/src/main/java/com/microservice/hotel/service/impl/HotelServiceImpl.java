package com.microservice.hotel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.hotel.entities.Hotels;
import com.microservice.hotel.exception.IDNotFoundException;
import com.microservice.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Override
	public List<Hotels> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotels addHotel(Hotels hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotels getById(int id) throws IDNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) throws IDNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hotels updateHotel(Hotels hotel) throws IDNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	


}


	/*
	private static List<Hotels> hotelList=new ArrayList<Hotels>();
	
	static {
		hotelList.add(new Hotels("Taj", "Bombay", 3, 1267898765, 49000.0, true));
		hotelList.add(new Hotels("Obroi", "Delhi", 4, 1267898765, 43000.0, true));
		hotelList.add(new Hotels("Raffels", "Singhapore", 7, 1267898765, 14000.0, true));
		hotelList.add(new Hotels("Marriott", "LA", 5, 1267898765, 54000.0, true));
		hotelList.add(new Hotels("hytt", "Chicago", 4, 1267898765, 84000.0, true));
		hotelList.add(new Hotels("Limetree", "Patna", 6, 1267898765, 24000.0, true));
		hotelList.add(new Hotels("Stone Park", "London", 7, 1267898765, 41000.0, true));
	}
	
	@Override
	public List<Hotels> getAllHotels() {
		
		return hotelList;
	}

	@Override
	public Hotels addHotel(Hotels h) {
		hotelList.add(h);
		return h;
	}

	@Override
	public Hotels updateHotel(Hotels h) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Hotels> getHotelByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> removeHotel(int ratings) {
		List<Hotels> h=hotelList.stream().filter(rate-> rate.getRating()==ratings).collect(Collectors.toList());
		hotelList.removeAll(h);
		return hotelList;
	}

	
//	@Override
//	public boolean checkAvailability() {
//		// TODO Auto-generated method stub
//		return isAvaliable;
//	}
//
//	@Override
//	public String seeLocation() {
//		// TODO Auto-generated method stub
//		return location;
//	}
//
//	@Override
//	public long ContactNumber(long contactNum) {
//		
//		return contactNum;
//	}

	
}
*/