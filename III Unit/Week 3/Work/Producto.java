package com.oscar.modelo;

public class Producto{

	int idProducto;
	String nombre;
	String descripcion;
	String marca;
	
		
	public Producto (int idProducto, String nombre, String descripcion, String marca){
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.marca=marca;
	}


	public int getIdProducto() {
		return idProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}	
	
	public String getMarca() {
		return marca;
	}
	
	
	
	public void setIdProducto(int idProducto) {
		this.idProducto=idProducto;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}

	public void setMarca(String marca) {
		this.marca=marca;
	}

}