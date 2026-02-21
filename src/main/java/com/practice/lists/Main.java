package com.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main ( String[]args) {

         List<Employee> employeeList = new ArrayList<>();
         employeeList.add(new Employee("john", "doe", 45));
         employeeList.add(new Employee("jenns", "dddhd", 56));
         employeeList.add(new Employee("Jolly", "llb", 98));
         employeeList.add(new Employee("jaman", "doedddd", 10));


//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));

       //  System.out.println(employeeList.isEmpty());

         employeeList.set(1, new Employee("Aman, ", "deep", 1234));
         // employeeList.forEach(employee -> System.out.println(employee));
         employeeList.add(2, new Employee("qwerty", "developer", 987));

       //  employeeList.forEach(employee -> System.out.println(employee));


         Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
         for (Employee employee:employeeArray){
             System.out.println(employee);
         }

         System.out.println(employeeList.contains((new Employee("john", "doe", 45))));

         System.out.println(employeeList.indexOf((new Employee("john", "doe", 45))));


         employeeList.remove(3);
           employeeList.forEach(employee -> System.out.println(employee));
     }
}
