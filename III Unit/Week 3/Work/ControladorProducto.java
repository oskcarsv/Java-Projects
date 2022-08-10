package com.oscar.controlador;

import java.util.Scanner;
import java.util.ArrayList;
import com.oscar.modelo.Producto;
import com.oscar.vista.MenuPrincipal;

public class ControladorProducto{
	Scanner sc=new Scanner(System.in);
	MenuPrincipal mPrincipal=new MenuPrincipal();
	ControladorInventario  cInventario;
	
	
	int idProducto;
	String nombre;
	String descripcion;
	String marca;
	int opcion;
	String opcion1;
	int busq;
	int busqu;
	int x=0;
	int n=0;
	int z=0;
	int f=0;
	int y=0;
	int valor;
	String pregunta;
	int valor1;
	int opcion2;
	int invent;
	int w;
	int cont=1;
	
	
	static ArrayList<Producto> aProducto=new ArrayList<>();
		
	public void ingresoProducto(int idProducto, String nombre, String descripcion, String marca){
		aProducto.add(new Producto(idProducto, nombre, descripcion,marca));
		cont++;
	}
	
	public void busqueda(int invent){
		cInventario=new ControladorInventario();
		
		for (Producto p:aProducto){
			idProducto=p.getIdProducto();
			nombre=p.getNombre();
			descripcion=p.getDescripcion();			
			marca=p.getMarca();
			if (invent==idProducto){
				System.out.println("    ");
				System.out.println("¡El producto ha sido encontrado en la base de datos! El producto es: "+nombre);	
				cInventario.ingresarInventario();
				break;
			}else{
				w++;
			}
			
			if (w==aProducto.size()){
			System.out.println("El ID del producto no se encuentra en la base de datos");	
			cInventario.inventAdmin();
			}	
		}
		
	}
	
	
	public void busquedaModificar(int busq){
		for (Producto p:aProducto){
			idProducto=p.getIdProducto();
			nombre=p.getNombre();
			descripcion=p.getDescripcion();
			marca=p.getMarca();
			if (busq==idProducto){
				System.out.println("    ");
				System.out.println("¡El producto ha sido encontrado en la base de datos! El producto es: "+nombre);	
				this.modificarProducto();
				break;
			}else{
				x++;
				n++;
				z++;
				f++;
			}
			
			if (x==aProducto.size()){
			System.out.println("El ID del producto no se encuentra en la base de datos");			
			}	
		}
	}
	
	
	public void modificarProducto(){
		int x=0;
		int n=0;
		int z=0;
		int f=0;
		
		for (Producto p:aProducto){
			idProducto=p.getIdProducto();
			nombre=p.getNombre();
			descripcion=p.getDescripcion();
			marca=p.getMarca();
			if (busq==idProducto){
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
		System.out.println("1... Nombre");	
		System.out.println("2... Descripcion");
		System.out.println("3... Marca");		
		System.out.println("     ");
		System.out.println("Ingrese el número de opcion, segun el valor que desea modificar");

		valor=sc.nextInt();

		switch (valor){			
			case 1:
			System.out.println("     ");	
			System.out.println("Ingrese el nuevo nombre de producto");
			nombre=sc.next();
			
			aProducto.get(n).setNombre(nombre);
			
			this.reporteProducto();
			
			this.producAdmin();
			
			break;
			
			
			case 2:
			System.out.println("     ");	
			System.out.println("Ingrese el nuevo descripcion de producto");
			descripcion=sc.next();
			
			aProducto.get(z).setDescripcion(descripcion);
			
			this.reporteProducto();
			
			this.producAdmin();

			break;
			
			
			case 3:
			System.out.println("     ");	
			System.out.println("Ingrese la nueva marca de producto");
			marca=sc.next();
			
			aProducto.get(f).setMarca(marca);
			
			this.reporteProducto();
			
			this.producAdmin();
			
			break;
		}	
	}


	public void eliminarProducto(int busqu){
		int y=0;

		for (Producto p:aProducto){
			idProducto=p.getIdProducto();
			nombre=p.getNombre();
			descripcion=p.getDescripcion();
			marca=p.getMarca();
			if (busqu==idProducto){
				System.out.println("    ");
				System.out.println("¡El producto ha sido encontrado en la base de datos! El producto es: "+nombre);	
				aProducto.remove(y);
				break;
			}else{
				y++;
			}
					
			if (y==aProducto.size()){
			System.out.println("El ID del producto no se encuentra en la base de datos");			
			}	
		}
				
		this.reporteProducto();
			
		this.producAdmin();	
	}
	
	
	public void reporteProducto(){
		System.out.println("     ");
		System.out.println("		ID		|		PRODUCTO ------- DESCRIPCION / MARCA");
		System.out.println("    ");
		
		for(Producto p:aProducto){
			System.out.println("		"+p.getIdProducto()+"		|		"+p.getNombre()+" ------- "+p.getDescripcion()+" / "+p.getMarca());
		}
	}
	

	public void producAdmin(){
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU PRODUCTO ||		");
		System.out.println("    ");	
		System.out.println("1... Ingresar producto");
		System.out.println("2... Modificar producto");
		System.out.println("3... Eliminar producto");
		System.out.println("4... Reporte producto");
		System.out.println("5... Regresar al menu");
		
		System.out.println("    ");	
		System.out.println("Ingrese número de opcion");
		opcion=sc.nextInt();
		
		
		switch (opcion){			
			case 1:
			System.out.println("    ");	
			System.out.println("*** INGRESAR PRODUCTO ***");
			System.out.println("    ");	

			do{
			idProducto=cont;
			
			System.out.println("    ");
			System.out.println("Ingrese el nombre de producto");
			nombre=sc.next();
			
			System.out.println("    ");
			System.out.println("Ingrese descripcion de producto");
			descripcion=sc.next();

			System.out.println("    ");
			System.out.println("Ingrese marca de producto");
			marca=sc.next();
			
			this.ingresoProducto(idProducto,nombre,descripcion,marca);

			System.out.println("    ");
			System.out.println("¿Desea agregar otro producto? (si/no)");
			opcion1=sc.next();
			
			}while(opcion1.equals("si"));
			
			this.producAdmin();
			
			
			break;
			
			
			case 2:
			
			System.out.println("    ");
			System.out.println("*** MODIFICAR PRODUCTO ***");
			System.out.println("    ");

			this.reporteProducto();
			
			System.out.println("    ");
			System.out.println("Ingrese el ID del producto que desea modificar");
			busq=sc.nextInt();

			this.busquedaModificar(busq);
			break;
			
			
			case 3:
			System.out.println("    ");
			System.out.println("*** ELIMINAR PRODUCTO ***");
			System.out.println("    ");

			this.reporteProducto();

			System.out.println("    ");
			System.out.println("Ingrese el ID del producto que desea eliminar");
			busqu=sc.nextInt();

			this.eliminarProducto(busqu);

			break;
			
			
			case 4:
			System.out.println("    ");
			System.out.println("*** REPORTE PRODUCTO ***");
			System.out.println("    ");
			this.reporteProducto();
			
			this.producAdmin();
			
			break;
			
			
			case 5:
			System.out.println("    ");
			System.out.println("*** REGRESAR ***");
			System.out.println("    ");
			mPrincipal.usuarioA();
			break;
			
		}
		
	}
	
	public void producBasic(){		
		System.out.println("    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    ");	
		System.out.println("		|| MENU PRODUCTO ||		");
		System.out.println("    ");	
		System.out.println("1... Ingresar producto");
		System.out.println("2... Reporte producto");
		System.out.println("3... Regresar al menu");
		
		System.out.println("    ");	
		System.out.println("Ingrese número de opcion");
		opcion2=sc.nextInt();
		
		switch (opcion2){			
			case 1:
			System.out.println("    ");	
			System.out.println("*** INGRESAR PRODUCTO ***");
			System.out.println("    ");	

			do{
			idProducto=cont;
			System.out.println("    ");
			System.out.println("Ingrese el nombre de producto");
			nombre=sc.next();
			
			System.out.println("    ");
			System.out.println("Ingrese descripcion de producto");
			descripcion=sc.next();
			
			System.out.println("    ");
			System.out.println("Ingrese marca de producto");
			marca=sc.next();
			
			this.ingresoProducto(idProducto,nombre,descripcion,marca);

			System.out.println("    ");
			System.out.println("¿Desea agregar otro producto? (si/no)");
			opcion1=sc.next();
			
			}while(opcion1.equals("si"));
			
			this.producBasic();
			
			
			break;
			

			case 2:
			System.out.println("    ");
			System.out.println("*** REPORTE PRODUCTO ***");
			System.out.println("    ");
			this.reporteProducto();
			
			this.producBasic();
			
			break;
			
			
			case 3:
			System.out.println("    ");
			System.out.println("*** REGRESAR ***");
			System.out.println("    ");
			mPrincipal.usuarioB();
			break;
			
		}
		
		
		
	}

}