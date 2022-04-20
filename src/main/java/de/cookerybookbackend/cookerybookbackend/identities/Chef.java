package de.cookerybookbackend.cookerybookbackend.identities;

import org.springframework.data.annotation.Id;

import java.time.Instant;

public class Chef {

    @Id
    private String id;

    private String username;

    private String email;

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
}
