package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.ClubAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface ClubAdminRepository extends MongoRepository<ClubAdmin, String> {
    Optional<ClubAdmin> findByUsername(String username);
}
