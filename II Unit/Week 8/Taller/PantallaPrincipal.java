import java.util.Scanner;

public class PantallaPrincipal{
	Scanner sc=new Scanner(System.in);
	ControladorLogin cLogin=new ControladorLogin();
	ControladorProfesor cProfesor;
	String usuario;
	String clave;
	
	public void login(){
		System.out.println("**** LOGIN ****");
		System.out.println("    ");
		System.out.println("Ingrese su usuario");
		usuario=sc.next();

		System.out.println("    ");
		System.out.println("Ingrese la clave");
		clave=sc.next();
		cLogin.verificador(usuario,clave);
	}
	
	public void ingresoDatosProfesor(){
		cProfesor=new ControladorProfesor();
		String nombre;
		String apellido;
		String opcion;
		int edad;
		do{	
			System.out.println("    ");
			System.out.println("Ingrese el nombre");
			nombre=sc.next();
			System.out.println("    ");
			System.out.println("Ingrese el apellido");
			apellido=sc.next();
			System.out.println("    ");
			System.out.println("Ingrese el edad");
			edad=sc.nextInt();
			cProfesor.ingresoArregloProfesor(nombre,apellido,edad);
			System.out.println("    ");
			System.out.println("¿Desea agregar otro?");
			opcion=sc.next();
		}while(opcion.equals("si"));
			cProfesor.reporteProfesor();
	}
	
	public void pantallaAdministrador(){
		
	}
	
	public void pantallaBasico(){
		
	}

} 