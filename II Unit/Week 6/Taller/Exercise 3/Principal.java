import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		//Menu menu=new Menu();
		//menu.pantallaPrincipal();
		
		
		Estudiante estudiante1=new Estudiante("Estuardo","Zacarias",20,222001);
		
		System.out.println("El numero de carnet "+estudiante1.retornarCarnet()
							+" pertecene a: "+estudiante1.retornarNombre());
	}
	
	
}