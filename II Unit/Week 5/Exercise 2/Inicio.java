public class Inicio {
	public static void main(String args[]) {
		
		Calculadora calc=new Calculadora();
		int totalSuma;
		int totalResta;
		

		totalSuma=calc.suma(20,20);
		System.out.println("El resultado de la suma es: "+totalSuma);
		
		totalResta=calc.resta(100,50);
		System.out.println("el resultado de la resta es: "+totalResta);
		

		
	}
}