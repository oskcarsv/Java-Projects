public class Exercise1{
	
	public static void main(String args[]) {
	
	int a=4;
	int b=4;
	int cont=0;
	int cont1=0;
	int cont2=0;


	
	System.out.println("Tabla del 4 (While)");
	while (a<=40) {
		cont=cont+1;
		System.out.println("4 * "+cont+" = "+a);
		a=a+4;
	}	
		
		
	System.out.println("Tabla del 4 (Do-While)");
	do {
		cont1=cont1+1;
		System.out.println("4 * "+cont1+" = "+b);
		b=b+4;
	}while(b<=40);
		
		
		
	System.out.println("Tabla del 4 (For)");
		
	for (int c=4; c<=40; c=c+4) {
			cont2=cont2+1;
			System.out.println("4 * "+cont2+" = "+c);
	
		}

	
	}
}	