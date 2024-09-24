package com.collegeclubs.ecosystem_of_clubs.service;

import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import com.collegeclubs.ecosystem_of_clubs.repository.clubRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClubService {

    @Autowired
    private clubRepository clubRepository;

    // For hashing passwords (optional, in case you want secure login)
    // private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Register a new club
    public Clubs registerClub(Clubs club) {
        // Here you could hash the password if necessary
        // club.setPassword(passwordEncoder.encode(club.getPassword()));
        return clubRepository.save(club);
    }

    // Login a club by name and password
    public boolean loginClub(String clubName, String password) {
        Clubs club = clubRepository.findByClubName(clubName);
        if (club != null) {
            // Compare the password with the hashed password (if stored hashed)
            // return passwordEncoder.matches(password, club.getPassword());
            return password.equals(club.getPassword());  // If password is not hashed
        }
        return false;
    }

    // Get a club by its name
    public Optional<Clubs> getClubByName(String clubName) {
        return Optional.ofNullable(clubRepository.findByClubName(clubName));
    }
}
