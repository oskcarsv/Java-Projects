public class Inicio {
	public static void main(String args[]) {
		
		Calculadora calc=new Calculadora();
		int variable1;
		int variable2;
		
		calc.mostrarTexto();

		
		variable1=calc.mostrarVariable1();
		System.out.println(variable1);
		
		variable2=calc.mostrarVariable2();
		System.out.println(variable2);
		

		
	}
}
