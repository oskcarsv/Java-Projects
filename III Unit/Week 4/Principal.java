import java.util.Scanner;

public class Principal {
	public static void main(String args[]){
		
		/*  int dato;
			
			String numero="100";
			
			dato=Integer.parseInt(numero);  El autoboxing seria cuando ingresamos el dato para convertir
			
			System.out.println(dato+100);	El unbozing serian cuando sacamos el dato convertido
		*/
		
		Scanner sc=new Scanner(System.in);
		
		Integer dato1;
		Integer dato2;
		Integer resultado;
		
		System.out.println("Ingrese el primer numero");
		dato1=sc.nextInt();
		
		System.out.println("     ");
		System.out.println("Ingrese el segundo numero");
		dato2=sc.nextInt();

		System.out.println("     ");
		resultado=dato1+dato2;
		System.out.println("Suma:"+resultado.toString());
		
		resultado=dato1-dato2;
		System.out.println("Resta:"+resultado.toString());
		
		resultado=dato1*dato2;
		System.out.println("Multiplicacion:"+resultado.toString());
		
		resultado=dato1/dato2;
		System.out.println("Division:"+resultado.toString());
		
		
		if (resultado.equals(15)){
			System.out.println("El dato es String");
		}else{
			System.out.println("El dato no es String");
		}
		
	}


} 