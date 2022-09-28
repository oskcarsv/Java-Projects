package org.workgroup.view;

import java.util.Scanner;
import org.workgroup.controller.ClientesController;
import org.workgroup.controller.CompaniaTelefonicaController;
import org.workgroup.controller.CuentasController;
import org.workgroup.controller.IdentificadorClientesController;
import org.workgroup.controller.MonedasController;
import org.workgroup.controller.ProveedorServiciosController;
import org.workgroup.controller.TipoCuentasController;
import org.workgroup.controller.TransaccionesController;
import org.workgroup.controller.UsuariosController;


public class MenuAdmin {
    
    Scanner sc = new Scanner(System.in);
    CompaniaTelefonicaController ctController = new CompaniaTelefonicaController();
    IdentificadorClientesController icController = new IdentificadorClientesController();
    MonedasController mController = new MonedasController();
    ProveedorServiciosController psController = new ProveedorServiciosController();
    TipoCuentasController tpController = new TipoCuentasController();
    ClientesController cController = new ClientesController();
    CuentasController cuController = new CuentasController();
    TransaccionesController tController = new TransaccionesController();
    UsuariosController uController = new UsuariosController();

    
    public void MenuAdministrador(){
        
        int opcionMenuAdmin;
        MenuPrincipal mPrincipal = new MenuPrincipal();

        System.out.println("                                    ");        
        System.out.println("************************************");
        System.out.println("                                    ");
	System.out.println("	       || Menu Admin ||	        ");
	System.out.println("                                    ");
        System.out.println("1.. Clientes                        ");
	System.out.println("2.. Companias Telefonicas           ");
	System.out.println("3.. Cuentas                         ");
	System.out.println("4.. Identificador de Clientes       ");
	System.out.println("5.. Monedas                         ");
	System.out.println("6.. Proveedores de Servicios        ");        
	System.out.println("7.. Tipos de Cuentas                ");
	System.out.println("8.. Transacciones                   ");                
	System.out.println("9.. Usuarios                        ");
        System.out.println("10.. Regrear                        ");
	System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
	opcionMenuAdmin = sc.nextInt();
        
        
        switch (opcionMenuAdmin) {
             
            case 1:
                this.MenuClientesAdmin();
            break;


            case 2:
                this.MenuCompaniasAdmin();
            break;

            
            case 3:
                this.MenuCuentasAdmin();
            break;
            
            
            case 4:
                this.MenuIdentificadorAdmin();
            break;
            
            
            case 5:
                this.MenuMonedasAdmin();
            break;
            
            case 6:
                this.MenuProveedoresAdmin();
            break;
            
            
            case 7:
                this.MenuTiposCuentasAdmin();
            break;
            
            
            case 8:
                this.MenuTransaccionesAdmin();
            break;
           
            
            case 9:
                this.MenuUsuariosAdmin();
            break;
            
            
            case 10:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");
                mPrincipal.Inicio();
            break;

        }
        
    }
    
    public void MenuClientesAdmin(){ 
        int opcionClientesAdmin;
                
        System.out.println("                    || Clientes ||                  ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista Clientes                                  ");
        System.out.println("2.. Agregar Clientes                                ");
        System.out.println("3.. Actualizar Informacion de Cliente               ");
        System.out.println("4.. Eliminar Cliente                                ");
        System.out.println("5.. Buscar Cliente                                  ");
        System.out.println("6.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionClientesAdmin = sc.nextInt();
                
                
        switch (opcionClientesAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                       *** Clientes ***                  ");
                System.out.println("                                                         ");                        
                cController.listarClientes();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Cliente ***                  ");
                System.out.println("                                                         ");                        
                cController.agregarClientes();
            break;
                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Cliente ***               ");
                System.out.println("                                                         ");                        
                cController.actualizarClientes();                        
            break;                    
                    
                    
            case 4:
                System.out.println("                                                         ");        
                System.out.println("                *** Eliminar Cliente ***                 ");
                System.out.println("                                                         ");                        
                cController.eliminarClientes();                        
            break;


            case 5:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Cliente ***                   ");
                System.out.println("                                                         ");                        
                cController.buscarClientes();                           
            break;


            case 6:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
                
    }
    
    public void MenuCompaniasAdmin(){ 
        int opcionCompaniaAdmin;
                
        System.out.println("		|| Campanias Telefonicas ||             ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista de Campanias Telefonicas                  ");
        System.out.println("2.. Agregar Campanias Telefonicas                   ");
        System.out.println("3.. Actualizar Informacion de Campanias Telefonicas ");
        System.out.println("4.. Eliminar Campania Telefonica                    ");
        System.out.println("5.. Buscar Campania Telefonica                      ");
        System.out.println("6.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionCompaniaAdmin = sc.nextInt();
                
                
        switch (opcionCompaniaAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                       *** Companias ***                 ");
                System.out.println("                                                         ");                        
                ctController.listarCompania();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Compania ***                 ");
                System.out.println("                                                         ");                        
                ctController.agregarCompania();
            break;
                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Compania ***              ");
                System.out.println("                                                         ");                        
                ctController.actualizarCompania();                        
            break;                    
                    
                    
            case 4:
                System.out.println("                                                         ");        
                System.out.println("                *** Eliminar Compania ***                ");
                System.out.println("                                                         ");                        
                ctController.eliminarCompania();                        
            break;


            case 5:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Compania ***                  ");
                System.out.println("                                                         ");                        
                ctController.buscarCompania();                           
            break;


            case 6:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
        
    }
    
    public void MenuCuentasAdmin(){
         int opcionCuentasAdmin;
                
        System.out.println("                    || Cuentas ||                   ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista Cuentas                                   ");
        System.out.println("2.. Agregar Cuentas                                 ");
        System.out.println("3.. Actualizar Informacion de Cuentas               ");
        System.out.println("4.. Eliminar Cuenta                                 ");
        System.out.println("5.. Buscar Cuenta                                   ");
        System.out.println("6.. Regresar                                        ");
        System.out.println("                                                    ");
        System.out.println("Ingrese numero de opcion                            ");
        System.out.println("                                                    ");
        opcionCuentasAdmin = sc.nextInt();
                
                
        switch (opcionCuentasAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                       *** Cuentas ***                   ");
                System.out.println("                                                         ");                        
                cuController.listarCuentas();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Cuentas ***                  ");
                System.out.println("                                                         ");                        
                cuController.agregarCuentas();
            break;
                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Cuentas ***               ");
                System.out.println("                                                         ");  
                cuController.actualizarCuentas();
            break;  
                
            
            case 4:
                System.out.println("                                                         ");        
                System.out.println("                *** Eliminar Cuenta ***                  ");
                System.out.println("                                                         ");  
                cuController.eliminarCuentas();
                break;                    
                    

            case 5:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar cuenta ***                    ");
                System.out.println("                                                         ");                        
                cuController.buscarCuentas();                           
            break;


            case 6:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
        
    }
    
    public void MenuIdentificadorAdmin(){
        int opcionIdentificadorAdmin;
                
        System.out.println("		|| Identificador de Cliente ||          ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista de Identificador de Clientes              ");
        System.out.println("2.. Buscar Identificador de Clientes                ");
        System.out.println("3.. Regresar                                        ");
        System.out.println("                                                    ");
        System.out.println("Ingrese numero de opcion                            ");
        System.out.println("                                                    ");
        opcionIdentificadorAdmin = sc.nextInt();
                
                
        switch (opcionIdentificadorAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("           *** Identificador de Clientes ***             ");
                System.out.println("                                                         ");                        
                icController.listarIdentificador();
            break;
            

            case 2:
                System.out.println("                                                         ");        
                System.out.println("     *** Buscar Identificador de Clientes ***            ");
                System.out.println("                                                         ");                        
                icController.buscarIdentificador();                        
            break;                    
                    
            
            case 3:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }                       
        
    }
    
    public void MenuMonedasAdmin(){
        int opcionMonedaAdmin;
                
        System.out.println("                || Monedas ||                       ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista de Monedas                                ");
        System.out.println("2.. Buscar Monedas                                  ");
        System.out.println("3.. Regresar                                        ");
        System.out.println("                                                    ");
        System.out.println("Ingrese numero de opcion                            ");
        System.out.println("                                                    ");
        opcionMonedaAdmin = sc.nextInt();
                
                
        switch (opcionMonedaAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                   *** Monedas ***                       ");
                System.out.println("                                                         ");                        
                mController.listarMonedas();
            break;
            

            case 2:
                System.out.println("                                                         ");        
                System.out.println("              *** Buscar Monedas***                      ");
                System.out.println("                                                         ");                        
                mController.buscarMonedas();                        
            break;                    
                    
            
            case 3:

                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
                        
            break;
                    
        }                       
        
        
    }
    
    public void MenuProveedoresAdmin(){
        int opcionProveedoresAdmin;
                
        System.out.println("            || Proveedores de Servicios ||                ");
        System.out.println("                                                          ");
        System.out.println("1.. Lista de Proveedores de Servicios                     ");
        System.out.println("2.. Buscar Proveedores de Servicios                       ");
        System.out.println("3.. Regresar                                              ");
        System.out.println("                                                          ");
        System.out.println("Ingrese numero de opcion                                  ");
        System.out.println("                                                          ");
        opcionProveedoresAdmin = sc.nextInt();
                
                
        switch (opcionProveedoresAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("          *** Proveedores de Servicios ***               ");
                System.out.println("                                                         ");                        
                psController.listarProveedor();
            break;
                    

            case 2:
                System.out.println("                                                         ");        
                System.out.println("       *** Buscar Proveedores de Servicios ***           ");
                System.out.println("                                                         ");                        
                psController.buscarProveedor();
            break;


            case 3:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
                
    }
    
    public void MenuTiposCuentasAdmin(){
        int opcionTiposCuentassAdmin;
                
        System.out.println("            || Tipos de Cuentas ||                ");
        System.out.println("                                                          ");
        System.out.println("1.. Lista de Tipos de Cuentas                             ");
        System.out.println("2.. Buscar Tipos de Cuentas                               ");
        System.out.println("3.. Regresar                                              ");
        System.out.println("                                                          ");
        System.out.println("Ingrese numero de opcion                                  ");
        System.out.println("                                                          ");
        opcionTiposCuentassAdmin = sc.nextInt();
                
                
        switch (opcionTiposCuentassAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("          *** Tipos de Cuentas ***                       ");
                System.out.println("                                                         ");                        
                tpController.listarTipoCuentas();
            break;
                    

            case 2:
                System.out.println("                                                         ");        
                System.out.println("       *** Buscar Tipos de Cuentas ***                   ");
                System.out.println("                                                         ");                        
               tpController.buscarTipoCuentas();
            break;


            case 3:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
                
        
    }
    
    public void MenuTransaccionesAdmin() {
        int opcionTransaccionesAdmin;
                
        System.out.println("                    || Transacciones ||             ");
        System.out.println("                                                    ");
        System.out.println("1.. Historial de Transacciones                      ");
        System.out.println("2.. Agregar Transaccion                             ");
        System.out.println("3.. Actualizar Informacion de Transaccion           ");
        System.out.println("4.. Eliminar Transaccion                            ");
        System.out.println("5.. Buscar Transaccion                              ");
        System.out.println("6.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionTransaccionesAdmin = sc.nextInt();
                
                
        switch (opcionTransaccionesAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                       *** Transacciones ***             ");
                System.out.println("                                                         ");                        
                tController.listarTransacciones();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Transaccion ***              ");
                System.out.println("                                                         ");                        
                tController.agregarTransacciones();
            break;
                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Transaccion ***           ");
                System.out.println("                                                         ");                        
                tController.actualizarTransacciones();                        
            break;                    
                    
                    
            case 4:
                System.out.println("                                                         ");        
                System.out.println("                *** Eliminar Transaccion ***             ");
                System.out.println("                                                         ");                        
                tController.eliminarTransacciones();                        
            break;


            case 5:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Transaccion ***               ");
                System.out.println("                                                         ");                        
                tController.buscarTransacciones();                           
            break;


            case 6:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }               
                      
    }    
    
    public void MenuUsuariosAdmin(){
        int opcionUsuariosAdmin;
                
        System.out.println("                    || Usuarios ||                  ");
        System.out.println("                                                    ");
        System.out.println("1.. Lista Usuarios                                  ");
        System.out.println("2.. Agregar Usuarios                                ");
        System.out.println("3.. Actualizar Informacion de Usuario               ");
        System.out.println("4.. Eliminar Usuario                                ");
        System.out.println("5.. Buscar Usuario                                  ");
        System.out.println("6.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionUsuariosAdmin = sc.nextInt();
                
                
        switch (opcionUsuariosAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                       *** Usuarios ***                  ");
                System.out.println("                                                         ");                        
                uController.listarUsuarios();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Usuario ***                  ");
                System.out.println("                                                         ");                        
                uController.agregarUsuarios();
            break;
                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Usuario ***               ");
                System.out.println("                                                         ");                        
                uController.actualizarUsuarios();                        
            break;                    
                    
                    
            case 4:
                System.out.println("                                                         ");        
                System.out.println("                *** Eliminar Usuarios ***                 ");
                System.out.println("                                                         ");                        
                uController.eliminarUsuarios();                        
            break;


            case 5:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Usuarios ***                   ");
                System.out.println("                                                         ");                        
                uController.buscarUsuarios();                           
            break;


            case 6:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuAdministrador();
            break;
                    
        }         
    }
    
}
