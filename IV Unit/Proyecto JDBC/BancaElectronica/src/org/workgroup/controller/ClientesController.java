package org.workgroup.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.workgroup.dao.Conexion;
import org.workgroup.model.Clientes;
import org.workgroup.view.MenuAdmin;
import org.workgroup.view.MenuUsuario;


public class ClientesController {
    
    Scanner leer = new Scanner(System.in);
    
    public void listarClientes(){
        String opcionListarClientes;
        
        MenuAdmin mAdmin = new MenuAdmin();                
		
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("SELECT * FROM vw_Clientes;");
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Clientes clientes = new Clientes();
                clientes.setDpiPasaporte(resultado.getLong(1));
                clientes.setNombreCliente(resultado.getString(2));
                clientes.setApellidoCliente(resultado.getString(3));
                clientes.setDireccionCliente(resultado.getString(4));
                clientes.setSexoCliente(resultado.getString(5));
                clientes.setNacionalidadCliente(resultado.getString(6));
                clientes.setTelefonoCliente(resultado.getInt(7));                
                clientes.setCompaniaTelefonica(resultado.getString(8));
                clientes.setResidencia(resultado.getString(9));
                System.out.println(clientes.listarClientes());
            }
            
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Clientes? (Si / No)               ");
            System.out.println("                                                         ");                                                
            opcionListarClientes = leer.next();
                        
            switch (opcionListarClientes){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
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

    public void agregarClientes(){
        String opcionAgregarCliente;
        String opcionAgregarClientes;

        MenuAdmin mAdmin = new MenuAdmin();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese DPI o Pasaporte:                                      ");
        long cuiCliente = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese su Nombre:                                            ");
        String nombreCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Apellido:                                          ");
        String apellidoCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Direccion:                                         ");
        String direccionCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Numero de Telefono:                                ");
        int telefonoCliente = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Sexo (Masculino / Femenino):                       ");
        String sexoCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Nacionalidad:                                      ");
        String nacionalidadCliente = leer.next();   
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de su compania telefonica (1. Claro | 2. Tigo):    ");
        int idCompania = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de su Identificador (1. Extranjero |  2. Nacional):  ");
        int idIdentificadorCliente = leer.nextInt();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarClientes(?,?,?,?,?,?,?,?,?);");
            sp.setLong(1, cuiCliente);
            sp.setString(2, nombreCliente);
            sp.setString(3, apellidoCliente);
            sp.setString(4, direccionCliente);
            sp.setInt(5, telefonoCliente);                    
            sp.setString(6, sexoCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setInt(8, idCompania);
            sp.setInt(9, idIdentificadorCliente);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Agregado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea agregar otro Cliente? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionAgregarClientes = leer.next();
                        
            switch (opcionAgregarClientes){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.agregarClientes();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
                break;
            }
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void actualizarClientes(){
        String opcionActualizarClientes;
        
        MenuAdmin mAdmin = new MenuAdmin();        

        System.out.println("                                                                           ");                
        System.out.println("Ingrese ID o Pasaporte a actualizar                                        ");
        long cuiCliente = leer.nextInt();
        System.out.println("                                                                           ");                
        System.out.println("Ingrese su Nombre actualizado:                                             ");
        String nombreCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Apellido actualizado:                                           ");
        String apellidoCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Direccion actualizado:                                          ");
        String direccionCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Numero de Telefono actualizado:                                 ");
        int telefonoCliente = leer.nextInt();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Sexo (Masculino / Femenino) actualizado:                        ");
        String sexoCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Nacionalidad actualizado:                                       ");
        String nacionalidadCliente = leer.next();   
        System.out.println("                                                                           ");        
        System.out.println("Ingrese ID de su compania telefonica (1. Claro | 2. Tigo) actualizado:     ");
        int idCompania = leer.nextInt();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese ID de su Identificador (1. Extranjero |  2. Nacional):  actualizado");
        int idIdentificadorCliente = leer.nextInt();

        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarClientes(?,?,?,?,?,?,?,?,?);");
            sp.setLong(1, cuiCliente);
            sp.setString(2, nombreCliente);
            sp.setString(3, apellidoCliente);
            sp.setString(4, direccionCliente);
            sp.setInt(5, telefonoCliente);                    
            sp.setString(6, sexoCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setInt(8, idCompania);
            sp.setInt(9, idIdentificadorCliente);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualizado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea actualizar otro Cliente? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionActualizarClientes = leer.next();
                        
            switch (opcionActualizarClientes){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.actualizarClientes();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
                break;
            }        

        }catch (SQLException e){
            
        }
    }
    
    public void eliminarClientes(){
        String opcionEliminarCliente;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese el DPI o pasaporte de cliente a Eliminar");
        System.out.println("                                                ");                
        long cuiCliente = leer.nextInt();
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_eliminarClientes(?);");
            sp.setLong(1, cuiCliente);
            sp.execute();
            System.out.println("                                                         ");                
            System.out.println("Registro Eliminado Exitosamente!                         ");
            System.out.println("                                                         ");                                
            System.out.println("Desea eliminar otro cliente? (Si / No)       ");
            System.out.println("                                                         ");                                                
            opcionEliminarCliente = leer.next();
                        
            switch (opcionEliminarCliente){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    this.eliminarClientes();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
                break;
            }
            
        }catch(SQLException e ){
            
        }
    }

    public void buscarClientes(){
        String opcionBuscarClientes;
        
        MenuAdmin mAdmin = new MenuAdmin();                
        
        System.out.println("                                                ");        
        System.out.println("Ingrese ID o Pasaporte del cliente a Buscar     ");
        System.out.println("                                                ");        
        long dpiPasaporte = leer.nextLong();
        System.out.println("                                                ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarClientes(?);");
            sp.setLong(1,dpiPasaporte);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Clientes clientes = new Clientes();
                clientes.setDpiPasaporte(resultado.getLong(1));                                
                clientes.setNombreCliente(resultado.getString(2));
                clientes.setApellidoCliente(resultado.getString(3));
                clientes.setDireccionCliente(resultado.getString(4));
                clientes.setSexoCliente(resultado.getString(5));
                clientes.setNacionalidadCliente(resultado.getString(6));
                clientes.setTelefonoCliente(resultado.getInt(7));                
                clientes.setCompaniaTelefonica(resultado.getString(8));
                clientes.setResidencia(resultado.getString(9));
                System.out.println(clientes.listarClientes());

            }
            System.out.println("                                                         ");                                
            System.out.println("Desea Buscar otro cliente? (Si / No)                    ");
            System.out.println("                                                         ");                                                
            opcionBuscarClientes = leer.next();
                        
            switch (opcionBuscarClientes){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mAdmin.MenuClientesAdmin();
                break;
            }                        
            resultado.close();
        }catch(SQLException e){
            
        }
        
    }

    public void registrarCliente(){
        String opcionRegistrarCliente;

        MenuUsuario mUsuario = new MenuUsuario();        
        
        System.out.println("                                                              ");        
        System.out.println("Ingrese su DPI o Pasaporte:                                   ");
        long cuiCliente = leer.nextLong();
        System.out.println("                                                              ");                
        System.out.println("Ingrese su Nombre:                                            ");
        String nombreCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Apellido:                                          ");
        String apellidoCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Direccion:                                         ");
        String direccionCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Numero de Telefono:                                ");
        int telefonoCliente = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Sexo (Masculino / Femenino):                       ");
        String sexoCliente = leer.next();
        System.out.println("                                                              ");        
        System.out.println("Ingrese su Nacionalidad:                                      ");
        String nacionalidadCliente = leer.next();   
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de su compania telefonica (1. Claro | 2. Tigo):    ");
        int idCompania = leer.nextInt();
        System.out.println("                                                              ");        
        System.out.println("Ingrese ID de su Identificador (1. Extranjero |  2. Nacional):  ");
        int idIdentificadorCliente = leer.nextInt();
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_agregarClientes(?,?,?,?,?,?,?,?,?);");
            sp.setLong(1, cuiCliente);
            sp.setString(2, nombreCliente);
            sp.setString(3, apellidoCliente);
            sp.setString(4, direccionCliente);
            sp.setInt(5, telefonoCliente);                    
            sp.setString(6, sexoCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setInt(8, idCompania);
            sp.setInt(9, idIdentificadorCliente);
            sp.execute();
            System.out.println("                                    ");         
            System.out.println("Registro Agregado Exitosamente!     ");
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Cliente? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionRegistrarCliente = leer.next();
                        
            switch (opcionRegistrarCliente){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
            }      
            
        }catch(SQLException e){
            
            
        }
    }    
    
    public void verCliente(){
        String opcionVerCliente;
        
        MenuUsuario mUsuario = new MenuUsuario();                
        
        System.out.println("                                                                   ");        
        System.out.println("Ingrese ID o Pasaporte para visualizar su informacion de cliente   ");
        System.out.println("                                                                   ");        
        long dpiPasaporte = leer.nextLong();
        System.out.println("                                                                   ");        
        
        
        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_buscarClientes(?);");
            sp.setLong(1,dpiPasaporte);
            ResultSet resultado = sp.executeQuery();
            while(resultado.next()){
                Clientes clientes = new Clientes();
                clientes.setDpiPasaporte(resultado.getLong(1));                                
                clientes.setNombreCliente(resultado.getString(2));
                clientes.setApellidoCliente(resultado.getString(3));
                clientes.setDireccionCliente(resultado.getString(4));
                clientes.setSexoCliente(resultado.getString(5));
                clientes.setNacionalidadCliente(resultado.getString(6));
                clientes.setTelefonoCliente(resultado.getInt(7));                
                clientes.setCompaniaTelefonica(resultado.getString(8));
                clientes.setResidencia(resultado.getString(9));
                System.out.println(clientes.listarClientes());

            }
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Cliente? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionVerCliente = leer.next();
                        
            switch (opcionVerCliente){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
            }      
                        resultado.close();
        }catch(SQLException e){
            
        }
        
    }

    public void actualizarCliente(){
        String opcionActualizarClientes;
        
        MenuUsuario mUsuario = new MenuUsuario();        

        System.out.println("                                                                           ");                
        System.out.println("Ingrese su ID o Pasaporte para actualizar informacion de cliente           ");
        long cuiCliente = leer.nextInt();
        System.out.println("                                                                           ");                
        System.out.println("Ingrese su Nombre actualizado:                                             ");
        String nombreCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Apellido actualizado:                                           ");
        String apellidoCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Direccion actualizado:                                          ");
        String direccionCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Numero de Telefono actualizado:                                 ");
        int telefonoCliente = leer.nextInt();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Sexo (Masculino / Femenino) actualizado:                        ");
        String sexoCliente = leer.next();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese su Nacionalidad actualizado:                                       ");
        String nacionalidadCliente = leer.next();   
        System.out.println("                                                                           ");        
        System.out.println("Ingrese ID de su compania telefonica (1. Claro | 2. Tigo) actualizado:     ");
        int idCompania = leer.nextInt();
        System.out.println("                                                                           ");        
        System.out.println("Ingrese ID de su Identificador (1. Extranjero |  2. Nacional):  actualizado");
        int idIdentificadorCliente = leer.nextInt();

        try{
            PreparedStatement sp = Conexion.getInstance().getConexion()
                    .prepareCall("call sp_actualizarClientes(?,?,?,?,?,?,?,?,?);");
            sp.setLong(1, cuiCliente);
            sp.setString(2, nombreCliente);
            sp.setString(3, apellidoCliente);
            sp.setString(4, direccionCliente);
            sp.setInt(5, telefonoCliente);                    
            sp.setString(6, sexoCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setString(7, nacionalidadCliente);                    
            sp.setInt(8, idCompania);
            sp.setInt(9, idIdentificadorCliente);
            sp.execute();
            System.out.println("                               ");         
            System.out.println("Registro Actualzado Exitosamente!");
            System.out.println("                                                         ");                                
            System.out.println("Desea regresar al menu Cliente? (Si / No)                ");
            System.out.println("                                                         ");                                                
            opcionActualizarClientes = leer.next();
                        
            switch (opcionActualizarClientes){
                case "Si":
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
                            
                case "No":
                    System.out.println("                                    ");        
                    System.out.println("                                    ");        
                    System.out.println("************************************");
                    System.out.println("                                    ");        
                    mUsuario.MenuClientesUser();
                break;
            }      
        }catch (SQLException e){
            
        }
    }


}
