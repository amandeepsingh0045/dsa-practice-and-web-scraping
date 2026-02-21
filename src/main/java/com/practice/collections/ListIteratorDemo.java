package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main ( String[] args){
          listIteratorDemo();
    }

    public static void listIteratorDemo(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        System.out.println("Displaying the current Elements");
//        for(ListIterator<String> iterator = list.listIterator();iterator.hasNext();){
//          System.out.println("iterator nextindex= "+iterator.nextIndex()+"  ;iterator.next = "+iterator.next());
//        }

        // add , remove and setoperatoons
        for(ListIterator<String> iterator = list.listIterator();iterator.hasNext();){
            //System.out.println("iterator nextindex= "+iterator.nextIndex()+"  ;iterator.next = "+iterator.next());
            if(iterator.nextIndex()==1){
                iterator.add("This");
            }
            System.out.println("iterator nextindex= "+iterator.nextIndex()+"  ;iterator.next = "+iterator.next());
        }
    }



}
