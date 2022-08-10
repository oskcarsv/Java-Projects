package Vista;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner sc=new Scanner(System.in);
    MenuOperaciones mOperaciones;
    
    public void inicio(){
        int opcion;
        MenuOperaciones mOperaciones=new MenuOperaciones();
        
        System.out.println("        || MENU PRINCIPAL ||        ");
        System.out.println("    ");
        System.out.println("Con que tipo de datos deseas trabajar?");
        System.out.println("    ");        
        System.out.println("1.... Enteros");
        System.out.println("2.... Decimales");
        System.out.println("    ");        
        System.out.println("Ingrese numero de opcion");
        opcion=sc.nextInt();
        
        switch (opcion){
            case 1:
                mOperaciones.enteros();
            break;
            
         
            case 2:
                mOperaciones.decimales();
            break;   
        }   
    }    
}
