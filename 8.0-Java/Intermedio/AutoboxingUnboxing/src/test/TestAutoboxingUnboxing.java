package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        /**
         * Cada uno de los tipos primitivos tiene una clase asociada conocida como wrapper
         *
         * int - Integer
         * long - Long
         * double - Double
         * float - Float
         * boolean = Boolean
         * char - Character
         * byte - Byte
         *
         * Las clases contienen atributos y metodos
         */

        int num = 10;
        Integer num2 = 10; //Autoboxing

        System.out.println(num2);
        System.out.println(num2.toString());
        System.out.println(num2.byteValue());
        System.out.println(num2.toString());
        System.out.println(num2.doubleValue());

        //Unboxing
        int num3 = num2;
    }
}
