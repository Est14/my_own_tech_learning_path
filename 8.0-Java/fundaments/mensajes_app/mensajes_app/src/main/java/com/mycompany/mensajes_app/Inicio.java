/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author estebancode14
 */
public class Inicio {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("\n-------------");
            System.out.println("Aplicaicon de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar los mensajes");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminas un mensaje");
            System.out.println("5. Salir");
            // Leemos la opcion del usuario
            opcion = sc.nextInt();
            
        }while(opcion != 5);
        
        
    } 
}
