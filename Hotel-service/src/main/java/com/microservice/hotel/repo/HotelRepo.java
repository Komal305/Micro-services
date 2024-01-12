package com.microservice.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.hotel.entities.Hotels;

public interface HotelRepo extends JpaRepository<Hotels, Integer> {

}
