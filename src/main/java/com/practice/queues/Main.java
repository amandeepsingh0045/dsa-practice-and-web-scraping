package com.practice.queues;


public class Main {

    public static void main (String [] args){
        ArrayQueue queue = new ArrayQueue(10);
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
