package com.collegeclubs.ecosystem_of_clubs.dto;

import com.collegeclubs.ecosystem_of_clubs.model.Clubs;
import com.collegeclubs.ecosystem_of_clubs.model.ClubAdmin;

public class ClubRegistrationRequest {

    private Clubs club;
    private ClubAdmin admin;

    // Constructors, getters, and setters
    public ClubRegistrationRequest() {}

    public ClubRegistrationRequest(Clubs club, ClubAdmin admin) {
        this.club = club;
        this.admin = admin;
    }

    public Clubs getClub() {
        return club;
    }

    public void setClub(Clubs club) {
        this.club = club;
    }

    public ClubAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ClubAdmin admin) {
        this.admin = admin;
    }
}
