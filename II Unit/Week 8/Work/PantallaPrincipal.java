import java.util.Scanner;
public class PantallaPrincipal{
	Scanner sc=new Scanner(System.in);
	ControladorLogin cLogin=new ControladorLogin();
	ControladorProfesor cProfesor;
	String usuario;
	String clave
	
	public void login(){
		System.out.println("Ingrese su usuario");
		usuario=scnext();
		System.out.println("Ingrese su clave");
		clave=scnext();
		
		cLogin.verificador(usuario,clave);
	}
	
	
	public void ingresoDatosProfesor(){
		cProfesor=new ControladorProfesor();
		String nombre;
		String apellido;
		int edad;
		int codigo;
		do{
			System.out.println("Ingrese su codigo");
			codigo=sc.nextInt();
			System.out.println("Ingrese su nombre");
			nombre=sc.next();
			System.out.println("Ingrese su apellido");
			apellido=sc.next();
			System.out.println("Ingrese su edad");
			edad=sc.nextInt();
			cProfesor.ingresoArregloProfesor(codigo,nombre,apellido,edad);
			System.out.println("¿Desea agregar otro profesor?");
			opcion=sc.next();
		}while(opcion.equals("si"));
			cProfesor.reporteProfesor();
	}
	
	public void pantallaAdministrador(){
		
	}
	
	public void pantallaBasico(){
		
	}

}