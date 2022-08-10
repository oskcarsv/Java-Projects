import java.util.ArrayList;
import java.util.Scanner;
public class Principal{
	public static void main(String args[]){				
	Scanner sc=new Scanner(System.in);
	ArrayList<Profesor> arregloProfesor=new ArrayList<>();
	String nombre;
	String apellido;
	int edad;
	String opcion;
	do{		
		System.out.println("Ingrese el nombre");
		nombre=sc.next();
		System.out.println("Ingrese el apellido");
		apellido=sc.next();
		System.out.println("Ingrese el edad");
		edad=sc.nextInt();
		System.out.println("Desea agregar otro??");
		opcion=sc.next();
		arregloProfesor.add(new Profesor(nombre,apellido,edad));
	}while(opcion.equals("si"));
		
	
	System.out.println("******REPORTE PROFESOR******************");
	for(Profesor p:arregloProfesor){
		System.out.println(p.getNombre());
	}
	System.out.println("******BUSQUEDA PROFESOR******************");
	System.out.println("Ingrese el nombre");
	nombre=sc.next();
	for(int x=0; x<arregloProfesor.size();x++){
		if(nombre.equals(arregloProfesor.get(x).getNombre())){
			System.out.println(arregloProfesor.get(x).getNombre()+" "
			+arregloProfesor.get(x).getApellido());
		}
	}
	
	
	System.out.println("******ELIMINAR PROFESOR******************");
	System.out.println("Ingrese el nombre a eliminar");
	nombre=sc.next();
	for(int x=0; x<arregloProfesor.size();x++){
		if(nombre.equals(arregloProfesor.get(x).getNombre())){
			System.out.println(arregloProfesor.get(x).getNombre()+" "
			+arregloProfesor.get(x).getApellido());
		}
	}
	
	
	
	
	
		
	}
	
}