package com.practice.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {

    public static void main(String[] args){
        dequeTest();
    }


    private static void dequeTest(){
        System.out.println("Inside the Deque");
        // Queue -FIFO
        Deque <String> deque = new ArrayDeque<>();
        deque.add("Walden");
        deque.add("Head first java");
        deque.add("harry potter");

        System.out.println("\nPrinting the Queue");
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());


        // Stack LIFO
        System.out.println("\nPrinting the Stack");
        deque.push("Walden");
        deque.push("Head first java");
        deque.push("harry potter");
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
