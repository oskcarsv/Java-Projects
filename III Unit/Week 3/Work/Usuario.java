package com.oscar.modelo;

public class Usuario{

	String nombre;
	String clave;
	char rol;


	public Usuario(){	
		
	}

	public Usuario(String nombre,String clave,char rol){
		this.nombre=nombre;
		this.clave=clave;
		this.rol=rol;
	}

	public String getNombre() {
		return nombre;
	}
	public String getClave() {
		return clave;
	}
	
	public char getRol(){
		return rol;
	}
	

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setClave(String clave) {
		this.clave=clave;
	}
	
	public void setRol(char rol){
		this.rol=rol;
	}



}