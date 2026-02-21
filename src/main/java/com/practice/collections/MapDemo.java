package com.practice.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
     //   hashMapDemo();
     //   immutableKeyDemo();
        lruCacheTest();
    }

    private static void hashMapDemo() {
        System.out.println("Inside the HashMap Demo");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Aman", 28);
        map1.put("Saurabh", 27);
        map1.put("Hemant", null);
        map1.put("Hemant", 29);
        System.out.println(map1);


        System.out.println(map1.containsKey("Aman") + "  " + map1.get("Aman"));
        System.out.println("Iterating using KeySet");
        Set<String> names = map1.keySet();
        for (String name : names) {
            System.out.println(name);
        }



        System.out.println("Iterating using Map.Entry");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println(mapping.getKey() + ", " + mapping.getValue());
        }

        names.remove("Aman");
        System.out.println(map1);

      Map<String , Map<String , Object>>  userProfile  = new HashMap<>();

        Map<String , Object>  profile = new HashMap<>();
        profile.put("age",25);
        profile.put("dept", "IT");
        profile.put("city","new York");

        userProfile.put("Aman",profile);

        profile = new HashMap<>();
        profile.put("age",29);
        profile.put("dept", "CS");
        profile.put("city","Delhi");

        userProfile.put("Atul",profile);
        System.out.println(userProfile);


        Map<String,Object> profile1 = userProfile.get("Aman");
        System.out.println(profile1.get("age"));

        System.out.println(profile1.values());


    }


    private static void immutableKeyDemo(){
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Map<List<Integer>,Integer> map = new HashMap<>();
        map.put(list,1);

        list.add(2);
        System.out.println(map.get(list));

        Student s = new Student(1, null);
        Map<Student,Integer> map2 = new HashMap<>();
        map2.put(s,1);
        s.setName("Aman");
        System.out.println(map2.get(s));

    }


    private static  void lruCacheTest(){
        System.out.println("Inside the LRU (Least Recently Used ) Cache Test ");
        Map<String,String> lruCache = new LinkedHashMap<>(16,0.75f,false);
        lruCache.put("a","aman");
        lruCache.put("b","benny");
        lruCache.put("c","chad");

        System.out.println(lruCache);
        lruCache.get("a");
        lruCache.get("a");
        lruCache.get("a");
        lruCache.get("a");
        System.out.println(lruCache);
        lruCache.put("d","dhreeaj");
        lruCache.put("e","emily");
        System.out.println(lruCache);

        

    }


}
class Student{
    private int id ;
    private String name ;

    public void setId(int id){
        this.id = id ;
    }

    public int getId(){
        return id ;
    }

    public void setName(String name ){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public Student(int id , String name ){
        this.id=id;
        this.name=name;
    }
}