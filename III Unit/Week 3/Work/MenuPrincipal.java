package com.oscar.vista;
import java.util.Scanner;
import com.oscar.controlador.ControladorProducto;
import com.oscar.controlador.ControladorUsuario;
import com.oscar.controlador.ControladorInventario;

public class MenuPrincipal{
	
	MenuUsuario mUsuario;
	ControladorUsuario cUsuario;
	ControladorProducto cProducto;
	ControladorInventario cInventario;
	Scanner sc=new Scanner(System.in);
	
	public void inicio(){
		int opcion;
		mUsuario=new MenuUsuario();
		
		System.out.println("    ");
		System.out.println("		|| MENÚ PRINCIPAL ||		");
		System.out.println("    ");	
		System.out.println("1..Iniciar sesion");
		System.out.println("2..Crear cuenta");
		System.out.println("   ");
		System.out.println("Ingrese número de opcion");
		opcion=sc.nextInt();
		
		switch(opcion){
			case 1:
			mUsuario.iniciarSesion();
			break;
			
			case 2:
			mUsuario.crearCuenta();
			break;
		}	
	}
	
	
	
	public void usuarioA(){
		cProducto=new ControladorProducto();
		cUsuario=new ControladorUsuario();
		cInventario=new ControladorInventario();

		int opcion1;
		
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU ADMINISTRADOR ||		");
		System.out.println("    ");	
		System.out.println("1... Producto");
		System.out.println("2... Usuario");
		System.out.println("3... Inventario");
		System.out.println("4... Cerrar sesion");
	
		System.out.println("   ");
		System.out.println("Ingrese número de opcion");
		opcion1=sc.nextInt();
		
		switch(opcion1){
			case 1:
			cProducto.producAdmin();
			break;
			
			
			case 2:
			cUsuario.menUsuario();
			break;
			
			
			case 3:
			cInventario.inventAdmin();
			break;
			
			
			case 4:
			this.inicio();
			System.out.println("-------------------------------------------------------------");
			break;	
		}
	}
	
	
	public void usuarioB(){
		cProducto=new ControladorProducto();
		cInventario=new ControladorInventario();
		int opcion2;
		
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU BASICO ||		");
		System.out.println("1... Producto");
		System.out.println("2... Inventario");
		System.out.println("3... Cerrar sesion");
		
	
		System.out.println("   ");
		System.out.println("Ingrese número de opcion");
		opcion2=sc.nextInt();
		
		switch(opcion2){
			case 1:
			cProducto.producBasic();
			break;
			
			
			case 2:
			cInventario.inventBasic();
			break;
			
			
			case 3:
			this.inicio();
			System.out.println("-------------------------------------------------------------");
			break;	
		}

	}

}