package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.IdentificadorClientes;
import org.workgroup.view.MenuAdmin;


public class IdentificadorClientesController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarIdentificador(){
        String opcionListarIdentificador;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_listarIdentificadorClientes();");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                IdentificadorClientes iClientes = new IdentificadorClientes();
                iClientes.setIdIdentificadorCliente(resultado.getInt(1));
                iClientes.setNombreIdentificadorCliente(resultado.getString(2));
                System.out.println(iClientes.listarIdentificadorClientes());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Identificador Clientes? (Si / No) ");
            System.out.println("                                                         ");                                                
            opcionListarIdentificador = leer.next();
                        
            switch (opcionListarIdentificador){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuIdentificadorAdmin();
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

    public void buscarIdentificador(){
        String opcionBuscarIdentificador;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese ID de la Compania a Buscar     ");
        System.out.println("                                       ");        
        int idIdentificadorCliente = leer.nextInt();
        System.out.println("                                       ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarCompaniaTelefonica(?);");
            sp.setInt(1,idIdentificadorCliente);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                IdentificadorClientes iClientes = new IdentificadorClientes();
                iClientes.setIdIdentificadorCliente(resultado.getInt(1));
                iClientes.setNombreIdentificadorCliente(resultado.getString(2));
                System.out.println(iClientes.listarIdentificadorClientes());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otro Identificador? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionBuscarIdentificador = leer.next();
                        
            switch (opcionBuscarIdentificador){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarIdentificador();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuIdentificadorAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
