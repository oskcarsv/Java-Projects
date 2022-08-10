package org.oscarmorales.controlador;

import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import org.oscarmorales.modelo.Carro;

/**
 * Control de carro, clase que se ejecuta para el funcionamiento del programa
 * @author Oscar
 */

public class ControlDeCarro{
    
	private static ControlDeCarro instanciaCarro;//Patron de diseño SINGLETON
	private static ArrayList<Carro> listaDeCarros;
	
	//Declaración y definición de los métodos constructores
	private ControlDeCarro(){
		listaDeCarros = new ArrayList<Carro>();
	}
	
        /**
         * @return Retorna la instanciaCarro, aplicando el patron de diseño singleton
         */
	public static ControlDeCarro getInstanciaCarro(){//Patron de diseño SINGLETON
		if(instanciaCarro == null){
			instanciaCarro = new ControlDeCarro();
		} return instanciaCarro;
	}
        
        /**
         * Metodo para agregar carro
         * @param nuevoCarro Parametro Objeto carro
         */

	//Declaración y definición de los métodos CRUD	
	public void agregarCarro(Carro nuevoCarro){
		listaDeCarros.add(nuevoCarro);
	}//agregarCarro
	
        
        /**
         * Metodo para mostrar el contenido del arraylist de carro
         * @return Retorna la lista de carros
         */
	public ArrayList<Carro> mostrarCarros(){
		return listaDeCarros;
	}//mostrarCarro
	
        
        /**
         * Metodo para verificar placa de carros
         * @param placa Parametro placa de carris
         * @return Retorna el objeto CarroEncontrado
         */
	public Carro verCarro(String placa){
		Carro carroEncontrado = new Carro();
		for(Carro carro : listaDeCarros){
			if( carro.getPlaca().equals(placa)){
				carroEncontrado = carro;
				break;
                        }//if
		}//for
		return carroEncontrado;

	}//verCarro
	
        
        /**
         * Metodo para eliminar placa de carro
         * @param carroAEliminar Parametro objeto carro que sera eliminado
         */
	public void eliminarCarro(Carro carroAEliminar){
		listaDeCarros.remove(carroAEliminar);
	}
	
        /**
         * Metodo para verificar y eliminar carro
         * @param placa Parametro placa de carro
         */
	public void viewEliminarCarro(String placa){
		Carro carroAEliminar = new Carro();
		for(Carro carro : listaDeCarros){
			if(carro.getPlaca().equals(placa)){
				carroAEliminar = carro;
				listaDeCarros.remove(carroAEliminar);
				break;
                        }//if
		}//for		
	}
        
        /**
         * Metodo para actualizar carro
         * @param carroAntiguo Parametro objeto Carro antiguo
         * @param carroActualizado Parametro objeto Carro nuevo
         */
	
	public void actualizarCarro(Carro carroAntiguo, Carro carroActualizado){
		int indiceDelArray = listaDeCarros.indexOf(carroAntiguo);
		listaDeCarros.set(indiceDelArray,carroActualizado);
	}
	
        /**
         * Metodo para la cantidad de carros
         * @return Retorna el tamaño del arraylist de carro
         */
	public int cantidadDeCarros(){
		return listaDeCarros.size();
	}
}