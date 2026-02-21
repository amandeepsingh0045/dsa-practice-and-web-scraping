package com.practice.circularqueue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] queue ;
    private int front ;
    private int back ;

    public CircularQueue(int capacity){
        queue = new Employee[capacity];

    }


    public void add(Employee employee){
        if(size()==queue.length-1){
            int numItems = size();
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue = newArray;
            front = 0;
            back = numItems;
        }
        //0 - jane - front
        //1 - john
        //2 - mary
        //3 -mike
        //4  - bill            - back
        //5
        //6

        //0 - jane - front
        //1 - john-
        //2 - mary  -- back
        //3 -mike
        queue[back]= employee;
        if(back<queue.length-1){
            back++;
        }else {
            back =0;
        }

    }

    public Employee remove (){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front]= null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }else if(front==queue.length) {
                front =0;
            }


        return employee;
    }

    public Employee peek (){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return queue[front];
    }

    public int size(){
        if(front<= back){
            return  back-front;
        }
        else {
             return  back-front + queue.length;
        }
    }

    public boolean isEmpty(){
        return size() ==0;
    }


    public void printQueue(){
        if(front<= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else {
            for(int i = front;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            for(int i = 0;i<back;i++){
                System.out.println(queue[i]);
            }

        }
    }
}


