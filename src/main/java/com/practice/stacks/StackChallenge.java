package com.practice.stacks;

import java.util.LinkedList;

// Using a stack , determine whetehr a string is a palindrome
//Strings may contain punctuation and spaces , They should be ignored  Case should be ignored
//Examples
//1 I did , did I ?" is a aplindrome
//2 Racecar is a palndrome
//3 Hello is not a palindrome
public class StackChallenge {

    public static void main(String[] args){
        System.out.println(isPalindrome("abcbba"));
        System.out.println(isPalindrome(" I did , did I ?"));

    }


    public static boolean isPalindrome(String string ){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringWithoutPuncuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for( int i =0 ; i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c>='a' && c<='z'){
              stringWithoutPuncuation.append(c);
              stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }


        return reversedString.toString().equals(stringWithoutPuncuation.toString());
    }
}
