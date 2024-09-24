package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.WebAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebAdminRepository extends MongoRepository<WebAdmin, String> {
    
    // Custom query methods can be defined here if needed
    WebAdmin findByWaName(String waName);
    
    WebAdmin findByEmail(String email);
    
    // You can add more methods as per your requirements
}
