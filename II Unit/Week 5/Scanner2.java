import java.util.Scanner;

public class Scanner2 {
	public static void main (String args[]) {
		Scanner entrada=new Scanner(System.in);
		int valor1;
		int valor2;
		
		System.out.println("Ingrese un valor numerico");
		valor1=entrada.nextInt();
		
		System.out.println("Ingrese un valor numerico");
		valor2=entrada.nextInt();
		
		System.out.println("El valor ingresado es: "+valor1);
		System.out.println("El otro valor ingresado es: "+valor2);

		
		
	}	
}