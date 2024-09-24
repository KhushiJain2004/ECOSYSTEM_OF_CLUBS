package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ClubAdmins")
public class ClubAdmin {

    @Id
    private String adminId;
    private String username;
    private String email;
    private String password;
    private String phone;

    @DBRef
    private Clubs club;  // Reference to Club document

    // Default constructor
    public ClubAdmin() {
    }

    // Parameterized constructor
    public ClubAdmin(String adminId, String username, String email, String password, String phone, Clubs club) {
        this.adminId = adminId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.club = club;  // Set reference to Club object
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Clubs getClub() {
        return club;
    }

    public void setClub(Clubs club) {
        this.club = club;
    }
}
