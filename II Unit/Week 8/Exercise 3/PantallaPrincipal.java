import java.util.Scanner;

public class PantallaPrincipal{
	ControladorLogin cLogin;
	ControladorPersona cPersona;
	Scanner sc=new Scanner(System.in);
	String nombre;
	String clave;

	public void login(){
		System.out.println("**** LOGIN ****");
		cLogin=new ControladorLogin();
		System.out.println("    ");
		System.out.println("Ingrese su usuario");
		nombre=sc.next();

		System.out.println("    ");
		System.out.println("Ingrese la clave");
		clave=sc.next();
		cLogin.verificador(nombre,clave);
	}
	
	public void ingresoPersonas(){
		ControladorPersona cPersona=new ControladorPersona();
		cPersona.ingresoArregloPersona();
		this.busquedaPersona();
		this.cambioPersona();	
	}
	
	public void busquedaPersona(){
		ControladorPersona cPersona=new ControladorPersona();
		cPersona.busquedaPersona();
		
	}	
	
	public void cambioPersona(){
		ControladorPersona cPersona=new ControladorPersona();
		cPersona.cambioPersona();
		
	}
	

} 