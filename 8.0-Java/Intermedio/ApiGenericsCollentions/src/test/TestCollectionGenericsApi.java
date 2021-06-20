package test;

import java.util.*;

public class TestCollectionGenericsApi {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        print(myList);
        System.out.println();

        Set<String> mySet = new HashSet<>();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Friday");

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Esteban");
        myMap.put(2, "Santiago");
        myMap.put(3, "Miguel");

        print(myMap.values());
        print(myMap.keySet());

    }

   public static void print(Collection x){
        x.forEach(element -> {
            System.out.println(element);
        });
   }
}
