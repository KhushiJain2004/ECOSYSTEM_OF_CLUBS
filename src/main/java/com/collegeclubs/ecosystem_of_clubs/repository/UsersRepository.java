package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
    
    // Custom query method to find a user by username
    Users findByUsername(String username);

    // Custom query method to find a user by email
    Users findByEmail(String email);
}

