package com.practice.collections.problems;
// 1. Movie Seat Booking System (Very Easy)
//        Concepts: ArrayList, size limit
//        Problem
//        A movie theatre has 5 seats.
//        Maintain a List<String> bookedSeats
//        Implement:
//        boolean bookSeat(String seatNumber)
//        boolean cancelSeat(String seatNumber)
//        Booking fails if seats are full
//        Cancellation removes the seat if found
//        Rules
//        No waiting list
//        Use Iterator for cancellation
//         Goal: Practice iterator removal & size check


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieSeatBookingSystem {
    private static final int SEAT_LIMIT = 5;

    // Stores booked seat numbers like "A1", "A2"
    private List<String> bookedSeats = new ArrayList<>();

    // Book a seat
    public boolean bookSeat(String seatNumber) {
        if(bookedSeats.size()==SEAT_LIMIT){
            return false;
        } // Check if seat already booked
        if (bookedSeats.contains(seatNumber)) {
            return false;
        }

        // Book the seat
        bookedSeats.add(seatNumber);
        return true;
    }

    // Cancel a seat
    public boolean cancelSeat(String seatNumber) {
        // TODO:
        // 1. Use Iterator to loop bookedSeats
        // 2. If seatNumber matches → remove using iterator.remove()
        // 3. Return true if removed
        // 4. Return false if not found
        Iterator<String> iterator = bookedSeats.iterator();
        while (iterator.hasNext()){
            String bookedSeat = iterator.next();
            if(bookedSeat==seatNumber){
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    // Optional helper (for debugging)
    public void printBookedSeats() {
        System.out.println(bookedSeats);
    }


    public static void main(String[] args){
        MovieSeatBookingSystem m = new MovieSeatBookingSystem();
        m.bookSeat("A1"); // true
        m.bookSeat("A2"); // true
        m.bookSeat("A1"); // false (already booked)
        m.cancelSeat("A2"); // true
        m.bookSeat("B1"); // true


        m.printBookedSeats();
    }

}
