	import java.util.Scanner;

public class MenuCalculadora{
	public static void main (String args[]) {
		Scanner entrada=new Scanner(System.in);

		int opcion;
		int opcion1;
		int opcion2;
		int opcion3;
		
		int num1;
		int num2;
		int total;
		
		
		System.out.println("******* MENU DE OPCIONES ********");
		System.out.println("1...Par o impar");
		System.out.println("2...Positivo y Negativo");
		System.out.println("3...Calculadora" );
		System.out.println("	");
		
		System.out.println("Por favor ingresa el numero de la opcion");
		opcion=entrada.nextInt();

		
		switch (opcion){
				
				case 1: 
					System.out.println("**** PAR O IMPAR **** ");
	
	
					System.out.println("Por favor ingrese el valor");
					opcion1=entrada.nextInt();

					
					if (opcion1==0) {
		
						System.out.println("El numero es 0 no es par o impar");
		
					} else { if (opcion1%2==0) {
				
						System.out.println("El numero "+opcion1+" es par");
					
						} else {
				
						System.out.println("El numero "+opcion1+" es impar");
			
					}
				}
				
				
				break;
				
				case 2:
					System.out.println("**** POSITIVO O NEGATIVO **** ");

					System.out.println("Por favor ingrese el valor");
					opcion2=entrada.nextInt();

	
					if (opcion2==0) {
		
						System.out.println("El numero es 0 no es positivo ni negativo");
		
					} else { if (opcion2<0) {
				
						System.out.println("El numero "+opcion2+" es negativo");
					
					} else {
				
						System.out.println("El numero "+opcion2+" es positivo");
						
					}
				}
				
				break;
					
					
				case 3:
				
				System.out.println("******* MENU DE CALCULADORA ********");
				System.out.println("1...Suma");
				System.out.println("2...Resta");
				System.out.println("3...Multiplicacion");
				System.out.println("4...Division");
				System.out.println("	");
				
				System.out.println("Por favor ingresa el numero de la opcion");
				opcion3=entrada.nextInt();

					switch(opcion3){
					case 1:
						System.out.println("**** SUMA **** ");
					
							System.out.println("Por favor ingrese el primer valor");
							num1=entrada.nextInt();

							System.out.println("Por favor ingrese el segundo valor");
							num2=entrada.nextInt();
		
							total=num1+num2;
							System.out.println("El resultado de la suma es: "+total);
		
					
						break;
					
					case 2:
						System.out.println("**** RESTA ****");
					
							System.out.println("Por favor ingrese el primer valor");
							num1=entrada.nextInt();

							System.out.println("Por favor ingrese el segundo valor");
							num2=entrada.nextInt();
				
							total=num1-num2;
							System.out.println("El resultado de la resta es: "+total);
					
					
						break;
					
					case 3:
						System.out.println("**** MULTIPLICACION ****");
					
							
							System.out.println("Por favor ingrese el primer valor");
							num1=entrada.nextInt();

							System.out.println("Por favor ingrese el segundo valor");
							num2=entrada.nextInt();

							total=num1*num2;
							System.out.println("El resultado de la multiplicacion es: "+total);
							
				
						break;
					
					case 4:
						System.out.println("**** DIVISION *****");
					
							System.out.println("Por favor ingrese el primer valor");
							num1=entrada.nextInt();

							System.out.println("Por favor ingrese el segundo valor");
							num2=entrada.nextInt();


							if(num2==0) {
								System.out.println("Math error");
			
							}else{
			
								total=num1/num2;
							System.out.println("El resultado de la division es: "+total);
							}
							
							}
								
				break;


		}
		
		
	}
}