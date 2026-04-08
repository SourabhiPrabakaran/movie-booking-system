package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    private BookingSystem system = new BookingSystem();

    public App() {
        system.addSeat("A1");
        system.addSeat("A2");
        system.addSeat("A3");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Movie Booking System Running 🎬";
    }

    @GetMapping("/check/{seat}")
    public String check(@PathVariable String seat) {
        return system.isAvailable(seat) ? "Seat Available" : "Seat Not Available";
    }

    @GetMapping("/book/{seat}/{user}")
    public String book(@PathVariable String seat, @PathVariable String user) {
        return system.bookSeat(seat, user);
    }
}