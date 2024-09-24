package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "End_User")
public class Users {
    
    @Id
    private String userId;
    private String username;
    private String email;
    private String password;
    private String course;
    private String sem;
    private String phone;

    // Constructors
    public Users() {}

    public Users(String userId, String username, String email, String password, String course, String sem, String phone) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.course = course;
        this.sem = sem;
        this.phone = phone;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
