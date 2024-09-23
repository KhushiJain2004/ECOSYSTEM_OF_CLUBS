package com.collegeclubs.ecosystem_of_clubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcosystemOfClubsApplication {

	 @GetMapping("/")
    public String check() {
        return "Ecosystem of clubs ";
    }
	public static void main(String[] args) {
		SpringApplication.run(EcosystemOfClubsApplication.class, args);
		
	}

}
