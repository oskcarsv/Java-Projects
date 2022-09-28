package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.CompaniaTelefonica;
import org.workgroup.view.MenuAdmin;


public class CompaniaTelefonicaController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarCompania(){
        String opcionListarCompania;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_listarCompaniaTelefonica();");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                CompaniaTelefonica cTelefonica = new CompaniaTelefonica();
                cTelefonica.setIdCompania(resultado.getInt(1));
                cTelefonica.setNombreCompania(resultado.getString(2));
                cTelefonica.setExtensionCompania(resultado.getInt(3));
                System.out.println(cTelefonica.listarCompaniaTelefonica());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Compania Telefonica? (Si / No)    ");
            System.out.println("                                                         ");                                                
            opcionListarCompania = leer.next();
                        
            switch (opcionListarCompania){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCompaniasAdmin();
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

    public void agregarCompania(){
        String opcionAgregarCompania;
        String opcionAgregarCompanias;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                         ");        
        System.out.println("Ingrese ID de Compania:                                  ");
        int idCompania = leer.nextInt();
        System.out.println("                                                         ");                
        System.out.println("Ingrese Nombre de Compania:                              ");
        String nombreCompania = leer.next();
        System.out.println("                                                         ");        
        System.out.println("Ingrese Extension de Compania:                           ");
        int extensionCompania = leer.nextInt();
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarCompaniaTelefonica(?,?,?);");
            sp.setInt(1, idCompania);
            sp.setString(2, nombreCompania);
            sp.setInt(3, extensionCompania);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea agregar otra Compania Telefonica? (Si / No)    ");
            System.out.println("                                                         ");                                                
            opcionAgregarCompanias = leer.next();
                        
            switch (opcionAgregarCompanias){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarCompania();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCompaniasAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarCompania(){
        String opcionActualizarCompanias;
        
        MenuAdmin mAdmin = new MenuAdmin();        

        System.out.println("                                                         ");                
        System.out.println("Ingrese ID de compania a actualizar                      ");
        int idCompania = leer.nextInt();
        System.out.println("                                                         ");                
        System.out.println("Ingrese nombre de compania actualizado                   ");
        String nombreCompania = leer.next();
        System.out.println("                                                         ");                
        System.out.println("Ingrese la extension de compania actualizada             ");
        int extensionCompania = leer.nextInt();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarCompaniaTelefonica(?,?,?);");
            sp.setInt(1,idCompania);
            sp.setString(2, nombreCompania);
            sp.setInt(3, extensionCompania);
            sp.execute();
            System.out.println("                                                         ");                                            
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otra Compania Telefonica? (Si / No)     ");
            System.out.println("                                                         ");                                                
            opcionActualizarCompanias = leer.next();
                        
            switch (opcionActualizarCompanias){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.actualizarCompania();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCompaniasAdmin();
                break;
            }
        }catch (SQLException e){
            
        }
    }
    
    public void eliminarCompania(){
        String opcionEliminarCompania;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese el ID de la compania a Eliminar");
        System.out.println("                                       ");                
        int idCompania = leer.nextInt();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_eliminarCompaniaTelefonica(?);");
            sp.setInt(1, idCompania);
            sp.execute();
            System.out.println("                                                         ");                
            System.out.println("Registro Eliminado Exitosamente!                         ");
            System.out.println("                                                         ");                                
            System.out.println("Desea eliminar otra Compania Telefonica? (Si / No)       ");
            System.out.println("                                                         ");                                                
            opcionEliminarCompania = leer.next();
                        
            switch (opcionEliminarCompania){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.eliminarCompania();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCompaniasAdmin();
                break;
            }
            
        }catch(SQLException e ){
            
        }
    }

    public void buscarCompania(){
        String opcionBuscarCompania;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese ID de la Compania a Buscar     ");
        System.out.println("                                       ");        
        int idCompania = leer.nextInt();
        System.out.println("                                       ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarCompaniaTelefonica(?);");
            sp.setInt(1,idCompania);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                CompaniaTelefonica cTelefonica = new CompaniaTelefonica();
                cTelefonica.setIdCompania(resultado.getInt(1));
                cTelefonica.setNombreCompania(resultado.getString(2));
                cTelefonica.setExtensionCompania(resultado.getInt(3));
                System.out.println(cTelefonica.listarCompaniaTelefonica());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Compania? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionBuscarCompania = leer.next();
                        
            switch (opcionBuscarCompania){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarCompania();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCompaniasAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
