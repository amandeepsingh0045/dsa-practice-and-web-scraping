package com.practice.stacks;

public class Main {
    public static void main ( String [] args){
         ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("John","Doe",12));
        stack.push(new Employee("Jane","Desef",13));
        stack.push(new Employee("Ram","Fucjs",14));
        stack.push(new Employee("Shayn","Doeee",15));

    //  stack.printStack();
      //System.out.println(stack.peek());
    //    stack.pop();
        //System.out.println(stack.pop());
     //   stack.push(new Employee("dfwefw","Defwewoeee",16));
      //  stack.printStack();

        LinkedListStack stackOne = new LinkedListStack();
        stackOne.push(new Employee("John","Doe",12));
        stackOne.push(new Employee("Jane","Desef",13));
        stackOne.push(new Employee("Ram","Fucjs",14));
        stackOne.push(new Employee("Shayn","Doeee",15));
        stackOne.printStack();

    }
}
