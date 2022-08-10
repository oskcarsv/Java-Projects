import java.util.Scanner;

public class Exercise3{
	public static void main (String args[]) {
		Scanner entrada=new Scanner(System.in);
		
		int num1;
		int num2;
		int total;
		String simbolo=null;
		
		
		System.out.println("Por favor ingrese el simbolo");
		simbolo=entrada.next();

		
		switch(simbolo){
		
			case "+":
			
				System.out.println("Por favor ingrese el primer valor");
				num1=entrada.nextInt();

				System.out.println("Por favor ingrese el segundo valor");
				num2=entrada.nextInt();

				total=num1+num2;
				System.out.println("El resultado de la suma es: "+total);

			
			case "-":
			
				System.out.println("Por favor ingrese el primer valor");
				num1=entrada.nextInt();

				System.out.println("Por favor ingrese el segundo valor");
				num2=entrada.nextInt();
				
				total=num1-num2;
				System.out.println("El resultado de la resta es: "+total);

			
			case "*":
			
				System.out.println("Por favor ingrese el primer valor");
				num1=entrada.nextInt();

				System.out.println("Por favor ingrese el segundo valor");
				num2=entrada.nextInt();

				total=num1*num2;
				System.out.println("El resultado de la multiplicacion es: "+total);
			
			
			case "/":
			
				System.out.println("Por favor ingrese el primer valor");
				num1=entrada.nextInt();

				System.out.println("Por favor ingrese el segundo valor");
				num2=entrada.nextInt();


				if(num2==0) {
					System.out.println("Math error");
			
				}else{
			
					total=num1/num2;
					System.out.println("El resultado de la division es: "+total);
				}

		}
		
		
	}
}