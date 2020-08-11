/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LuisJavier-PC
 */
public class conexion {
    Connection conectar = null;
    public Connection conectando (){
        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:diabetencion.sqlite");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
