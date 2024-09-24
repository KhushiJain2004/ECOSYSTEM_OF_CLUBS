package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clubRepository extends MongoRepository<Clubs, String> {
    Clubs findByClubName(String clubName);  
}