package com.example.springdo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springdo.entities.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    
}
