public class Calculadora{

	public static void main(String args[]){
	
	char simbolo = '/';
	
	int total = 0;
	int num1 = 100;
	int num2 = 2;
	
	float totalDiv = 0;
	
	
		if (simbolo == '+') {
			total = num1 + num2;
			System.out.println("El resultado de la suma es: " + total);
		}
		
		
		if (simbolo == '-') {
			total = num1 - num2;
			System.out.println("El resultado de la resta es: " + total);
		}
		
		
		if (simbolo == '*') {
			total = num1 * num2;
			System.out.println("El resultado de la multiplicacion es: " + total);
		}
		
		
		if (simbolo == '/') {
			if (num2 == 0) {
				System.out.println("Error matematico");
		} else {
			totalDiv = num1 / num2;
			System.out.println("El resultado de la division es: " + totalDiv);		
			}
			
		}
		
	}
	
}