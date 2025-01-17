package com.example.FiveCNotesBackend.user;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public User(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getEmail() {
        return this.email;
    }
}
