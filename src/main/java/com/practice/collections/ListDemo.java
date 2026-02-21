package com.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {
   public static void main (String[] args){
       arrayListDemo();
    }

    private static void arrayListDemo(){
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
      //  list1.add(null);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        System.out.println(list1);
        list1.remove(2);
        list1.add(0,10);
        list1.set(0,9);
        System.out.println(list1);


        // Bulk Operations
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);

       // list1.removeAll(list2);
        System.out.println("List1 after removing all element of lsit2"+ list1);
      //  list1.retainAll(list2);
        System.out.println("List1 after retaining all element of lsit2"+ list1);
        list1.addAll(list2);
        System.out.println(list1);

        // Search Operations
        System.out.println(list1.indexOf(null));
        System.out.println(list1.contains(3));
        System.out.println(list1.lastIndexOf(3));

        // Range View Opearations
        System.out.println(list1.subList(3,6));

        // Iterator  Operations
//        for( int element : list1){
//            System.out.println("element "+element);
//            if(element==9){
//                list1.remove(Integer.valueOf(9));
//            }
//        }

    }
}
