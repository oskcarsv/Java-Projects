package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Consultas;
import java.sql.Date;
import org.workgroup.view.MenuPrincipal;
import org.workgroup.view.MenuUsuario;


public class ConsultasController {
    
    Scanner leer = new Scanner(System.in);    
    
    public void consultaDeFechas(){
        String opcionConsultaFechas;
        
        MenuUsuario mUsuario = new MenuUsuario();                
        MenuPrincipal mPrincipal = new MenuPrincipal();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Consulta_Fechas;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Consultas consultas = new Consultas();
                consultas.setDescripcionTransaccion(resultado.getString(1));
                consultas.setFechaDeTransaccion(resultado.getDate(2));
                consultas.setNombreUsuario(resultado.getString(3));
                System.out.println(consultas.consultaDeFechas());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu User? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionConsultaFechas = leer.next();
                        
            switch (opcionConsultaFechas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mPrincipal.Inicio();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    public void historial(){
        String opcionConsultaFechas;
        
        MenuUsuario mUsuario = new MenuUsuario();                
        MenuPrincipal mPrincipal = new MenuPrincipal();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Historial;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Consultas consultas = new Consultas();
                consultas.setUsuario(resultado.getString(1));
                consultas.setSaldoCuenta(resultado.getDouble(2));
                consultas.setIdentificadorPago(resultado.getString(3));
                consultas.setDescripcion(resultado.getString(4));
                consultas.setMontoPago(resultado.getDouble(5));
                consultas.setFechaTransaccion(resultado.getDate(6));
                consultas.setProveedor(resultado.getString(7));
                consultas.setServicio(resultado.getString(8));
                System.out.println(consultas.historial());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu User? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionConsultaFechas = leer.next();
                        
            switch (opcionConsultaFechas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mPrincipal.Inicio();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
