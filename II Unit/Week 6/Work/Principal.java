import java.util.Scanner;

public class Principal{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int variable;
		int dato;
		int reemp;
		int cont=0;
		int cont1=0;
		int cont2=-1;
		int cont3=-1;
		int total=0;
	
		int[] a1=new int[5];
			
		for(int x=0;x<a1.length;x++){
			cont1++;
			System.out.println("Ingrese el valor "+cont1);
			variable=sc.nextInt();
			a1[x]=variable;	
		}
		
		System.out.println(" ");		
		System.out.println("DATOS DE ARREGLO");
		
		for(int x=0;x<a1.length;x++){
			cont2++;
			System.out.println("Indice "+cont2+": "+a1[x]);
		}
		
		System.out.println(" ");		
		System.out.println("Ingrese el dato que desea buscar");
		dato=sc.nextInt();
		
		for(int p:a1){
			if (dato!=p){
				cont++;
					if(cont==5){
						System.out.println(" ");		
						System.out.println("No se encuentra el valor en la base de datos ");
					}
			}else{
				System.out.println(" ");		
				System.out.println(dato+" se encuentra en la base de datos en el indice "+cont);
				
			}	
		
		}


		System.out.println(" ");		
		System.out.println("Ingrese el dato a modificar");
		reemp=sc.nextInt();

		for (int i=0;i<a1.length;i++){
			
			if(a1[i]==reemp){
				System.out.println("Ingrese el dato");
				a1[i] = sc.nextInt();
				break;
			}
		}	

		
		System.out.println(" ");		
		System.out.println("DATOS DE ARREGLO (ACTUALIZADO)");
		
		for(int i=0;i<a1.length;i++){
			cont3++;
			System.out.println("Indice "+cont3+": "+a1[i]);
		}

		
	}
}