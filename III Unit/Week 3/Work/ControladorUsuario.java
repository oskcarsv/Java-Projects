package com.oscar.controlador;

import java.util.Scanner;
import java.util.ArrayList;
import com.oscar.modelo.Usuario;
import com.oscar.vista.MenuPrincipal;

public class ControladorUsuario{
	
	Scanner sc=new Scanner(System.in);
	MenuPrincipal mPrincipal=new MenuPrincipal();
	
	int opcion;
	String nombre;
	String clave;
	char rol;
	int contador=0;
	boolean arroba=true;
	int cont=0;
	String busq;
	String busqu;
	int x=0;
	int n=0;
	int y=0;
	int valor;
	String pregunta;

	
	static ArrayList<Usuario> aUsuario=new ArrayList<>();
	
	public void ingresoUsuario(String nombre,String clave,char rol){
		aUsuario.add(new Usuario(nombre,clave,rol));
	}
		
		
	public void busquedaModificar(String busq){
		for (Usuario u:aUsuario){
			nombre=u.getNombre();
			clave=u.getClave();
			rol=u.getRol();
			if (busq.equals(nombre)){
				System.out.println("    ");
				System.out.println("¡El usuario ha sido encontrado en la base de datos! El nombre y el rol son: "+nombre+" / "+rol);	
				this.modificarUsuario();
				break;
			}else{
				x++;
				n++;
			}
			
			if (x==aUsuario.size()){
			System.out.println("El usuario no se encuentra en la base de datos");			
			}	
		}
	}
		

				
	public void modificarUsuario(){
		int x=0;
		int n=0;
		
		for (Usuario u:aUsuario){
			nombre=u.getNombre();
			clave=u.getClave();
			rol=u.getRol();
			if (busq.equals(nombre)){
				break;
			}else{
				x++;
				n++;
			}	
		}
		
		System.out.println("     ");	
		System.out.println("*** MENU MODIFICAR ***");	
		System.out.println("     ");	
		System.out.println("1... Nombre");	
		System.out.println("2... Rol");	
		System.out.println("     ");
		System.out.println("Ingrese el número de opcion, segun el valor que desea modificar");

		valor=sc.nextInt();
		
		switch (valor){			
			case 1:
			System.out.println("     ");	
			System.out.println("Ingrese el nuevo nombre de usuario");
			nombre=sc.next();
			
			aUsuario.get(x).setNombre(nombre);
			
			this.reporteUsuario();
			
			this.menUsuario();	
			
			break;
			
			case 2:
			System.out.println("     ");	
			System.out.println("Ingrese el rol de usuario");
			rol=sc.next().charAt(0);
			
			aUsuario.get(x).setRol(rol);
			
			this.reporteUsuario();
			
			this.menUsuario();

			break;
		}
	}
	
	public void eliminarUsuario(String busqu){
		int y=0;

		for (Usuario u:aUsuario){
			nombre=u.getNombre();
			clave=u.getClave();
			rol=u.getRol();
			if (busq.equals(nombre)){
				System.out.println("    ");
				System.out.println("¡El producto ha sido encontrado en la base de datos! El producto es: "+nombre);	
				aUsuario.remove(y);
				break;
			}else{
				y++;
			}
					
			if (y==aUsuario.size()){
			System.out.println("El nombre de usuario no se encuentra en la base de datos");			
			}	
		}
				
		this.reporteUsuario();
			
		this.menUsuario();	
	}
	
	
	
	public void reporteUsuario(){
		System.out.println("    ");		
		System.out.println("Usuario			|		Rol");		
		System.out.println("     ");		
		for(Usuario u:aUsuario){
			System.out.println(u.getNombre()+"		|		"+u.getRol());
		}
	}
	
	
	public void autenticacion(String nombre,String clave,char rol){
		boolean user=false;
				
		for(int x=0; x<nombre.length(); x++){
			if(nombre.charAt(x)=='@'){
				user=true;
				break;
			}
		}	
		if(user){
			for(int i=0;i<aUsuario.size();i++){
				if((nombre.equals(aUsuario.get(i).getNombre()))&&(clave.equals(aUsuario.get(i).getClave()))
					&&(rol=='A')){
					if((rol!='A')&&(rol!='B')){
						System.out.println("Datos erroneos");
					}			
					mPrincipal.usuarioA();
					break;
				}else{
					mPrincipal.usuarioB();
					break;
				}
			}	
		}else{
				System.out.println(" ");		
				System.out.println("Usuario o clave invalidos");
		}
	}
	
	
	public void menUsuario(){
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU USUARIO ||		");
		System.out.println("    ");	
		System.out.println("1... Ingresar usuario");
		System.out.println("2... Modificar usuario");
		System.out.println("3... Eliminar usuario");
		System.out.println("4... Reporte usuario");
		System.out.println("5... Regresar al menu");
		
		System.out.println("    ");	
		System.out.println("Ingrese número de opcion");
		opcion=sc.nextInt();
		
		
		switch (opcion){			
			case 1:
			System.out.println("    ");	
			System.out.println("*** INGRESAR USUARIO ***");
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
			
			this.ingresoUsuario(nombre,clave,rol);
			System.out.println("¡La cuenta ha sido creada exitosamente!");
			System.out.println("    ");
			
			this.menUsuario();
			
			break;
			
			
			case 2:
			System.out.println("    ");	
			System.out.println("*** MODIFICAR USUARIO ***");
			System.out.println("    ");	
			
			this.reporteUsuario();
			
			System.out.println("    ");
			System.out.println("Ingrese el nombre del usuario que desea modificar");
			busq=sc.next();

			this.busquedaModificar(busq);
			break;
			
			
			case 3:
			System.out.println("    ");	
			System.out.println("*** ELIMINAR USUARIO ***");
			System.out.println("    ");

			this.reporteUsuario();

			System.out.println("    ");
			System.out.println("Ingrese el nombre de usuario que desea eliminar");
			busqu=sc.next();

			this.eliminarUsuario(busqu);

			break;
			
			
			case 4:
			System.out.println("    ");	
			System.out.println("*** REPORTE USUARIO ***");
			System.out.println("    ");	
			
			this.reporteUsuario();
			
			this.menUsuario();
			break;
			
			
			case 5:
			System.out.println("    ");
			System.out.println("*** REGRESAR ***");
			System.out.println("    ");
			mPrincipal.usuarioA();
			break;
			
		}
		
	}

}