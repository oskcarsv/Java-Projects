package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.TipoCuentas;
import org.workgroup.view.MenuAdmin;


public class TipoCuentasController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarTipoCuentas(){
        String opcionListarTipoCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_listarTipoCuentas();");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                TipoCuentas tCuentas = new TipoCuentas();
                tCuentas.setIdTipoCuenta(resultado.getInt(1));
                tCuentas.setNombreCuenta(resultado.getString(2));
                tCuentas.setDescripcionCuenta(resultado.getString(3));
                System.out.println(tCuentas.listarTipoCuentas());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Tipo Cuentas? (Si / No)           ");
            System.out.println("                                                         ");                                                
            opcionListarTipoCuentas = leer.next();
                        
            switch (opcionListarTipoCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTiposCuentasAdmin();
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

    public void buscarTipoCuentas(){
        String opcionBuscarTipoCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                       ");        
        System.out.println("Ingrese ID del Tipo de Cuenta a Buscar ");
        System.out.println("                                       ");        
        int idTipoCuenta = leer.nextInt();
        System.out.println("                                       ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarTipoCuentas(?);");
            sp.setInt(1,idTipoCuenta);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                TipoCuentas tCuentas = new TipoCuentas();
                tCuentas.setIdTipoCuenta(resultado.getInt(1));
                tCuentas.setNombreCuenta(resultado.getString(2));
                tCuentas.setDescripcionCuenta(resultado.getString(3));
                System.out.println(tCuentas.listarTipoCuentas());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Tipo de Cuenta? (Si / No)              ");
            System.out.println("                                                         ");                                                
            opcionBuscarTipoCuentas = leer.next();
                        
            switch (opcionBuscarTipoCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarTipoCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTiposCuentasAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
