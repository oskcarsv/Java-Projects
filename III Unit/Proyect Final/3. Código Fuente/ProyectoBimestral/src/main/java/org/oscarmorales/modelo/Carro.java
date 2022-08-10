package org.oscarmorales.modelo;

/**
 * Clase modelo carro hereda de clase Vehiculo
 * @author oskca
 */

public class Carro extends Vehiculo{
    
    private String marca = "No existe";
    private String modelo = "No existe";
    private String placa = "No existe";
    private String combustible = "No existe";
    private int puertas;
  
    /**
    * Constructor vacio
    */
    public Carro(){
        
    }
 
    /**
     * @param marca Parametro marca
     * @param modelo Parametro modelo
     * @param placa Parametro placa
     * @param combustible Parametro combustible
     * @param puertas Parametro puertas
     */
    public Carro(String marca, String modelo, String placa, String combustible, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.combustible = combustible;
        this.puertas = puertas;
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
     * @param marcaCarro 
     */
    public void setMarca(String marcaCarro) {
        this.marca = marcaCarro;
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
     * @param modeloCarro 
     */
    public void setModelo(String modeloCarro) {
        this.modelo = modeloCarro;
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
     * @param placaCarro 
     */
    public void setPlaca(String placaCarro) {
        this.placa = placaCarro;
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
     * @param combustibleCarro 
     */
    public void setCombustible(String combustibleCarro) {
        this.combustible = combustibleCarro;
    }

    /**
     * 
     * @return 
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * 
     * @param puertasCarro 
     */
    public void setPuertas(int puertasCarro) {
        this.puertas = puertasCarro;
    }    
    
}
