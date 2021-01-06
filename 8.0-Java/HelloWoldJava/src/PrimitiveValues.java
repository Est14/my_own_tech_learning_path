import static java.lang.System.in;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteb
 */

public class PrimitiveValues {
    
    public static void main(String argrs[]){
        System.out.println("Valos minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valos maximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valos minimo short: " + Short.MIN_VALUE);
        System.out.println("Valos minimo short: " + Short.MAX_VALUE);
        // Por default utilizamos los tipos int.
        System.out.println("Valos minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valos minimo int: " + Integer.MAX_VALUE);
        
        // Para los flotantes Java por default utiliza el duble
        float num = 10.0F;
        float num2 = (float) 30.3;
        double num3 = 100.12;
        
        System.out.println("Valos minimo float: " + Float.MIN_VALUE);
        System.out.println("Valos minimo float: " + Float.MAX_VALUE);
        System.out.println("Valos minimo double: " + Double.MIN_VALUE);
        System.out.println("Valos minimo double: " + Double.MAX_VALUE);
        
        // var puede inferir o interpretar el valor que va a almacenar
        var number = 10.0;
        var number2 = 10.0F;
        var number3 = 10;
        
        // Caracteres unicode
        char letter = 33;
        var letter2 = '\u0021';
        
        // Si agregamos un simbolo a un int pues imprime el valor decimal de ese simbol
        int letter3 = '!';
        
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println(letter3);
        
        
        // Conversion de tipos 
        // Convertir un tipo String a int
        
        var age = Integer.parseInt("20");
        var PI = Double.parseDouble("3.1416");
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        
        if (edad >= 18){
            System.out.println("Usted es mayor de edad!");
        }else{
            System.out.println("Usted es menor de edad!");
        }
        
        // Convertinr de un tipo int a String 
        
        var edadString = String.valueOf(10);
    }
}
