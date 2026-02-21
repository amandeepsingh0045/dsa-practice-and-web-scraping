package com.practice.vector;

import com.practice.lists.Employee;

import java.util.List;
import java.util.Vector;

public class Main {
     public static void main ( String[]args) {

         List<com.practice.lists.Employee> employeeList = new Vector<>();
         employeeList.add(new com.practice.lists.Employee("john", "doe", 45));
         employeeList.add(new com.practice.lists.Employee("jenns", "dddhd", 56));
         employeeList.add(new com.practice.lists.Employee("Jolly", "llb", 98));
         employeeList.add(new com.practice.lists.Employee("jaman", "doedddd", 10));


//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));

       //  System.out.println(employeeList.isEmpty());

         employeeList.set(1, new com.practice.lists.Employee("Aman, ", "deep", 1234));
         // employeeList.forEach(employee -> System.out.println(employee));
         employeeList.add(2, new com.practice.lists.Employee("qwerty", "developer", 987));

       //  employeeList.forEach(employee -> System.out.println(employee));


         com.practice.lists.Employee[] employeeArray = employeeList.toArray(new com.practice.lists.Employee[employeeList.size()]);
         for (com.practice.lists.Employee employee:employeeArray){
             System.out.println(employee);
         }

         System.out.println(employeeList.contains((new com.practice.lists.Employee("john", "doe", 45))));

         System.out.println(employeeList.indexOf((new Employee("john", "doe", 45))));


         employeeList.remove(3);
           employeeList.forEach(employee -> System.out.println(employee));
     }
}
