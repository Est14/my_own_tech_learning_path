package test;

import java.util.*;


public class TestCollection {

    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        //print(myList);

        // for (var element:myList) {
          //  System.out.println(element);
        //}
        System.out.println();

        Set mySet = new HashSet();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Friday");
        //print(mySet);

        Map myMap = new HashMap();
        myMap.put(1, "Esteban");
        myMap.put(2, "Santiago");
        myMap.put(3, "Miguel");

        print(myMap.keySet());
        print(myMap.values());
    }

    public static void print(Collection x){
        x.forEach(element -> {
            System.out.println(element);
        });
    }
}
