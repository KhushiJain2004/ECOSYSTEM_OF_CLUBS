package com.collegeclubs.ecosystem_of_clubs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Events")
public class Events {
    
    @Id
    private String eventId;
    private String eName;
    private String description;
    private String clubId;  // Foreign key from Club
    private List<String> tag;

    // Constructors
    public Events() {}

    public Events(String eventId, String eName, String description, String clubId, List<String> tag) {
        this.eventId = eventId;
        this.eName = eName;
        this.description = description;
        this.clubId = clubId;
        this.tag = tag;
    }

    // Getters and Setters
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getclubId() {
        return clubId;
    }

    public void setclubId(String clubId) {
        this.clubId = clubId;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }
}

