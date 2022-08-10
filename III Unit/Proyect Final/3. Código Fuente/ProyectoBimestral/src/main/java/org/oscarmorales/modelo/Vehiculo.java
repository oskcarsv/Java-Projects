package org.oscarmorales.modelo;

/**
 * Clase abstracta vehiculo
 * @author Oscar
 */

public abstract class Vehiculo {
    
    /**
     * @return Retorna Marca
     */
    public abstract String getMarca();
    /**
     * @param marca Parametro marca
     */
    public abstract void setMarca(String marca); 
    
    
    
    /**
     * @return Retorna Modelo
     */
    public abstract String getModelo();
    /**
     * @param modelo Parametro modelo
     */
    public abstract void setModelo(String modelo);     
    
    
    
    /**
     * @return Retorna placa
     */
    public abstract String getPlaca();
    /**
     * @param placa Parametro placa
     */
    public abstract void setPlaca(String placa);   
    
    
    
    /**
     * @return Retorna Combustible
     */
    public abstract String getCombustible();
    /**
     * @param combustible Parametro combustible
     */
    public abstract void setCombustible(String combustible);    
    
}
