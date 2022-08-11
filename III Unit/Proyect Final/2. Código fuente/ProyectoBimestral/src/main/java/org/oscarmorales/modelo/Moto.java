package org.oscarmorales.modelo;

/**
 * Clase modelo moto hereda de clase Vehiculo
 * @author Oscar
 */
public class Moto extends Vehiculo{
    
    private String marca = "No existe";
    private String modelo = "No existe";
    private String placa = "No existe";
    private String combustible = "No existe";
    private int motor;
  
    /**
    * Constructor vacio
    */
    public Moto(){
        
    }
  
    /**
    * @param marca Parametro marca
    * @param modelo Parametro modelo
    * @param placa Parametro placa
    * @param combustible Parametro combustible
    * @param motor Parametro motor
    */
    public Moto(String marca, String modelo, String placa, String combustible, int motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.combustible = combustible;
        this.motor = motor;
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
     * @param marcaMoto 
     */
    public void setMarca(String marcaMoto) {
        this.marca = marcaMoto;
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
     * @param modeloMoto 
     */
    public void setModelo(String modeloMoto) {
        this.modelo = modeloMoto;
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
     * @param placaMoto 
     */
    public void setPlaca(String placaMoto) {
        this.placa = placaMoto;
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
     * @param combustibleMoto 
     */
    public void setCombustible(String combustibleMoto) {
        this.combustible = combustibleMoto;
    }

    /**
     * 
     * @return 
     */
    public int getMotor() {
        return motor;
    }

    /**
     * 
     * @param motorMoto 
     */
    public void setMotor(int motorMoto) {
        this.motor = motorMoto;
    }
      
}
