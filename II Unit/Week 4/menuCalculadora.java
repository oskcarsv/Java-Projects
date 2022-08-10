public class menuCalculadora{

	public static void main(String args[]){
	
	int num1=100;
	int num2=2;
	int total=0;
	
	int opcion=4;
	
	System.out.println("******* MENU DE OPCIONES ********");
		System.out.println("1...Suma");
		System.out.println("2...Resta");
		System.out.println("3...Multiplicacion");
		System.out.println("4...Division");
		System.out.println("	");
	
	switch(opcion){
				case 1:
					System.out.println("**** SUMA **** ");
					
					char suma='+';
					
					if (suma=='+') {
		
						total=num1+num2;
						System.out.println("El resultado de la suma es: "+total);
		
						}
					
					break;
					
				case 2:
					System.out.println("**** RESTA ****");
					
					char resta='-';
					
					if (resta=='-') {
		
						total=num1-num2;
						System.out.println("El resultado de la resta es: "+total);
		
						}
					
					break;
					
				case 3:
					System.out.println("**** MULTIPLICACION ****");
					
					char multiplicacion='*';
					
					if (multiplicacion=='*') {
		
						total=num1*num2;
						System.out.println("El resultado de la multiplicacion es: "+total);
		
						}
					
					break;
					
				case 4:
					System.out.println("**** DIVISION *****");
					
					char division='/';
					
					float totalDiv=0;
					
					if (division=='/') {
		
						if (num2==0) {
							System.out.println("Error matematico");
					
					} else {
						totalDiv=num1/num2;
						System.out.println("El resultado de la division es: "+totalDiv);
		
						}
					}
					break;
	
	}
	}
}