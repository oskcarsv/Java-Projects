package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.ProveedorServicios;
import org.workgroup.view.MenuAdmin;


public class ProveedorServiciosController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarProveedor(){
        String opcionListarProveedor;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_listarProveedorServicios();");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                ProveedorServicios pServicios = new ProveedorServicios();
                pServicios.setIdTipoProveedor(resultado.getInt(1));
                pServicios.setNombreProveedorServicio(resultado.getString(2));
                pServicios.setTipoServicio(resultado.getString(3));
                pServicios.setDescripcionServicio(resultado.getString(4));
                System.out.println(pServicios.listarProveedoresServicios());
            }
            
            System.out.println("                                                           ");                                
            System.out.println("Desea regresar al menu Proveedores de Servicios? (Si / No) ");
            System.out.println("                                                           ");                                                
            opcionListarProveedor = leer.next();
                        
            switch (opcionListarProveedor){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuProveedoresAdmin();
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

    public void buscarProveedor(){
        String opcionBuscarProveedor;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese ID de la Compania a Buscar     ");
        System.out.println("                                       ");        
        int idIdentificadorCliente = leer.nextInt();
        System.out.println("                                       ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarProveedorServicios(?);");
            sp.setInt(1,idIdentificadorCliente);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                ProveedorServicios pServicios = new ProveedorServicios();
                pServicios.setIdTipoProveedor(resultado.getInt(1));
                pServicios.setNombreProveedorServicio(resultado.getString(2));
                pServicios.setTipoServicio(resultado.getString(3));
                pServicios.setDescripcionServicio(resultado.getString(4));
                System.out.println(pServicios.listarProveedoresServicios());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otro Proveedor? (Si / No)                   ");
            System.out.println("                                                         ");                                                
            opcionBuscarProveedor = leer.next();
                        
            switch (opcionBuscarProveedor){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarProveedor();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuProveedoresAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
