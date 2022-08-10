package org.oscarmorales.modelo;

/**
 * Clase modelo trailer hereda de clase Vehiculo
 * @author Oscar
 */
public class Trailer extends Vehiculo{
    
    private String marca = "No existe";
    private String modelo = "No existe";
    private String placa = "No existe";
    private String combustible = "No existe";
    private int toneladas;
    
    /**
    * Constructor vacio
    */
    public Trailer(){
        
    }
    
    /**
    * @param marca Parametro marca
    * @param modelo Parametro modelo
    * @param placa Parametro placa
    * @param combustible Parametro combustible
    * @param toneladas Parametro toneladas
    */
    public Trailer(String marca, String modelo, String placa, String combustible, int toneladas) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.combustible = combustible;
        this.toneladas = toneladas;
    }

    /**
     * 
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * 
     * @param marcaTrailer 
     */
    public void setMarca(String marcaTrailer) {
        this.marca = marcaTrailer;
    }

    /**
     * 
     * @return 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * 
     * @param modeloTrailer 
     */
    public void setModelo(String modeloTrailer) {
        this.modelo = modeloTrailer;
    }

    /**
     * 
     * @return 
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * 
     * @param placaTrailer 
     */
    public void setPlaca(String placaTrailer) {
        this.placa = placaTrailer;
    }

    /**
     * 
     * @return 
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * 
     * @param combustibleTrailer 
     */
    public void setCombustible(String combustibleTrailer) {
        this.combustible = combustibleTrailer;
    }

    /**
     * 
     * @return 
     */
    public int getToneladas() {
        return toneladas;
    }

    /**
     * 
     * @param toneladasTrailer 
     */
    public void setToneladas(int toneladasTrailer) {
        this.toneladas = toneladasTrailer;
    }    
    
}
