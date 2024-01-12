package com.microservice.user.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.microservice.user.entities.Hotels;

@FeignClient(name="HOTELSERVICE")
public interface HotelService {
 
    @GetMapping("/hotels/{hotelId}")
    Hotels getHotel(@PathVariable("hotelId") String hotelId);
 
   
}
