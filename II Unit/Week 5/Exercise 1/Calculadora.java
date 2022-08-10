public class Calculadora {
	int numero1=700;
	int numero2=300;
	
	
	public void mostrarTexto(){
		System.out.println("Mostrando resultados de la calculadora");
	}


	public int suma() {
		int total=0;
		total=numero1+numero2;	
		return total;	
	}

	public int resta() {
		int total=0;
		total=numero1-numero2;	
		return total;	
	}
		
	
}