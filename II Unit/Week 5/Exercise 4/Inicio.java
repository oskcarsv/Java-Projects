public class Inicio {
	public static void main(String args[]) {
		
		Calculadora calc=new Calculadora();
		int totalSuma;
		int totalResta;
		

		totalSuma=calc.suma(10, 5);
		System.out.println("el resultado de la suma es: "+totalSuma);
		
		totalResta=calc.resta(3, 4);
		System.out.println("el resultado de la resta es: "+totalResta);
		

		
	}
}