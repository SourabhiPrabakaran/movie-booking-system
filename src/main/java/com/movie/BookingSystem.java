package com.movie;

import java.util.*;

public class BookingSystem {

    private Map<String, Seat> seats = new HashMap<>();

    public void addSeat(String id) {
        seats.put(id, new Seat(id));
    }

    public boolean isAvailable(String id) {
        return seats.containsKey(id) && !seats.get(id).isBooked();
    }

    public String bookSeat(String id, String user) {
        if (!seats.containsKey(id)) return "Seat not found";

        Seat s = seats.get(id);

        if (s.isBooked()) return "Already booked";

        s.book(user);
        return "Booked successfully by " + user;
    }

    public Map<String, Seat> getAllSeats() {
        return seats;
    }
}