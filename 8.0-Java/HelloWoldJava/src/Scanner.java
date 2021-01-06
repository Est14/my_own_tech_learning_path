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
public class Scanner {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Write your Name: ");
        var user = consola.nextLine();
        System.out.println("Write your Degree: ");
        var degree = consola.nextLine();
        System.out.println("Mr: " + user + "is a " + degree);
        
        
        
    }

   
    
}
