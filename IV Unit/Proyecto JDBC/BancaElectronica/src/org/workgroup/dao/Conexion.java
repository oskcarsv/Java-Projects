package org.workgroup.dao;

import java.sql.*;


public class Conexion {
    private Connection conexion;
    private static Conexion instancia;
    
    private Conexion (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/banca_electronica?useSSL=false",
                        "root",
                        "admin");
        }catch(ClassNotFoundException | SQLException |
                InstantiationException | IllegalAccessException e){
                               
        }
    }
    
    public static Conexion getInstance (){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    
    public Connection getConexion (){
        return conexion;
    }
    
    public void setConexcion (Connection conexion) {
        this.conexion = conexion;
    }
}
