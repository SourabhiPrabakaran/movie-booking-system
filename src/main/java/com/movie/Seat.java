package com.movie;

public class Seat {
    private String id;
    private boolean booked;
    private String user;

    public Seat(String id) {
        this.id = id;
        this.booked = false;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book(String user) {
        this.booked = true;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getId() {
        return id;
    }
}