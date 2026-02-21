package com.practice.leetcode;

public class MaximumSumSubArrayOfSizeK {

    public static void main(String[] args){
      int[] arr =  {2, 1, 5, 1, 3, 2};
      int k =3;
      int n = arr.length;

      int windowSum =0 ;
      for(int i =0; i<k;i++){
          windowSum+=arr[i];
      }

      int maxSum = windowSum;
      for (int j =k;j<n;j++){
          windowSum+=arr[j];
          windowSum-=arr[j-k];
          maxSum= Math.max(windowSum,maxSum);
      }

      System.out.println(maxSum);
    }
}
