import java.util.Scanner;

public class Principal{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		Fibonacci fibo=new Fibonacci();
		ParImpar imp=new ParImpar();
		Calculadora calc=new Calculadora();
	
		int opcion;
		int subOpcion;
		int valor1;
		int valor2;
		int resultado;
		String pregunta;
		
	do{
		System.out.println("*************MENU************");
		System.out.println("1....Fibonacci");
		System.out.println("2....Par e Impar");
		System.out.println("3....Calculadora");
		System.out.println("     ");
	
		System.out.println("Ingrese el numero de la opcion");
		opcion=sc.nextInt();
	
		switch (opcion){
			case 1:
				System.out.println("     ");
				System.out.println("*****FIBONACCI****");
				System.out.println("Ingrese un valor");
				valor1=sc.nextInt();
				fibo.fibonacci(valor1);			
				
			break;
			
			
			case 2:
				System.out.println("     ");
				System.out.println("*****PAR E IMPAR****");
				System.out.println("Ingrese un valor");
				valor1=sc.nextInt();
				imp.parImpar(valor1);
			break;
			
			
			case 3:
				System.out.println("     ");
				System.out.println("*****CALCULADORA*****");
				System.out.println("1....Suma");
				System.out.println("2....Resta");
				System.out.println("3....Multiplicacion");
				System.out.println("4....Division");
				System.out.println("     ");
				
				System.out.println("Ingrese el numero de la opcion");
				subOpcion=sc.nextInt();
				
				switch(subOpcion){
					case 1:
						System.out.println("***SUMA***");
						System.out.println("Ingrese el primer valor");
						valor1=sc.nextInt();
						System.out.println("Ingrese el segunda valor");
						valor2=sc.nextInt();
						resultado=calc.suma(valor1,valor2);
						System.out.println("El resultado de la suma es: "+resultado);
						
					break;					
					
					
					case 2:
						System.out.println("***RESTA***");					
						System.out.println("Ingrese el primer valor");
						valor1=sc.nextInt();
						System.out.println("Ingrese el segunda valor");
						valor2=sc.nextInt();
						resultado=calc.resta(valor1,valor2);
						System.out.println("El resultado de la resta es: "+resultado);			
					break;
					
					
					case 3:
						System.out.println("***MULTIPLICACION***");
						System.out.println("Ingrese el primer valor");
						valor1=sc.nextInt();
						System.out.println("Ingrese el segunda valor");
						valor2=sc.nextInt();
						resultado=calc.mult(valor1,valor2);
						System.out.println("El resultado de la multiplicacion es: "+resultado);		
					break;
					
					
					case 4:
						System.out.println("***DIVISION***");
						System.out.println("Ingrese el primer valor");
						valor1=sc.nextInt();
						System.out.println("Ingrese el segunda valor");
						valor2=sc.nextInt();
						resultado=calc.div(valor1,valor2);					
					break;
					
				}
			break;
		}	
		System.out.println("¿Desea continuar?");
		pregunta=sc.next();
		}while(pregunta.equals("si"));
	
	}

}