import java.util.Scanner;

public class Principal{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int dato;
		int cont=0;
		int total=0;
		
		System.out.println("Ingrese el dato que desea buscar");
		dato=sc.nextInt();
		
		int[] a1=new int[7];
			a1[0]=90;
			a1[1]=88;
			a1[2]=15;
			a1[3]=75;
			a1[4]=66;
			a1[5]=12;
			a1[6]=44;
			
			
		for(int p:a1){
			if (dato!=p){
				cont++;
					if(cont==7){
						System.out.println("No se encuentra el valor en la base de datos ");
					}

			}else{

				System.out.println(dato+" se encuentra en la base de datos "+cont);
			}
		}
	}
}