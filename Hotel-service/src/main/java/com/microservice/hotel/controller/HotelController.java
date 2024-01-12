package com.microservice.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;

import com.microservice.hotel.entities.Hotels;
import com.microservice.hotel.exception.IDNotFoundException;
import com.microservice.hotel.service.HotelService;





public class HotelController {
@Autowired
HotelService hotelService;
@GetMapping("")
public ResponseEntity<List<Hotels>> getAll() {
	return ResponseEntity.ok(hotelService.getall());
}

@GetMapping("/{id}")
public ResponseEntity<Hotels> getById(@PathVariable int id) throws IDNotFoundException {
	return ResponseEntity.ok(hotelService.getById(id));
}

@DeleteExchange("/{id}")
public ResponseEntity<String> deleteById(@PathVariable int id) throws IDNotFoundException {
	if (hotelService.deleteById(id))
		return ResponseEntity.ok("Deleted");
	return new ResponseEntity<String>("Failed to Delete", HttpStatus.BAD_REQUEST);
}



@PostMapping("")
public ResponseEntity<Hotels> addHotel(@RequestBody Hotels hotel) {
	Hotels h=hotelService.addHotel(hotel);
	if ( h!= null) {
		return new ResponseEntity<Hotels>(h,HttpStatus.CREATED);
	} else {
		return new ResponseEntity<Hotels>(h, HttpStatus.BAD_REQUEST);
	}
}

@PutMapping("/{id}")
public ResponseEntity<Hotels> updateHotel(@PathVariable int id, @RequestBody Hotels hotel)
		throws IDNotFoundException {
	if (hotelService.getById(id) == null) {
		throw new IDNotFoundException("ID NOT FOUND");
	} else {
		return ResponseEntity.ok(hotelService.updateHotel(hotel));
	}
}
}


//@GetMapping(value = "/hotelRegistration")
//public String gethotelRegistration() {
//	return "add";
//}
//
//@RequestMapping(value = "/register", method = RequestMethod.POST)
//public String addHotel(@ModelAttribute Hotel hotel, Model model) {
//	Hotel h = service.addHotel(hotel);
//	model.addAttribute("hotel", h);
//	return "success";
//}
