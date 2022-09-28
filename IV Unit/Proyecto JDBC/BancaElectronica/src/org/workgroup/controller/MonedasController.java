package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Monedas;
import org.workgroup.view.MenuAdmin;


public class MonedasController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarMonedas(){
        String opcionListarMonedas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_listarMonedas();");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Monedas monedas = new Monedas();
                monedas.setIdMoneda(resultado.getInt(1));
                monedas.setNombreMoneda(resultado.getString(2));
                System.out.println(monedas.listarMonedas());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Monedas? (Si / No) ");
            System.out.println("                                                         ");                                                
            opcionListarMonedas = leer.next();
                        
            switch (opcionListarMonedas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuMonedasAdmin();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuAdministrador();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
    }

    public void buscarMonedas(){
        String opcionBuscarMonedas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese ID de la Moneda a Buscar       ");
        System.out.println("                                       ");        
        int idMoneda = leer.nextInt();
        System.out.println("                                       ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarMonedas(?);");
            sp.setInt(1,idMoneda);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Monedas monedas = new Monedas();
                monedas.setIdMoneda(resultado.getInt(1));
                monedas.setNombreMoneda(resultado.getString(2));
                System.out.println(monedas.listarMonedas());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Moneda? (Si / No)                      ");
            System.out.println("                                                         ");                                                
            opcionBuscarMonedas = leer.next();
                        
            switch (opcionBuscarMonedas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarMonedas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuMonedasAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
