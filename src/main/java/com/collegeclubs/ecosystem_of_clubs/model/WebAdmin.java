package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Web_Admin")
public class WebAdmin {
    
    @Id
    private String waId;
    private String waName;  // Foreign key from Web_Login
    private String email;
    private String password;
    private String phone;

    // Constructors
    public WebAdmin() {}

    public WebAdmin(String waId, String waName,String password,  String email, String phone) {
        this.waId = waId;
        this.waName = waName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    // Getters and Setters
    public String getWaId() {
        return waId;
    }

    public void setWaId(String waId) {
        this.waId = waId;
    }

    public String getWaName() {
        return waName;
    }

    public void setWaName(String waName) {
        this.waName = waName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
