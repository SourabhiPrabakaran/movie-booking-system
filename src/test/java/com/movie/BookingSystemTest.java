package com.movie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingSystemTest {

    @Test
    void testSeatAvailable() {
        BookingSystem system = new BookingSystem();
        system.addSeat("A1");

        assertTrue(system.isAvailable("A1"));
    }

    @Test
    void testBookingSuccess() {
        BookingSystem system = new BookingSystem();
        system.addSeat("A1");

        String result = system.bookSeat("A1", "user1");
        assertEquals("Booked successfully by user1", result);
    }

    @Test
    void testDuplicateBooking() {
        BookingSystem system = new BookingSystem();
        system.addSeat("A1");

        system.bookSeat("A1", "user1");
        String result = system.bookSeat("A1", "user2");

        assertEquals("Already booked", result);
    }
}