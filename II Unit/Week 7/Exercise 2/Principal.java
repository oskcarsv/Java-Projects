import java.util.Scanner;
public class Principal {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String nombre;
		String apellido;
		int edad;
		String busc;
		int contador=0;
		int contador1=0;
		String reemp;
		
		Persona[] arregloPersona=new Persona[5];
			
			
		for(int x=0;x<arregloPersona.length;x++){
			System.out.println("     ");
			System.out.println("Arreglo ["+x+"]");
			System.out.println("Ingrese nombre:");
			nombre=sc.next();
			System.out.println("     ");
			System.out.println("Ingrese apellido:");
			apellido=sc.next();
			System.out.println("     ");
			System.out.println("Ingrese edad:");
			edad=sc.nextInt();
	
			arregloPersona[x]=new Persona(nombre,apellido,edad);	
		}	

		System.out.println("    ");
		System.out.println("Datos de arreglo");
		
		for(int x=0;x<arregloPersona.length;x++){	
			nombre=arregloPersona[x].getNombre();
			apellido=arregloPersona[x].getApellido();
			edad=arregloPersona[x].getEdad();
			System.out.println("Arreglo ["+x+"]"+nombre+" "+apellido+" "+edad);
		}
	
	
		System.out.println("    ");	
		System.out.println("Ingrese el nombre que desea buscar");
		busc=sc.next();
		
		for (Persona p:arregloPersona){
			nombre=p.getNombre();
			apellido=p.getApellido();
			edad=p.getEdad();
			if (busc.equals(nombre)){
				System.out.println("    ");
				System.out.println("¡Ha sido encontrado en la base de datos!, los datos completos son: "+nombre+" "+apellido+" y tiene "+edad+" años.");
				break;
			}else{
				contador++;
			}
		}
		


		System.out.println("    ");	
		System.out.println("Ingrese el nombre que desea modificar");
		reemp=sc.next();
		
		for (Persona p:arregloPersona){
			nombre=p.getNombre();
			apellido=p.getApellido();
			edad=p.getEdad();
			if (reemp.equals(nombre)){
				break;
			}else{
				contador1++;
			}
		}
		
		if (contador1==arregloPersona.length){
			System.out.println("El valor no ha sido encontrado");
		}else{
			System.out.println("    ");	
			System.out.println("Ingrese el nuevo nombre");
			nombre=sc.next();
			System.out.println("    ");				
			System.out.println("Ingrese el nuevo apellido");
			apellido=sc.next();
			System.out.println("    ");	
			System.out.println("Ingrese la nueva edad");
			edad=sc.nextInt();
			arregloPersona[contador1].setNombre(nombre);
			arregloPersona[contador1].setApellido(apellido);
			arregloPersona[contador1].setEdad(edad);
		}
		
		System.out.println("    ");
		System.out.println("Datos de arreglo (Actualizado)");
		for (int y=0;y<arregloPersona.length;y++){
			nombre=arregloPersona[y].getNombre();
			apellido=arregloPersona[y].getApellido();
			edad=arregloPersona[y].getEdad();
			System.out.println("Arreglo ["+y+"]"+nombre+" "+apellido+" con "+edad+" años de edad");
		}

	}

}