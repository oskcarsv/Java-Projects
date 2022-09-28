package org.workgroup.view;

import java.util.Scanner;

public class MenuPrincipal {
    
    Scanner sc = new Scanner(System.in);
    
    MenuAdmin mAdmin = new MenuAdmin();
    MenuUsuario mUsuario = new MenuUsuario();
    
    public void Inicio(){
        int opcion;
        
        System.out.println("                                    ");
	System.out.println("		|| INICIO ||		");
	System.out.println("                                    ");
        System.out.println("1... Admin                          ");
	System.out.println("2... Usuario                        ");
	System.out.println("3... Salir                          ");
	System.out.println("                                    ");
        System.out.println("Ingrese numero de opcion            ");
        System.out.println("                                    ");
	opcion = sc.nextInt();
        
        
        switch(opcion){
            
            case 1:
                mAdmin.MenuAdministrador();
            break;
                
            
            case 2:
                mUsuario.MenuUser();
            break;
            
            case 3:
                System.exit(0);
            break;
            
        }
    }
    
}
