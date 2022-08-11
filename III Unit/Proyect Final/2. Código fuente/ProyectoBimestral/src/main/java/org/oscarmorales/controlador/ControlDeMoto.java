package org.oscarmorales.controlador;

import java.util.ArrayList;
import org.oscarmorales.modelo.Moto;

/**
 * Control de moto, clase que se ejecuta para el funcionamiento del programa
 * @author Oscar
 */

public class ControlDeMoto{
    
	private static ControlDeMoto instanciaMoto;//Patron de diseño SINGLETON
	private ArrayList<Moto> listaDeMotos;
	
	//Declaración y definición de los métodos constructores
	private ControlDeMoto(){
		listaDeMotos = new ArrayList<Moto>();
	}
	
        
        /**
         * @return Retorna la instanciaMoto, aplicando el patron de diseño singleton
         */
	public static ControlDeMoto getInstanciaMoto(){//Patron de diseño SINGLETON
		if(instanciaMoto == null){
			instanciaMoto = new ControlDeMoto();
		} return instanciaMoto;
	}
	
        
        /**
         * Metodo para agregar moto
         * @param nuevoMoto Parametro Objeto moto
         */
        
	//Declaración y definición de los métodos CRUD	
	public void agregarMoto(Moto nuevoMoto){
		listaDeMotos.add(nuevoMoto);
	}//agregarMoto
	
        
        /**
         * Metodo para mostrar el contenido del arraylist de moto
         * @return Retorna la lista de motos
         */
	public ArrayList<Moto> mostrarMotos(){
		return listaDeMotos;
	}//mostrarMoto
	
        
        /**
         * Metodo para verificar placa de moto
         * @param placa Parametro placa de moto
         * @return Retorna el objeto motoEncontrado
         */
	public Moto verMoto(String placa){
		Moto motoEncontrado = new Moto();
		for(Moto moto : listaDeMotos){
			if(moto.getPlaca().equals(placa)){
				motoEncontrado = moto;
				break;
			}//if
		}//for
		return motoEncontrado;
	}//verMoto

        
        /**
         * Metodo para eliminar placa de moto
         * @param motoAEliminar Parametro objeto moto que sera eliminado
         */
	public void eliminarMoto(Moto motoAEliminar){
		listaDeMotos.remove(motoAEliminar);
	}
	
        /**
         * Metodo para verificar y eliminar moto
         * @param placa Parametro placa de moto
         */
	public void eliminarMoto(String placa){
		Moto motoAEliminar = new Moto();
		for(Moto moto : listaDeMotos){
			if(moto.getPlaca().equals(placa)){
				motoAEliminar = moto;
				listaDeMotos.remove(motoAEliminar);
				break;
			}//if
		}//for		
	}
	
        /**
         * Metodo para actualizar moto
         * @param motoAntiguo Parametro objeto Coto antigua
         * @param motoActualizado  Parametro objeto Coto nueva
         */
	public void actualizarMoto(Moto motoAntiguo, Moto motoActualizado){
		int indiceDelArray = listaDeMotos.indexOf(motoAntiguo);
		listaDeMotos.set(indiceDelArray,motoActualizado);
	}
        
        /**
         * Metodo para la cantidad de moto
         * @return Retorna el tamaño del arraylist de moto
         */
	public int cantidadDeMotos(){
		return listaDeMotos.size();
	}
}