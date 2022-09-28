package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Cuentas;
import org.workgroup.view.MenuAdmin;
import org.workgroup.view.MenuUsuario;


public class CuentasController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarCuentas(){
        String opcionListarCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Cuentas;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Cuentas cuentas = new Cuentas();
                cuentas.setIdCuenta(resultado.getLong(1));
                cuentas.setSaldoCuenta(resultado.getInt(2));
                cuentas.setTipoCuenta(resultado.getString(3));
                cuentas.setDescripcionCuenta(resultado.getString(4));
                cuentas.setMoneda(resultado.getString(5));
                System.out.println(cuentas.listarCuentas());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Cuentas? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionListarCuentas = leer.next();
                        
            switch (opcionListarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCuentasAdmin();
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

    public void agregarCuentas(){
        String opcionAgregarCuentas;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de cuenta:                                         ");
        long idCuenta = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Saldo de Cuenta:                                      ");
        double saldoCuenta = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo Cuenta:                                       ");
        System.out.println("    * 1. Depositos Monetarios                                 ");
        System.out.println("    * 2. Ahorro                                               ");
        System.out.println("    * 3. Tarjeta de Credito                                   ");
        System.out.println("    * 4. Prestamo                                             ");
        System.out.println("    * 5. Fondo de Pension                                     ");
        int idTipoCuenta = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Moneda:                                            ");
        System.out.println("    * 1. Euros                                                ");
       System.out.println("     * 2. Dolares                                              ");
        System.out.println("    * 3. Quetzales                                            ");
        System.out.println("    * 4. Libra Esterlina                                      ");
        int idMoneda = leer.nextInt();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarCuentas(?,?,?,?);");
            sp.setLong(1, idCuenta);
            sp.setDouble(2, saldoCuenta);
            sp.setInt(3, idTipoCuenta);
            sp.setInt(4, idMoneda);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea crear otra Cuenta? (Si / No)                  ");
            System.out.println("                                                         ");                                                
            opcionAgregarCuentas = leer.next();
                        
            switch (opcionAgregarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCuentasAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarCuentas(){
        String opcionActualizarCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();        

        System.out.println("                                                                           ");                
        System.out.println("Ingrese ID de Cuenta a Actualizar                                          ");
        long idCuenta = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Saldo de Cuenta:                                      ");
        double saldoCuenta = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo Cuenta:                                       ");
        System.out.println("    * 1. Depositos Monetarios                                 ");
        System.out.println("    * 2. Ahorro                                               ");
        System.out.println("    * 3. Tarjeta de Credito                                   ");
        System.out.println("    * 4. Prestamo                                             ");
        System.out.println("    * 5. Fondo de Pension                                     ");
        int idTipoCuenta = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Moneda:                                            ");
        System.out.println("    * 1. Euros                                                ");
       System.out.println("     * 2. Dolares                                              ");
        System.out.println("    * 3. Quetzales                                            ");
        System.out.println("    * 4. Libra Esterlina                                      ");
        int idMoneda = leer.nextInt();

        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarCuenta(?,?,?,?);");
            sp.setLong(1, idCuenta);
            sp.setDouble(2, saldoCuenta);
            sp.setInt(3, idTipoCuenta);
            sp.setInt(4, idMoneda);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otra Cuenta? (Si / No)                  ");
            System.out.println("                                                         ");                                                
            opcionActualizarCuentas = leer.next();
                        
            switch (opcionActualizarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.actualizarCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCuentasAdmin();
                break;
            }
            
        }catch (SQLException e){
            
        }
    }
    
    public void buscarCuentas(){
        String opcionBuscarCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID de la Cuenta a Buscar                ");
        System.out.println("                                                ");        
        long idCuenta = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarCuentas(?);");
            sp.setLong(1, idCuenta);            
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Cuentas cuentas = new Cuentas();
                cuentas.setIdCuenta(resultado.getLong(1));
                cuentas.setSaldoCuenta(resultado.getInt(2));
                cuentas.setTipoCuenta(resultado.getString(3));
                cuentas.setDescripcionCuenta(resultado.getString(4));
                cuentas.setMoneda(resultado.getString(5));
                System.out.println(cuentas.listarCuentas());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Cuenta? (Si / No)                      ");
            System.out.println("                                                         ");                                                
            opcionBuscarCuentas = leer.next();
                        
            switch (opcionBuscarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCuentasAdmin();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
    }
    
    public void eliminarCuentas(){
        String opcionEliminarCuentas;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID de la cuenta a eliminar              ");
        System.out.println("                                                ");                
        long idCuenta = leer.nextInt();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_eliminarCuentas(?);");
            sp.setLong(1, idCuenta);
            sp.execute();
            System.out.println("                                                         ");                
            System.out.println("Registro Eliminado Exitosamente!                         ");
            System.out.println("                                                         ");                                
            System.out.println("Desea eliminar otra Cuenta? (Si / No)       ");
            System.out.println("                                                         ");                                                
            opcionEliminarCuentas = leer.next();
                        
            switch (opcionEliminarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.eliminarCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuCuentasAdmin();
                break;
            }
            
        }catch(SQLException e ){
            
        }
    }
    
    public void crearCuentas(){
        String opcionCrearCuentas;

        MenuUsuario mUsuario = new MenuUsuario();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de cuenta:                                         ");
        long idCuenta = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Saldo de Cuenta:                                      ");
        double saldoCuenta = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo Cuenta:                                       ");
        System.out.println("    * 1. Depositos Monetarios                                 ");
        System.out.println("    * 2. Ahorro                                               ");
        System.out.println("    * 3. Tarjeta de Credito                                   ");
        System.out.println("    * 4. Prestamo                                             ");
        System.out.println("    * 5. Fondo de Pension                                     ");
        int idTipoCuenta = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Moneda:                                            ");
        System.out.println("    * 1. Euros                                                ");
       System.out.println("     * 2. Dolares                                              ");
        System.out.println("    * 3. Quetzales                                            ");
        System.out.println("    * 4. Libra Esterlina                                      ");
        int idMoneda = leer.nextInt();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarCuentas(?,?,?,?);");
            sp.setLong(1, idCuenta);
            sp.setDouble(2, saldoCuenta);
            sp.setInt(3, idTipoCuenta);
            sp.setInt(4, idMoneda);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea crear otra Cuenta? (Si / No)                  ");
            System.out.println("                                                         ");                                                
            opcionCrearCuentas = leer.next();
                        
            switch (opcionCrearCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.crearCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuCuentasUser();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarCuenta(){
        String opcionActualizarCuenta;
        
        MenuUsuario mUsuario = new MenuUsuario();        

        System.out.println("                                                                           ");                
        System.out.println("Ingrese ID de Cuenta a Actualizar                                          ");
        long idCuenta = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Saldo de Cuenta:                                      ");
        double saldoCuenta = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo Cuenta:                                       ");
        System.out.println("    * 1. Depositos Monetarios                                 ");
        System.out.println("    * 2. Ahorro                                               ");
        System.out.println("    * 3. Tarjeta de Credito                                   ");
        System.out.println("    * 4. Prestamo                                             ");
        System.out.println("    * 5. Fondo de Pension                                     ");
        int idTipoCuenta = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Moneda:                                            ");
        System.out.println("    * 1. Euros                                                ");
        System.out.println("    * 2. Dolares                                              ");
        System.out.println("    * 3. Quetzales                                            ");
        System.out.println("    * 4. Libra Esterlina                                      ");
        int idMoneda = leer.nextInt();

        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarCuenta(?,?,?,?);");
            sp.setLong(1, idCuenta);
            sp.setDouble(2, saldoCuenta);
            sp.setInt(3, idTipoCuenta);
            sp.setInt(4, idMoneda);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otra Cuenta? (Si / No)                  ");
            System.out.println("                                                         ");                                                
            opcionActualizarCuenta = leer.next();
                        
            switch (opcionActualizarCuenta){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.actualizarCuenta();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuCuentasUser();
                break;
            }
            
        }catch (SQLException e){
            
        }
    }

    public void buscarCuenta(){
        String opcionBuscarCuentas;
        
        MenuUsuario mUsuario = new MenuUsuario();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID de la Cuenta a Buscar                ");
        System.out.println("                                                ");        
        long idCuenta = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarCuentas(?);");
            sp.setLong(1, idCuenta);            
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Cuentas cuentas = new Cuentas();
                cuentas.setIdCuenta(resultado.getLong(1));
                cuentas.setSaldoCuenta(resultado.getInt(2));
                cuentas.setTipoCuenta(resultado.getString(3));
                cuentas.setDescripcionCuenta(resultado.getString(4));
                cuentas.setMoneda(resultado.getString(5));
                System.out.println(cuentas.listarCuentas());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Cuenta? (Si / No)                      ");
            System.out.println("                                                         ");                                                
            opcionBuscarCuentas = leer.next();
                        
            switch (opcionBuscarCuentas){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarCuentas();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuCuentasUser();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
    }
    
}
