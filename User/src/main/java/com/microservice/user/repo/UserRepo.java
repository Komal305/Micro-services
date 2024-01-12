package com.microservice.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.user.entities.User;

public interface UserRepo extends JpaRepository<User, String>  {

}
