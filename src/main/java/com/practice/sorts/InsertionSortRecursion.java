package com.practice.sorts;

public class InsertionSortRecursion {

    public static void main (String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i ;
//
//            for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--){
//                intArray[i] = intArray[i-1];
//            }
//            intArray[i] = newElement;
//        }
            insertionSort(intArray,intArray.length);
        for (int num : intArray) System.out.println(num);
    }


    public static void insertionSort(int [] input ,int numItems ){
        if(numItems<2){
            return;
        }

        insertionSort(input,numItems-1);
        int newElement = input[numItems-1];

        int i ;

        for(i=numItems-1;i>0 && input[i-1]>newElement;i--){
            input[i] = input[i-1];
        }
        input[i] = newElement;

        System.out.println("Result of call when numItems ="+ numItems);
        for(i =0;i<input.length;i++){
            System.out.print(input[i]);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------");

    }

}
