package com.oscar.modelo;

public class Inventario{

	String idInventario;
	int idProducto;
	double precio;
	int inStock;
	double costo;
	
	
	public Inventario (String idInventario, int idProducto, double precio, int inStock, double costo){
		this.idInventario=idInventario;
		this.idProducto=idProducto;
		this.precio=precio;
		this.inStock=inStock;
		this.costo=costo;
	}
	
	
	public String getIdInventario() {
		return idInventario;
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public int getInStock() {
		return inStock;
	}

	public double getCosto() {
		return costo;
	}



	public void setIdInventario(String idInventario) {
		this.idInventario=idInventario;
	}
	
	public void setIdProducto(int idProducto) {
		this.idProducto=idProducto;
	}

	public void setPrecio(double precio) {
		this.precio=precio;
	}

	public void setInStock(int inStock) {
		this.inStock=inStock;
	}

	public void setCosto(double costo) {
		this.costo=costo;
	}


}