package com.practice.sorts;

public class ElementInArray {

    public static void main ( String[] args){
        int [] intArray = new int[7];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        intArray[5] = 70;
        intArray[6] = 70;

        for ( int i = 0 ; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        int index =0 ;
        for ( int i = 0 ; i<intArray.length;i++){
            if(intArray[i]==50){
                index = i ;
                break;
            }
        }
        System.out.println("index is "+ index);

    }
}
