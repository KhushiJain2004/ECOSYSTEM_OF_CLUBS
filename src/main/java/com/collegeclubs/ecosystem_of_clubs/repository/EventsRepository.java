package com.collegeclubs.ecosystem_of_clubs.repository;

import com.collegeclubs.ecosystem_of_clubs.model.Events;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends MongoRepository<Events, String> {
    
    List<Events> findByClubId(String clubId);

    List<Events> findByTagContaining(String tag);
    
    List<Events> findByEName(String eName);
}