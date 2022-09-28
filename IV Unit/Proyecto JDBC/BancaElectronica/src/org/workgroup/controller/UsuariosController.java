package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Usuarios;
import org.workgroup.view.MenuAdmin;
import java.sql.Date;
import org.workgroup.view.MenuUsuario;



public class UsuariosController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarUsuarios (){
        String opcionListarUsuarios;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Usuarios;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuario(resultado.getLong(1));
                usuarios.setNombreUsuario(resultado.getString(2));
                usuarios.setPasswordUsuario(resultado.getString(3));
                usuarios.setEstadoUsuario(resultado.getString(4));
                usuarios.setFechaCreacionUsuario(resultado.getDate(5));
                usuarios.setNombre(resultado.getString(6));
                usuarios.setApellido(resultado.getString(7));
                usuarios.setDireccion(resultado.getString(8));
                usuarios.setSexo(resultado.getString(9));
                usuarios.setNacionalidad(resultado.getString(10));
                usuarios.setTelefono(resultado.getInt(11));
                System.out.println(usuarios.listarUsuarios());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Usuarios? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionListarUsuarios = leer.next();
                        
            switch (opcionListarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
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

    public void agregarUsuarios (){
        String opcionAgregarUsuarios;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuarios:                                       ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Nombre de Usuario:                                    ");
        String nombreUsuario = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Password de Usuario:                                  ");
        String passwordUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Estado de Usuario (Habilitado / Inahabilitado Temporalmente):  ");
        String estadoUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Fecha de Creacion de Usuario (Year-Month-Day):                 ");
        String fechaCreacionUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese DPI o Pasaporte de Cliente:                                    ");
        long cuiCliente = leer.nextLong();
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarUsuarios(?,?,?,?,?,?);");
            sp.setLong(1, idUsuario);
            sp.setString(2, nombreUsuario);
            sp.setString(3, passwordUsuario);
            sp.setString(4, estadoUsuario);
            sp.setString(5, fechaCreacionUsuario);                    
            sp.setLong(6, cuiCliente);                    
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea agregar otro Usuario? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionAgregarUsuarios = leer.next();
                        
            switch (opcionAgregarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarUsuarios();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
   
    public void actualizarUsuarios (){
        String opcionActualizarUsuarios;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario a Actualizar:                           ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Nombre de Usuario Actualizado:                        ");
        String nombreUsuario = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Password de Usuario Actulizado:                       ");
        String passwordUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Estado de Usuario (Habilitado / Inahabilitado Temporalmente):  ");
        String estadoUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Fecha de Creacion de Usuario (Year-Month-Day) Actualizado:     ");
        String fechaCreacionUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese DPI o Pasaporte de Cliente Actualizado:                        ");
        long cuiCliente = leer.nextLong();
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarUsuarios(?,?,?,?,?,?);");
            sp.setLong(1, idUsuario);
            sp.setString(2, nombreUsuario);
            sp.setString(3, passwordUsuario);
            sp.setString(4, estadoUsuario);
            sp.setString(5, fechaCreacionUsuario);                    
            sp.setLong(6, cuiCliente);                    
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otro Usuario? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionActualizarUsuarios = leer.next();
                        
            switch (opcionActualizarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarUsuarios();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }    
    }
    
    public void eliminarUsuarios (){
        String opcionEliminarUsuarios;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese el ID del Usuario a eliminar            ");
        System.out.println("                                                ");                
        long idUsuario = leer.nextLong();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_eliminarUsuarios(?);");
            sp.setLong(1, idUsuario);
            sp.execute();
            System.out.println("                                                         ");                
            System.out.println("Registro Eliminado Exitosamente!                         ");
            System.out.println("                                                         ");                                
            System.out.println("Desea eliminar otro Usuario? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionEliminarUsuarios = leer.next();
                        
            switch (opcionEliminarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.eliminarUsuarios();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
                break;
            }
            
        }catch(SQLException e ){
            
        }
    }

    public void buscarUsuarios (){
        String opcionBuscarUsuarios;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID de Cliente a Buscar                  ");
        System.out.println("                                                ");        
        long setIdUsuario = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarUsuarios(?);");
            sp.setLong(1,setIdUsuario);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuario(resultado.getLong(1));
                usuarios.setNombreUsuario(resultado.getString(2));
                usuarios.setPasswordUsuario(resultado.getString(3));
                usuarios.setEstadoUsuario(resultado.getString(4));
                usuarios.setFechaCreacionUsuario(resultado.getDate(5));
                usuarios.setNombre(resultado.getString(6));
                usuarios.setApellido(resultado.getString(7));
                usuarios.setDireccion(resultado.getString(8));
                usuarios.setSexo(resultado.getString(9));
                usuarios.setNacionalidad(resultado.getString(10));
                usuarios.setTelefono(resultado.getInt(11));
                System.out.println(usuarios.listarUsuarios());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otro Usuarios? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionBuscarUsuarios = leer.next();
                        
            switch (opcionBuscarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuUsuariosAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }

    public void crearUsuario (){
        String opcionCrearUsuarios;

        MenuUsuario mUsuario = new MenuUsuario();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario:                                        ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Nombre de Usuario:                                    ");
        String nombreUsuario = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Password de Usuario:                                  ");
        String passwordUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Estado de Usuario (Habilitado / Inahabilitado Temporalmente):  ");
        String estadoUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Fecha de Creacion de Usuario (Year-Month-Day):                 ");
        String fechaCreacionUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese DPI o Pasaporte de Cliente al que desea vincular el usuario:   ");
        long cuiCliente = leer.nextLong();
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarUsuarios(?,?,?,?,?,?);");
            sp.setLong(1, idUsuario);
            sp.setString(2, nombreUsuario);
            sp.setString(3, passwordUsuario);
            sp.setString(4, estadoUsuario);
            sp.setString(5, fechaCreacionUsuario);                    
            sp.setLong(6, cuiCliente);                    
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Usuarios? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionCrearUsuarios = leer.next();
                        
            switch (opcionCrearUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUsuariosUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUser();
                break;
            }            
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarUsuario (){
        String opcionActualizarUsuario;

        MenuUsuario mUsuario = new MenuUsuario();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de Usuario a Actualizar:                           ");
        long idUsuario = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese Nombre de Usuario Actualizado:                        ");
        String nombreUsuario = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese Password de Usuario Actulizado:                       ");
        String passwordUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Estado de Usuario (Habilitado / Inahabilitado Temporalmente):  ");
        String estadoUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese Fecha de Creacion de Usuario (Year-Month-Day) Actualizado:     ");
        String fechaCreacionUsuario = leer.next();
        System.out.println("                                                                       ");        
        System.out.println("Ingrese DPI o Pasaporte de Cliente Actualizado:                        ");
        long cuiCliente = leer.nextLong();
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarUsuarios(?,?,?,?,?,?);");
            sp.setLong(1, idUsuario);
            sp.setString(2, nombreUsuario);
            sp.setString(3, passwordUsuario);
            sp.setString(4, estadoUsuario);
            sp.setString(5, fechaCreacionUsuario);                    
            sp.setLong(6, cuiCliente);                    
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Usuarios? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionActualizarUsuario = leer.next();
                        
            switch (opcionActualizarUsuario){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUsuariosUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUser();
                break;
            }
            
        }catch(SQLException e){
            
            
        }    
    }
    
    public void buscarUsuario (){
        String opcionBuscarUsuarios;
        
        MenuUsuario mUsuario = new MenuUsuario();        
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID de Cliente a Buscar                  ");
        System.out.println("                                                ");        
        long setIdUsuario = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarUsuarios(?);");
            sp.setLong(1,setIdUsuario);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuario(resultado.getLong(1));
                usuarios.setNombreUsuario(resultado.getString(2));
                usuarios.setPasswordUsuario(resultado.getString(3));
                usuarios.setEstadoUsuario(resultado.getString(4));
                usuarios.setFechaCreacionUsuario(resultado.getDate(5));
                usuarios.setNombre(resultado.getString(6));
                usuarios.setApellido(resultado.getString(7));
                usuarios.setDireccion(resultado.getString(8));
                usuarios.setSexo(resultado.getString(9));
                usuarios.setNacionalidad(resultado.getString(10));
                usuarios.setTelefono(resultado.getInt(11));
                System.out.println(usuarios.listarUsuarios());
            }
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Usuarios? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionBuscarUsuarios = leer.next();
                        
            switch (opcionBuscarUsuarios){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuUsuariosUser();
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
    
    
}
