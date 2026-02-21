package com.practice.collections.problems;

import java.util.*;

public class TrainTicketReservation {
    private static final int CONFIRMEDTICKET_LIMIT = 5;
    private static final int WAITINGLIST_LIMIT = 3;

    private List<String> confirmedList = new ArrayList<>();
    private Deque<String> waitingList = new ArrayDeque<>();

    public boolean bookTicket(String ticketId){

        // Duplicate check
        if (confirmedList.contains(ticketId) || waitingList.contains(ticketId)) {
            return false;
        }

        // Add to confirmed list
        if (confirmedList.size() < CONFIRMEDTICKET_LIMIT) {
            confirmedList.add(ticketId);
            return true;
        }

        // Add to waiting list
        if (waitingList.size() < WAITINGLIST_LIMIT) {
            waitingList.add(ticketId); // queue behavior
            return true;
        }

        return false; // both full
    }

    public boolean cancelTicket(String ticketId){

        // Try removing from confirmed list
        Iterator<String> confirmedIterator = confirmedList.iterator();
        while (confirmedIterator.hasNext()) {
            String id = confirmedIterator.next();
            if (id.equals(ticketId)) {
                confirmedIterator.remove();

                // Promote from waiting list
                String waitingTicket = waitingList.poll();
                if (waitingTicket != null) {
                    confirmedList.add(waitingTicket);
                }
                return true;
            }
        }

        // Try removing from waiting list
        Iterator<String> waitingIterator = waitingList.iterator();
        while (waitingIterator.hasNext()) {
            String id = waitingIterator.next();
            if (id.equals(ticketId)) {
                waitingIterator.remove();
                return true;
            }
        }

        return false;
    }





    public static void main(String [] args){

    }
}
