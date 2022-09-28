package org.workgroup.view;

import java.util.Scanner;
import org.workgroup.controller.ClientesController;
import org.workgroup.controller.CompaniaTelefonicaController;
import org.workgroup.controller.ConsultasController;
import org.workgroup.controller.CuentasController;
import org.workgroup.controller.IdentificadorClientesController;
import org.workgroup.controller.MonedasController;
import org.workgroup.controller.ProveedorServiciosController;
import org.workgroup.controller.TipoCuentasController;
import org.workgroup.controller.TransaccionesController;
import org.workgroup.controller.UsuariosController;


public class MenuUsuario {
    
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
    ConsultasController conController = new ConsultasController();

    
    public void MenuUser(){
        
        int opcionMenuUser;
        MenuPrincipal mPrincipal = new MenuPrincipal();

        System.out.println("                                                   ");        
        System.out.println("***************************************************");
        System.out.println("                                                   ");
	System.out.println("                     || Menu User ||               ");
	System.out.println("                                                   ");
        System.out.println("1.. Clientes                                       ");
	System.out.println("2.. Cuentas                                        ");
	System.out.println("3.. Transacciones                                  ");                
	System.out.println("4.. Usuarios                                       ");
        System.out.println("5.. Consulta de fechas (Septiembre - Diciembre)    ");
	System.out.println("6.. Historial de Transacciones                     ");
	System.out.println("7.. Regresar                                       ");
        System.out.println("Ingrese numero de opcion                           ");
        System.out.println("                                                   ");
	opcionMenuUser = sc.nextInt();
        
        
        switch (opcionMenuUser) {
             
            case 1:
                this.MenuClientesUser();
            break;


            case 2:
                this.MenuCuentasUser();
            break;

            
            case 3:
                this.MenuTransaccionesUser();
            break;
            
            
            case 4:
                this.MenuUsuariosUser();
            break;

            
            case 5:
                this.consultaDeFechas();
            break;
            
            
            case 6:
                this.historial();
            break;
            
            
            case 7:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");
                mPrincipal.Inicio();
            break;

        }
        
    }
    
    public void MenuClientesUser(){ 
        int opcionClientesAdmin;
                
        System.out.println("                    || Cliente ||                   ");
        System.out.println("                                                    ");
        System.out.println("1.. Registrate como cliente                         ");
        System.out.println("2.. Actualiza tu Informacion de Cliente             ");
        System.out.println("3.. Ver tu Informacion de cliente                ");
        System.out.println("4.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionClientesAdmin = sc.nextInt();
                
                
        switch (opcionClientesAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("           *** Registrarme como Cliente ***              ");
                System.out.println("                                                         ");                        
                cController.registrarCliente();
            break;
                    

            case 2:
                System.out.println("                                                         ");        
                System.out.println("       *** Actualizar informacion de Cliente ***         ");
                System.out.println("                                                         ");                        
                cController.actualizarCliente();                        
            break;                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("          *** Ver mi informacion de Cliente ***          ");
                System.out.println("                                                         ");                        
                cController.verCliente();                           
            break;


            case 4:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuUser();
            break;
                    
        }               
                
    }
    
    public void MenuCuentasUser(){
         int opcionCuentasUser;
                
        System.out.println("                    || Cuentas ||                   ");
        System.out.println("                                                    ");
        System.out.println("1.. Crear Cuenta                                    ");
        System.out.println("2.. Actualizar Informacion de Cuenta                ");
        System.out.println("3.. Buscar mi Cuenta                                ");
        System.out.println("4.. Regresar                                        ");
        System.out.println("                                                    ");
        System.out.println("Ingrese numero de opcion                            ");
        System.out.println("                                                    ");
        opcionCuentasUser = sc.nextInt();
                
                
        switch (opcionCuentasUser){

            case 1:
                System.out.println("                                                         ");        
                System.out.println("                *** Crear Cuentas ***                  ");
                System.out.println("                                                         ");                        
                cuController.crearCuentas();
            break;
                    

            case 2:
                System.out.println("                                                         ");        
                System.out.println("         *** Actualizar informacion de Cuenta ***        ");
                System.out.println("                                                         ");  
                cuController.actualizarCuenta();
                break;                    

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar cuenta ***                    ");
                System.out.println("                                                         ");                        
                cuController.buscarCuenta();                           
            break;


            case 4:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuUser();
            break;
                    
        }               
        
    }
    
    public void MenuTransaccionesUser() {
        int opcionTransaccionesAdmin;
                
        System.out.println("                    || Transacciones ||             ");
        System.out.println("                                                    ");
        System.out.println("1.. Historial de Transacciones                      ");
        System.out.println("2.. Agregar Transaccion                             ");
        System.out.println("3.. Buscar Transaccion                              ");
        System.out.println("4.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionTransaccionesAdmin = sc.nextInt();
                
                
        switch (opcionTransaccionesAdmin){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("            *** Historial de Transacciones ***           ");
                System.out.println("                                                         ");                        
                tController.historial();
            break;
                    
                    
            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Agregar Transaccion ***              ");
                System.out.println("                                                         ");                        
                tController.agregarTransaccion();
            break;
            

            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Transaccion ***               ");
                System.out.println("                                                         ");                        
                tController.buscarTransaccion();                           
            break;


            case 4:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuUser();
            break;
                    
        }               
                      
    }    
    
    public void MenuUsuariosUser(){
        int opcionUsuariosUser;
                
        System.out.println("                    || Usuarios ||                  ");
        System.out.println("                                                    ");
        System.out.println("1.. Crear Usuario                                   ");
        System.out.println("2.. Actualizar Informacion de Usuario               ");
        System.out.println("3.. Buscar Usuario                                  ");
        System.out.println("4.. Regresar                                        ");
        System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
        opcionUsuariosUser = sc.nextInt();
                
                
        switch (opcionUsuariosUser){
                    
            case 1:
                System.out.println("                                                         ");        
                System.out.println("                    ***  Crear Usuario ***               ");
                System.out.println("                                                         ");                        
                uController.crearUsuario();
            break;

            case 2:
                System.out.println("                                                         ");        
                System.out.println("                *** Actualizar Usuario ***               ");
                System.out.println("                                                         ");                        
                uController.actualizarUsuario();                        
            break;                    

            
            case 3:
                System.out.println("                                                         ");        
                System.out.println("                *** Buscar Usuario ***                   ");
                System.out.println("                                                         ");                        
                uController.buscarUsuario();                           
            break;


            case 4:
                System.out.println("                                    ");        
                System.out.println("                                    ");        
                System.out.println("************************************");
                System.out.println("                                    ");                        
                this.MenuUser();
            break;
                    
        }         
    }
    
    public void consultaDeFechas(){
                
        System.out.println("         || Transaciones Septiembre - Diciembre ||  ");
        System.out.println("                                                    ");
        conController.consultaDeFechas();
      
    }

    public void historial(){
                
        System.out.println("             || Historial De Transacciones||        ");
        System.out.println("                                                    ");
        conController.historial();
      
    }

    
}
