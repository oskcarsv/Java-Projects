import java.util.Scanner;

public class Menu{
	Scanner sc=new Scanner(System.in);

	public void  pantallaPrincipal(){
			Scanner sc=new Scanner(System.in);

			String nombre;
			String apellido;
			int edad;
			
			Persona  persona1;
			
			System.out.println("Ingrese su nombre");
			nombre=sc.next();
			System.out.println("Ingrese su apellido");
			apellido=sc.next();
			System.out.println("Ingrese su edad");
			edad=sc.nextInt();

			persona1=new Persona(nombre,apellido,edad);


			nombre=persona1.retornarNombre();
			apellido=persona1.retornarApellido();
			edad=persona1.retornarEdad();
			
			if(edad>=18){
				System.out.println("El nombre completo de la persona  es: "+nombre+" "+apellido+" y es mayor de edad");
			}else{
				System.out.println("El nombre completo de la persona  es: "+nombre+" "+apellido+" y es menor de edad");
			}
				

			System.out.println("Ingrese su nombre modificado");
			nombre=sc.next();
				
			persona1.obtenerNombre(nombre);
			nombre=persona1.retornarNombre();
			System.out.println("El nombre completo de la persona (modificado) es: "+nombre+" "+apellido);

		}

}