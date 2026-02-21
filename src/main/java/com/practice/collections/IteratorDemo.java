package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main( String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(3);


//        for( int element : list1){
//           // generated ConcurrentModification Exception
//            if(element==9){
//              //  list1.remove(Integer.valueOf(element));
//                list1.remove(0);
//                System.out.println("After loop");
//            }
//          //  System.out.println("After loop");
//        }

       Iterator<Integer> iterator =list1.iterator() ;
       while (iterator.hasNext()){
          // System.out.println("Element  :"+ iterator.next());
           if(iterator.next()==9) {
               iterator.remove();
           }
       }
       System.out.println("list1"+ list1);


       list1.forEach(System.out::println);

    }
}
