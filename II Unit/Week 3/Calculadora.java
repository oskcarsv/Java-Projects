public class Calculadora{

	public static void main (String args[]) {
	
		double valor1 = 75.25;
		double valor2 = 25.75;
		
		double totalSuma = valor1 + valor2;
		double totalResta = valor1 - valor2;
		double totalMultiplicación = valor1 * valor2;
		double totalCociente = valor1 / valor2;
		double totalResiduo = valor1 % valor2;
		
		System.out.println("El resultado de la suma es: " + totalSuma);
		System.out.println("El resultado de la resta es: " + totalResta);
		System.out.println("El resultado de la multiplicación es: " + totalMultiplicación);
		System.out.println("El resultado de la División/Cociente es: " + totalCociente);
		System.out.println("El resultado de la División/Residuo es: " + totalResiduo);
	
	}

}