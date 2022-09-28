package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Transacciones;
import org.workgroup.view.MenuAdmin;
import java.sql.Date;
import org.workgroup.view.MenuUsuario;



public class TransaccionesController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarTransacciones(){
        String opcionListarTransacciones;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Transacciones;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Transacciones transacciones = new Transacciones();
                transacciones.setIdTransacciones(resultado.getLong(1));
                transacciones.setIdentificadorPago(resultado.getString(2));
                transacciones.setDescripcionTransaccion(resultado.getString(3));
                transacciones.setMontoPagoTransaccion(resultado.getDouble(4));
                transacciones.setFechaDeTransacion(resultado.getDate(5));
                transacciones.setUsuario(resultado.getString(6));
                transacciones.setProveedor(resultado.getString(7));                
                transacciones.setServicio(resultado.getString(8));
                transacciones.setSaldocuenta(resultado.getDouble(9));
                System.out.println(transacciones.listarTransaciones());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Transacciones? (Si / No)           ");
            System.out.println("                                                         ");                                                
            opcionListarTransacciones = leer.next();
                        
            switch (opcionListarTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTransaccionesAdmin();
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

    public void agregarTransacciones (){
        String opcionAgregaTransacciones;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Transaccion:                                    ");
        long idTransacciones = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Identificador de Pago:                                ");
        String identificadorPago = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Descripcion de Transaccion:                           ");
        String descripcionTransaccion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Monto de Pago:                                        ");
        Double montoPagoTransaccion = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Fecha de Transaccion (Year-Month-Day):                ");
        String fechaDeTransacion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario:                                        ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo de Proveedor:                                 ");
        int idTipoProveedor = leer.nextInt();   
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de cuenta:                                          ");
        long idCuenta = leer.nextLong();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarTransacciones(?,?,?,?,?,?,?,?);");
            sp.setLong(1, idTransacciones);
            sp.setString(2, identificadorPago);
            sp.setString(3, descripcionTransaccion);
            sp.setDouble(4, montoPagoTransaccion);
            sp.setString(5, fechaDeTransacion);                    
            sp.setLong(6, idUsuario);                    
            sp.setInt(7, idTipoProveedor);                    
            sp.setLong(8, idCuenta);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea agregar otra Transaccion? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionAgregaTransacciones = leer.next();
                        
            switch (opcionAgregaTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarTransacciones();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTransaccionesAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarTransacciones (){
        String opcionActualizarTransacciones;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Transaccion a actualizar:                       ");
        long idTransacciones = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Identificador de Pago actualizado:                    ");
        String identificadorPago = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Descripcion de Transaccion actualizada:               ");
        String descripcionTransaccion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Monto de Pago actualizado:                            ");
        Double montoPagoTransaccion = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Fecha de Transaccion actualizada (Year-Month-Day):    ");
        String fechaDeTransacion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario actualizado:                            ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo de Proveedor actualizado:                     ");
        int idTipoProveedor = leer.nextInt();   
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de cuenta actualizado:                             ");
        long idCuenta = leer.nextLong();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarTransacciones(?,?,?,?,?,?,?,?);");
            sp.setLong(1, idTransacciones);
            sp.setString(2, identificadorPago);
            sp.setString(3, descripcionTransaccion);
            sp.setDouble(4, montoPagoTransaccion);
            sp.setString(5, fechaDeTransacion);                    
            sp.setLong(6, idUsuario);                    
            sp.setInt(7, idTipoProveedor);                    
            sp.setLong(8, idCuenta);
            sp.execute();
            System.out.println("                                  ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otra Transaccion? (Si / No)             ");
            System.out.println("                                                         ");                                                
            opcionActualizarTransacciones = leer.next();
                        
            switch (opcionActualizarTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.actualizarTransacciones();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTransaccionesAdmin();
                break;
            }
            
        }catch(SQLException e){
            
        }
        
    }
    
    public void eliminarTransacciones (){
        String opcionEliminarTransacciones;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese el ID de la Transaccion a eliminar      ");
        System.out.println("                                                ");                
        long idTransacciones = leer.nextInt();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_eliminaTransacciones(?);");
            sp.setLong(1, idTransacciones);
            sp.execute();
            System.out.println("                                                         ");                
            System.out.println("Registro Eliminado Exitosamente!                         ");
            System.out.println("                                                         ");                                
            System.out.println("Desea eliminar otra Transaccion? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionEliminarTransacciones = leer.next();
                        
            switch (opcionEliminarTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.eliminarTransacciones();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTransaccionesAdmin();
                break;
            }
            
        }catch(SQLException e ){
            
        }
    }

    public void buscarTransacciones(){
        String opcionBuscarTransacciones;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID o Pasaporte del cliente a Buscar     ");
        System.out.println("                                                ");        
        long idTransacciones = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarTransacciones(?);");
            sp.setLong(1,idTransacciones);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Transacciones transacciones = new Transacciones();
                transacciones.setIdTransacciones(resultado.getLong(1));
                transacciones.setIdentificadorPago(resultado.getString(2));
                transacciones.setDescripcionTransaccion(resultado.getString(3));
                transacciones.setMontoPagoTransaccion(resultado.getDouble(4));
                transacciones.setFechaDeTransacion(resultado.getDate(5));
                transacciones.setUsuario(resultado.getString(6));
                transacciones.setProveedor(resultado.getString(7));                
                transacciones.setServicio(resultado.getString(8));
                transacciones.setSaldocuenta(resultado.getDouble(9));
                System.out.println(transacciones.listarTransaciones());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Transaccion? (Si / No)                 ");
            System.out.println("                                                         ");                                                
            opcionBuscarTransacciones = leer.next();
                        
            switch (opcionBuscarTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuTransaccionesAdmin();
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

    public void historial(){
        String opcionHistorial;
        
        MenuUsuario mUsuario = new MenuUsuario();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Transacciones;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Transacciones transacciones = new Transacciones();
                transacciones.setIdTransacciones(resultado.getLong(1));
                transacciones.setIdentificadorPago(resultado.getString(2));
                transacciones.setDescripcionTransaccion(resultado.getString(3));
                transacciones.setMontoPagoTransaccion(resultado.getDouble(4));
                transacciones.setFechaDeTransacion(resultado.getDate(5));
                transacciones.setUsuario(resultado.getString(6));
                transacciones.setProveedor(resultado.getString(7));                
                transacciones.setServicio(resultado.getString(8));
                transacciones.setSaldocuenta(resultado.getDouble(9));
                System.out.println(transacciones.listarTransaciones());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Transacciones? (Si / No)           ");
            System.out.println("                                                         ");                                                
            opcionHistorial = leer.next();
                        
            switch (opcionHistorial){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuTransaccionesUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUser();
                break;
            }            
            
            resultado.close();
        }catch(SQLException e){
            
        }
    }
    
    public void agregarTransaccion (){
        String opcionAgregaTransacciones;

        MenuUsuario mUsuario = new MenuUsuario();                
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Transaccion:                                    ");
        long idTransacciones = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Identificador de Pago:                                ");
        String identificadorPago = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Descripcion de Transaccion:                           ");
        String descripcionTransaccion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Monto de Pago:                                        ");
        Double montoPagoTransaccion = leer.nextDouble();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Fecha de Transaccion (Year-Month-Day):                ");
        String fechaDeTransacion = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario:                                        ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID Tipo de Proveedor:                                 ");
        int idTipoProveedor = leer.nextInt();   
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de cuenta:                                          ");
        long idCuenta = leer.nextLong();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarTransacciones(?,?,?,?,?,?,?,?);");
            sp.setLong(1, idTransacciones);
            sp.setString(2, identificadorPago);
            sp.setString(3, descripcionTransaccion);
            sp.setDouble(4, montoPagoTransaccion);
            sp.setString(5, fechaDeTransacion);                    
            sp.setLong(6, idUsuario);                    
            sp.setInt(7, idTipoProveedor);                    
            sp.setLong(8, idCuenta);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea agregar otra Transaccion? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionAgregaTransacciones = leer.next();
                        
            switch (opcionAgregaTransacciones){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarTransaccion();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuTransaccionesUser();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    

    public void buscarTransaccion(){
        String opcionBuscarTransaccion;
        
        MenuUsuario mUsuario = new MenuUsuario();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID o Pasaporte del cliente a Buscar     ");
        System.out.println("                                                ");        
        long idTransacciones = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarTransacciones(?);");
            sp.setLong(1,idTransacciones);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Transacciones transacciones = new Transacciones();
                transacciones.setIdTransacciones(resultado.getLong(1));
                transacciones.setIdentificadorPago(resultado.getString(2));
                transacciones.setDescripcionTransaccion(resultado.getString(3));
                transacciones.setMontoPagoTransaccion(resultado.getDouble(4));
                transacciones.setFechaDeTransacion(resultado.getDate(5));
                transacciones.setUsuario(resultado.getString(6));
                transacciones.setProveedor(resultado.getString(7));                
                transacciones.setServicio(resultado.getString(8));
                transacciones.setSaldocuenta(resultado.getDouble(9));
                System.out.println(transacciones.listarTransaciones());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otra Transaccion? (Si / No)                 ");
            System.out.println("                                                         ");                                                
            opcionBuscarTransaccion = leer.next();
                        
            switch (opcionBuscarTransaccion){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.buscarTransaccion();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuTransaccionesUser();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }
    
    
}
