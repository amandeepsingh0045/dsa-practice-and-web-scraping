package com.practice.circularqueue;


public class Main {

    public static void main (String [] args){
        CircularQueue queue = new CircularQueue(5);
        queue.add(new Employee("John","Doe",12));
        queue.add(new Employee("Jane","Desef",13));
        queue.add(new Employee("Ram","Fucjs",14));
        queue.add(new Employee("Shayn","Doeee",15));


 ;


//        System.out.println(queue.peek());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
         queue.add(new Employee("Saurabh","kumar",45));

        queue.printQueue();
    }
}
