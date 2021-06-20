/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author estebancode14
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection connection = null;
        try{    // Esto es para poder conectarno a la base de datos
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "java_test","root","Uri14!"
                );

    }catch(SQLException e){
            System.out.println(e);
    }
   
    return connection;
}
}
