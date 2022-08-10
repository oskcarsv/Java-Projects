public class Calculadora{
	
	public int suma(int a, int b){
		int total;
		total=a+b;
		return total;
	}
	
	
	public int resta(int a, int b){
		int total;
		total=a-b;
		return total;
	}


	public int mult(int a, int b){
		int total;
		total=a*b;
		return total;
	}


	public int div(int a, int b){
		if(b==0){
			System.out.println("Math Error");
		}else{
			int total;
			total=a/b;
			System.out.println("El resultado de la division es: "+total);
			
		}
		int total;
		total=a/b;
		return total;
	}

	
}