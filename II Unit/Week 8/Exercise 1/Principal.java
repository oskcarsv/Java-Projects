import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	ArrayList<String> arregloCadena=new ArrayList<>();
	
	String opcion;
	String dato;
	int contador=0;
	
	do{	
		System.out.println("    ");
		System.out.println("Ingrese su dato");
		dato=sc.next();
		arregloCadena.add(dato);
		
		System.out.println("    ");
		System.out.println("Desea continuar");
		opcion=sc.next();	
	}while(opcion.equals("si"));


	System.out.println("    ");
	System.out.println("**********GENERANDO REPORTE*************");
	
	for(int x=0;x<arregloCadena.size();x++){
		System.out.println(arregloCadena.get(x));
	}
	
	
	System.out.println("    ");
	System.out.println("**********BUSQUEDA*************");
	System.out.println("Ingrese su dato");
	dato=sc.next();	
	for(int x=0;x<arregloCadena.size();x++){
		if(dato.equals(arregloCadena.get(x))){
			System.out.println("El dato se encuentra en el arreglo");	
		}else{
			contador++;
		}	
	}
	
	if(contador==arregloCadena.size()){
		System.out.println("El dato no esta");
	}
	
	

	System.out.println("    ");
	System.out.println("**********MODIFICAR*************");
	System.out.println("Ingrese su dato");
	dato=sc.next();
	for(int x=0;x<arregloCadena.size();x++){
		if(dato.equals(arregloCadena.get(x))){
			System.out.println("ingrese dato a modificar");
			dato=sc.next();
			arregloCadena.set(x,dato);
		}else{
			contador++;
		}	
	}
	
	if(contador==arregloCadena.size()){
		System.out.println("El dato no esta");
	}
	
	
	
	System.out.println("    ");
	System.out.println("**********GENERANDO REPORTE DE MODIFICACION*************");
	
	for(int x=0;x<arregloCadena.size();x++){
		System.out.println(arregloCadena.get(x));
	}
	

	System.out.println("    ");
	System.out.println("**********ELIMINAR*************");
	System.out.println("Ingrese su dato");
	dato=sc.next();
	for(int x=0;x<arregloCadena.size();x++){
		if(dato.equals(arregloCadena.get(x))){
			System.out.println("DATO ELIMINADO");
			arregloCadena.remove(x);
		}else{
			contador++;
		}
	}
	
	if(contador==arregloCadena.size()){
		System.out.println("El dato no esta");
	}
	
	
	
	System.out.println("    ");
	System.out.println("**********GENERANDO REPORTE DE ELIMINACION*************");
	for(int x=0;x<arregloCadena.size();x++){
		System.out.println(arregloCadena.get(x));
	}
	
	}
}