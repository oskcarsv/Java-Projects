package com.oscar.controlador;

import java.util.Scanner;
import java.util.ArrayList;
import com.oscar.modelo.Inventario;
import com.oscar.vista.MenuPrincipal;


public class ControladorInventario{
	
	Scanner sc=new Scanner(System.in);
	ControladorProducto cProducto=new ControladorProducto();
	MenuPrincipal mPrincipal=new MenuPrincipal();
	
	String idInventario;
	int idProducto;
	double precio;
	int inStock;
	double costo;
	int opcion;
	String opcion1;
	int cont=1;
	int cont1=1;
	int invent;
	String busq;
	String busqu;
	int x=0;
	int n=0;
	int y=0;
	int f=0;
	int valor;
	int opcion2;
	
	static ArrayList<Inventario> aInventario=new ArrayList<>();
		
	public void ingresarInventario(String idInventario, int idProducto, double precio, int inStock, double costo){
		aInventario.add(new Inventario(idInventario,idProducto,precio,inStock,costo));
		cont++;
		cont1++;
	}

	public void ingresarInventario(){
	}
	public void eliminarInventario(){
	}

	public void busquedaModificar(String busq){
		for (Inventario i:aInventario){
			idInventario=i.getIdInventario();
			precio=i.getPrecio();
			inStock=i.getInStock();
			costo=i.getCosto();
			if (busq.equals(idInventario)){
				System.out.println("    ");
				System.out.println("¡El id de inventario ha sido encontrado en la base de datos! Los datos completos son: "+idInventario+
				" Y tiene "+inStock+" en existencia");	
				this.modificarInventario();
				break;
			}else{
				x++;
				n++;
				f++;
			}
			
			if (x==aInventario.size()){
			System.out.println("El ID del inventario no se encuentra en la base de datos");
			this.inventAdmin();
			}	
		}
	}

	public void modificarInventario(){
		int x=0;
		int n=0;
		int z=0;
		int f=0;
		
		for (Inventario i:aInventario){
			idInventario=i.getIdInventario();
			precio=i.getPrecio();
			inStock=i.getInStock();
			costo=i.getCosto();
			if (busq.equals(idInventario)){
				break;
			}else{
				x++;
				n++;
				z++;
				f++;
			}
			
		}
		
		System.out.println("     ");	
		System.out.println("*** MENU MODIFICAR ***");	
		System.out.println("     ");	
		System.out.println("1... Precio");	
		System.out.println("2... Costo");
		System.out.println("3... InStock");		
		System.out.println("     ");
		System.out.println("Ingrese el número de opcion, segun el valor que desea modificar");

		valor=sc.nextInt();

		switch (valor){			
			case 1:
			System.out.println("     ");	
			System.out.println("Ingrese el nuevo precio de inventario");
			precio=sc.nextDouble();
			
			aInventario.get(n).setPrecio(precio);
			
			this.reporteInventario();
			
			this.inventAdmin();
			
			break;
			
			
			case 2:
			System.out.println("     ");	
			System.out.println("Ingrese el nuevo costo de inventario");
			costo=sc.nextDouble();
			
			aInventario.get(z).setCosto(costo);
			
			this.reporteInventario();
			
			this.inventAdmin();

			break;
			
			
			case 3:
			System.out.println("     ");	
			System.out.println("Ingrese la nueva cantidad de InStock del producto");
			inStock=sc.nextInt();
			
			aInventario.get(f).setInStock(inStock);
			
			this.reporteInventario();
			
			this.inventAdmin();
			
			break;
		}	
	}


	public void eliminarInventario(String busqu){
		int y=0;

		for (Inventario i:aInventario){
			idInventario=i.getIdInventario();
			precio=i.getPrecio();
			inStock=i.getInStock();
			costo=i.getCosto();
			if (busqu.equals(idInventario)){
				System.out.println("    ");
				System.out.println("¡El id de inventario ha sido encontrado en la base de datos! Los datos completos son: "+idInventario+
				" Y tiene "+inStock+" en existencia");	
				aInventario.remove(y);
				break;
			}else{
				y++;
			}
					
			if (y==aInventario.size()){
			System.out.println("El ID del inventario no se encuentra en la base de datos");
			this.inventAdmin();
			}	
		}
				
		this.reporteInventario();
			
		this.inventAdmin();	
	}



	public void reporteInventario(){
		System.out.println("     ");
		System.out.println("	ID INVENTARIO	|	PRECIO ------- COSTO ------- INSTOCK");
		System.out.println("    ");
		
		for(Inventario i:aInventario){
			System.out.println("	"+i.getIdInventario()+"		|	"	+i.getPrecio()+" ------- "+i.getCosto()+" ------- "+i.getInStock());
		}
	}

	
	public void inventAdmin(){
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU INVENTARIO ||		");
		System.out.println("    ");	
		System.out.println("1... Ingresar al inventario");
		System.out.println("2... Modificar inventario");
		System.out.println("3... Eliminar del inventario");
		System.out.println("4... Reporte de inventario");
		System.out.println("5... Regresar al menu");
		
		System.out.println("    ");	
		System.out.println("Ingrese número de opcion");
		opcion=sc.nextInt();
		
		
		switch (opcion){
			
			case 1:
			System.out.println("    ");	
			System.out.println("*** INGRESAR AL INVENTARIO ***");
			System.out.println("    ");	
			
			
			do{
			cProducto.reporteProducto();
				
			idInventario=cont+"a";
			idProducto=cont1;
			
			System.out.println("    ");
			System.out.println("Ingrese el precio del producto");
			precio=sc.nextDouble();
			
			System.out.println("    ");
			System.out.println("Ingrese costo del producto");
			costo=sc.nextDouble();

			System.out.println("    ");
			System.out.println("Ingrese la cantidad de InStock del producto");
			inStock=sc.nextInt();
			
			System.out.println("    ");
			System.out.println("Ingrese el ID del producto que desea inventariar");
			invent=sc.nextInt();
			
			cProducto.busqueda(invent);
			
			this.ingresarInventario(idInventario,idProducto,precio,inStock,costo);

			System.out.println("    ");
			System.out.println("¿Desea agregar otro producto? (si/no)");
			opcion1=sc.next();
			
			}while(opcion1.equals("si"));
			
			this.inventAdmin();
			
			break;
			
			
			case 2:
			System.out.println("    ");
			System.out.println("*** MODIFICAR INVENTARIO ***");
			System.out.println("    ");

			this.reporteInventario();
			
			System.out.println("    ");
			System.out.println("Ingrese el ID de inventario que desea modificar");
			busq=sc.next();

			this.busquedaModificar(busq);

			break;
				
			
			case 3:
			System.out.println("    ");
			System.out.println("*** ELIMINAR DEL INVENTARIO ***");
			System.out.println("    ");

			this.reporteInventario();

			System.out.println("    ");
			System.out.println("Ingrese el ID de inventario que desea eliminar");
			busqu=sc.next();

			this.eliminarInventario(busqu);

			break;
			
			
			case 4:
			System.out.println("    ");
			System.out.println("*** REPORTE DE INVENTARIO ***");
			System.out.println("    ");
			this.reporteInventario();
			
			this.inventAdmin();
			
			break;


			case 5:
			System.out.println("    ");
			System.out.println("*** REGRESAR ***");
			System.out.println("    ");
			mPrincipal.usuarioA();			
			break;
			
		}
	}


	public void inventBasic(){
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU INVENTARIO ||		");
		System.out.println("    ");	
		System.out.println("1... Ingresar al inventario");
		System.out.println("2... Reporte inventario");
		System.out.println("3... Regresar al menu");
		
		System.out.println("    ");	
		System.out.println("Ingrese número de opcion");
		opcion2=sc.nextInt();

		switch (opcion2){			
			case 1:
			System.out.println("    ");	
			System.out.println("*** INGRESAR AL INVENTARIO ***");
			System.out.println("    ");	

			do{
			cProducto.reporteProducto();
				
			idInventario=cont+"a";
			idProducto=cont1;
			
			System.out.println("    ");
			System.out.println("Ingrese el precio del producto");
			precio=sc.nextDouble();
			
			System.out.println("    ");
			System.out.println("Ingrese costo del producto");
			costo=sc.nextDouble();

			System.out.println("    ");
			System.out.println("Ingrese la cantidad de InStock del producto");
			inStock=sc.nextInt();
			
			System.out.println("    ");
			System.out.println("Ingrese el ID del producto que desea inventariar");
			invent=sc.nextInt();
			
			cProducto.busqueda(invent);
			
			this.ingresarInventario(idInventario,idProducto,precio,inStock,costo);

			System.out.println("    ");
			System.out.println("¿Desea agregar otro producto? (si/no)");
			opcion1=sc.next();
			
			}while(opcion1.equals("si"));
			
			this.inventBasic();

			
			break;
			

			case 2:
			System.out.println("    ");
			System.out.println("*** REPORTE DE INVENTARIO ***");
			System.out.println("    ");
			this.reporteInventario();
			
			this.inventBasic();
			
			break;
			
			
			case 3:
			System.out.println("    ");
			System.out.println("*** REGRESAR ***");
			System.out.println("    ");
			mPrincipal.usuarioB();			
			
		}
		
	}


}