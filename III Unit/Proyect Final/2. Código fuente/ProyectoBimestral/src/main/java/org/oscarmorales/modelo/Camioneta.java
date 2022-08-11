package org.oscarmorales.modelo;


/**
 * Clase modelo camioneta hereda de clase Vehiculo
 * @author Oscar
 */
public class Camioneta extends Vehiculo{
    
    private String marca = "No existe";
    private String modelo = "No existe";
    private String placa = "No existe";
    private String combustible = "No existe";
    private int asientos;
    
    /**
     * Constructor vacio
     */
    public Camioneta(){
        
    }
    
    /**
     * @param marca Parametro marca
     * @param modelo Parametro modelo
     * @param placa Parametro placa
     * @param combustible Parametro combustible
     * @param asientos Parametro asientos
     */
    public Camioneta(String marca, String modelo, String placa, String combustible, int asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.combustible = combustible;
        this.asientos = asientos;
    }
    
    /**
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marcaCamioneta
     */
    public void setMarca(String marcaCamioneta) {
        this.marca = marcaCamioneta;
    }

    /**
     * @return 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modeloCamioneta 
     */
    public void setModelo(String modeloCamioneta) {
        this.modelo = modeloCamioneta;
    }

    /**
     * @return 
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placaCamioneta 
     */
    public void setPlaca(String placaCamioneta) {
        this.placa = placaCamioneta;
    }

    /**
     * @return 
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustibleCamioneta 
     */
    public void setCombustible(String combustibleCamioneta) {
        this.combustible = combustibleCamioneta;
    }

    /**
     * @return 
     */
    public int getAsientos() {
        return asientos;
    }

    /**
     * @param asientosCamioneta 
     */
    public void setAsientos(int asientosCamioneta) {
        this.asientos = asientosCamioneta;
    }    
    
}
