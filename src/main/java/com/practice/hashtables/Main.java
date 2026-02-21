package com.practice.hashtables;



public class Main {

    public static void main (String [] args) {
        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Doe",new Employee("John", "Doe", 12));
        ht.put("Bond",new Employee("Jane", "Bond", 13));
        ht.put("Fuck",new Employee("Ram", "Fuck", 14));
        ht.put("Doeeee",new Employee("Shayn", "Doeeee", 15));
        ht.put("Sim",new Employee("Aman", "Sim", 16));

       // ht.printHashtable();

        ht.remove("Doe");
        ht.remove("Sim");
        ht.printHashtable();
    }
}
