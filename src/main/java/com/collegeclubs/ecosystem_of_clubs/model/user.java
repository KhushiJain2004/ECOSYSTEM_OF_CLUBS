package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "End_User")
public class user {
    
    @Id
    private String userId;
    private String username;
    private String email;
    private String password;
    private String course;
    private String sem;
    private String phone;

    // Constructors
    public user() {}

    public user(String userId, String username, String email, String passsword,String course, String sem, String phone) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = passsword;
        this.course = course;
        this.sem = sem;
        this.phone = phone;
    }

    // Getters and Setters
    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
