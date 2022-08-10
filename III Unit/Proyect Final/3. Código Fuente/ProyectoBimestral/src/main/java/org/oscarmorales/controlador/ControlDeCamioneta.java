package org.oscarmorales.controlador;

import java.util.ArrayList;
import org.oscarmorales.modelo.Camioneta;

/**
 * Control de camioneta, clase que se ejecuta para el funcionamiento del programa
 * @author Oscar
 */

public class ControlDeCamioneta{
    
	private static ControlDeCamioneta instanciaCamioneta;//Patron de diseño SINGLETON
	private ArrayList<Camioneta> listaDeCamionetas;
	
	//Declaración y definición de los métodos constructores
	private ControlDeCamioneta(){
		listaDeCamionetas = new ArrayList<Camioneta>();
	}
	
        /**
         * @return Retorna la instanciaCamioneta, aplicando el patron de diseño singleton
         */      
	public static ControlDeCamioneta getInstanciaCamioneta(){//Patron de diseño SINGLETON
		if(instanciaCamioneta == null){
			instanciaCamioneta = new ControlDeCamioneta();
		} return instanciaCamioneta;
	}
	
        /**
         * Metodo para agregar camioneta
         * @param nuevoCamioneta Parametro Objeto camioneta
         */
        
	//Declaración y definición de los métodos CRUD	
	public void agregarCamioneta(Camioneta nuevoCamioneta){
		listaDeCamionetas.add(nuevoCamioneta);
	}//agregarCamioneta
	
        
        /**
         * Metodo para mostrar el contenido del arraylist de camioneta
         * @return Retorna la lista de camionetas
         */
	public ArrayList<Camioneta> mostrarCamionetas(){
		return listaDeCamionetas;
	}//mostrarCamioneta
	
        
        /**
         * Metodo para verificar placa de camioneta
         * @param placa Parametro placa de camioneta
         * @return Retorna el objeto camionetaEncontrada
         */
	public Camioneta verCamioneta(String placa){
		Camioneta camionetaEncontrado = new Camioneta();
		for(Camioneta camioneta : listaDeCamionetas){
			if(camioneta.getPlaca().equals(placa)){
				camionetaEncontrado = camioneta;
				break;
			}//if
		}//for
		return camionetaEncontrado;
	}//verCamioneta
	
        
        /**
         * Metodo para eliminar placa de camioneta
         * @param camionetaAEliminar Parametro objeto camioneta que sera eliminado
         */
	public void eliminarCamioneta(Camioneta camionetaAEliminar){
		listaDeCamionetas.remove(camionetaAEliminar);
	}
	
        /**
         * Metodo para verificar y eliminar camioneta
         * @param placa Parametro placa de camioneta
         */
	public void eliminarCamioneta(String placa){
		Camioneta camionetaAEliminar = new Camioneta();
		for(Camioneta camioneta : listaDeCamionetas){
			if( camioneta.getPlaca().equals(placa)){
				camionetaAEliminar = camioneta;
				listaDeCamionetas.remove(camionetaAEliminar);
				break;
			}//if
		}//for		
	}
	
        /**
         * Metodo para actualizar camioneta
         * @param camionetaAntiguo Parametro objeto Camioneta antigua
         * @param camionetaActualizado Parametro objeto Camioneta nueva
         */
	public void actualizarCamioneta(Camioneta camionetaAntiguo, Camioneta camionetaActualizado){
		int indiceDelArray = listaDeCamionetas.indexOf(camionetaAntiguo);
		listaDeCamionetas.set(indiceDelArray,camionetaActualizado);
	}
	
        /**
         * Metodo para la cantidad de camionetas
         * @return Retorna el tamaño del arraylist de camioneta
         */
	public int cantidadDeCamionetas(){
		return listaDeCamionetas.size();
	}
}