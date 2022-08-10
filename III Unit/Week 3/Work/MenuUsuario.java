package com.oscar.vista;

import com.oscar.controlador.ControladorUsuario;
import java.util.Scanner;

public class MenuUsuario{
	
	MenuPrincipal mPrincipal;
	Scanner sc=new Scanner(System.in);
	ControladorUsuario cUsuario;
	
	public void crearCuenta(){
		
		int contador=0;
		mPrincipal=new MenuPrincipal();
		cUsuario=new ControladorUsuario();
		String nombre;
		String clave;
		char rol;
		boolean arroba=true;
		
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| CREAR CUENTA ||		");
		System.out.println("    ");	

		do{
		System.out.println("Ingrese su nombre ");
		nombre=sc.next();
		
		System.out.println("    ");
		System.out.println("Ingrese su clave");
		clave=sc.next();
		
		System.out.println("    ");
		System.out.println("Ingrese su rol: Administrador (A) / Basico (B)");
		rol=sc.next().charAt(0);
		
		for(int x=0;x<nombre.length();x++){
			if('@'!=nombre.charAt(x)){
				contador++;
			}
		}
		
		if(contador==nombre.length()){
			System.out.println("No cumple con los requisitos,ingrese nuevametne");
			arroba=true;
		}else{
			arroba=false;
		}
		
		}while(arroba==true);	
		
		cUsuario.ingresoUsuario(nombre,clave,rol);
		System.out.println("¡La cuenta ha sido creada exitosamente!");
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		mPrincipal.inicio();	
	}
	
	
	public void iniciarSesion(){
		
		mPrincipal=new MenuPrincipal();
		cUsuario=new ControladorUsuario();
		String nombre;
		String clave;
		char rol;
		
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| INICIAR SESION ||		");
		System.out.println("    ");	
		
		System.out.println("Ingrese su nombre ");
		nombre=sc.next();
		
		System.out.println("    ");
		System.out.println("Ingrese su clave");
		clave=sc.next();
		
		System.out.println("    ");
		System.out.println("Ingrese su rol: Administrador (A) / Basico (B)");
		rol=sc.next().charAt(0);
		
		cUsuario.autenticacion(nombre,clave,rol);		
	}


}