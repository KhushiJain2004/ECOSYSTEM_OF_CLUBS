package com.collegeclubs.ecosystem_of_clubs.service;

import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import com.collegeclubs.ecosystem_of_clubs.model.ClubAdmin;
import com.collegeclubs.ecosystem_of_clubs.repository.ClubAdminRepository;
import com.collegeclubs.ecosystem_of_clubs.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private ClubAdminRepository clubAdminRepository;

    // Register a new club with a new admin
    public Clubs registerClub(Clubs club, ClubAdmin admin) throws Exception {
        // Save the new ClubAdmin first
        ClubAdmin savedAdmin = clubAdminRepository.save(admin);

        // Associate the saved admin with the club
        club.setAdmin(savedAdmin);

        // Save the club
        return clubRepository.save(club);
    }

    // Login a club by its name
    public Clubs loginClub(String clubName) throws Exception {
        return clubRepository.findByClubName(clubName)
            .orElseThrow(() -> new Exception("Club with name " + clubName + " not found."));
    }
}
