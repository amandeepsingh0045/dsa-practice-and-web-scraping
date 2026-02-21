package com.practice.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main ( String[] args){
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3425);


        Map<String,Employee> hashMap = new HashMap<>();
        hashMap.put("Jones",janeJones);
        hashMap.put("Doe",johnDoe);
        hashMap.put("Smith",marySmith);
        hashMap.put("Wilson",mikeWilson);

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(marySmith));


        System.out.println(hashMap.getOrDefault("Doeddd",marySmith));



//        Iterator<Employee> employeeIterator = hashMap.values().iterator();
//        while (employeeIterator.hasNext()){
//            System.out.println(employeeIterator.next());
//        }

        hashMap.forEach((k,v)->System.out.println("Key ="+k +"  Employee="+v));


    }
}
