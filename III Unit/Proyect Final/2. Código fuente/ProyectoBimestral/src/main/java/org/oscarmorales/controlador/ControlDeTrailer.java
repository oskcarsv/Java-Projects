package org.oscarmorales.controlador;

import java.util.ArrayList;
import org.oscarmorales.modelo.Trailer;

/**
 * Control de trailer, clase que se ejecuta para el funcionamiento del programa
 * @author Oscar
 */

public class ControlDeTrailer{
    
	private static ControlDeTrailer instanciaTrailer;//Patron de diseño SINGLETON
	private ArrayList<Trailer> listaDeTrailers;
	
	//Declaración y definición de los métodos constructores
	private ControlDeTrailer(){
		listaDeTrailers = new ArrayList<Trailer>();
	}

        /**
         * @return Retorna la instanciaTrailers, aplicando el patron de diseño singleton
         */      
	public static ControlDeTrailer getInstanciaTrailer(){//Patron de diseño SINGLETON
		if(instanciaTrailer == null){
			instanciaTrailer = new ControlDeTrailer();
		} return instanciaTrailer;
	}
	
        /**
         * Metodo para agregar trailer
         * @param nuevoTrailer Parametro Obejto trailer
         */
        
	//Declaración y definición de los métodos CRUD	
	public void agregarTrailer(Trailer nuevoTrailer){
		listaDeTrailers.add(nuevoTrailer);
	}//agregarTrailer
        
        /**
         * Metodo para mostrar el contenido del arraylist de trailer
         * @return Retorna la lista de trailer
         */
	
	public ArrayList<Trailer> mostrarTrailer(){
		return listaDeTrailers;
	}//agregarTrailer
        
        
        /**
         * Metodo para verificar placa de trailer
         * @param placa Parametro placa de trailer
         * @return Retorna el objeto trailerEncontrada
         */
	
	public Trailer verTrailer(String placa){
		Trailer trailerEncontrado = new Trailer();
		for(Trailer trailer : listaDeTrailers){
			if(trailer.getPlaca().equals(placa)){
				trailerEncontrado = trailer;
				break;
			}//if
		}//for
		return trailerEncontrado;
	}//verTrailer
	
        /**
         * Metodo para verificar y eliminar trailer
         * @param trailerAEliminar Parametro placa de trailer
         */
	public void eliminarTrailer(Trailer trailerAEliminar){
		listaDeTrailers.remove(trailerAEliminar);
	}
	
        
        /**
         * Metodo para verificar y eliminar trailer
         * @param placa Trailer placa de trailer
         */
	public void eliminarTrailer(String placa){
		Trailer trailerAEliminar = new Trailer();
		for(Trailer trailer : listaDeTrailers){
			if( trailer.getPlaca().equals(placa)){
				trailerAEliminar = trailer;
				listaDeTrailers.remove(trailerAEliminar);
				break;
			}//if
		}//for		
	}
	
        
        /**
         * Metodo para actualizar trailer
         * @param trailerAntiguo Parametro objeto Trailer antigua
         * @param trailerActualizado Parametro objeto Trailer nueva
         */
	public void actualizarTrailer(Trailer trailerAntiguo, Trailer trailerActualizado){
		int indiceDelArray = listaDeTrailers.indexOf(trailerAntiguo);
		listaDeTrailers.set(indiceDelArray,trailerActualizado);
	}
	
        /**
         * Metodo para la cantidad de trailers
         * @return Retorna el tamaño del arraylist de trailer
         */
	public int cantidadDeTrailers(){
		return listaDeTrailers.size();
	}
}