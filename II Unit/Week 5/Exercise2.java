import java.util.Scanner;

public class Exercise2{
	public static void main (String args[]) {
		Scanner entrada=new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.println("Por favor ingrese el primer valor");
		num1=entrada.nextInt();
		
		System.out.println("Por favor ingrese el segundo valor");
		num2=entrada.nextInt();
		
		int suma=num1+num2;
		System.out.println("El resultado de la suma es: "+suma);
		
		int resta=num1-num2;
		System.out.println("El resultado de la resta es: "+resta);
		
		int mult=num1*num2;
		System.out.println("El resultado de la multiplicacion es: "+mult);
		
		if(num2==0) {
			System.out.println("Math error");
			
		}else{
			
			int div=num1/num2;
			System.out.println("El resultado de la division es: "+div);
		}
	}
}