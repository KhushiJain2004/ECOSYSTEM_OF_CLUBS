package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface clubRepository extends MongoRepository<Clubs, String> {
    Optional<Clubs> findByClubName(String clubName);
}
