package test;

import generics.GenericClass;

public class TestGeneric {

    public static void main(String[] args) {

        GenericClass<Integer> obj1 = new GenericClass(1914);
        GenericClass<String> obj2 = new GenericClass("Esteban");

        obj1.getType();
        obj2.getType();
    }
}
