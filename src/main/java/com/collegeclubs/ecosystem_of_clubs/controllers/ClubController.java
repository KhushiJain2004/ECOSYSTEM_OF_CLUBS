package com.collegeclubs.ecosystem_of_clubs.controllers;

import com.collegeclubs.ecosystem_of_clubs.dto.ClubRegistrationRequest;
import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import com.collegeclubs.ecosystem_of_clubs.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    // Register a new club along with the admin
    @PostMapping("/register")
    public ResponseEntity<?> registerClub(@RequestBody ClubRegistrationRequest request) {
        try {
            // Pass the Club and Admin details to the service layer
            Clubs registeredClub = clubService.registerClub(request.getClub(), request.getAdmin());
            return ResponseEntity.ok(registeredClub);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Login a club by its name
    @PostMapping("/login")
    public ResponseEntity<?> loginClub(@RequestParam String clubName) {
        try {
            Clubs club = clubService.loginClub(clubName);
            return ResponseEntity.ok(club);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
