package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Clubs")
public class Clubs {

    @Id
    private String clubId;          // Club ID
    private String clubName;        // Club Name
    private String slogan;       // Club Slogan
    private String logo;         // Club Logo file name
    private String description;  // Club Description

    public Clubs() {
    }

    // Parameterized constructor
    public Clubs(String clubId, String clubName, String slogan, String logo, String description) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.slogan = slogan;
        this.logo = logo;
        this.description = description;
    }

    // Getters and Setters
    public String getclubId() {
        return clubId;
    }

    public void setclubId(String clubId) {
        this.clubId = clubId;
    }

    public String getclubName() {
        return clubName;
    }

    public void setclubName(String clubName) {
        this.clubName = clubName;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
