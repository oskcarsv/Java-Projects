package org.workgroup.model;

public class Monedas {
    
    private int idMoneda;
    private String nombreMoneda;

    
    public Monedas(){
        
    }
    
    public Monedas(int idMoneda, String nombreMoneda) {
        this.idMoneda = idMoneda;
        this.nombreMoneda = nombreMoneda;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }
    
    @Override
    public String toString() {
        return "Monedas{" + "idMoneda=" + idMoneda + 
                ", nombreMoneda=" + nombreMoneda + '}';
    }
    
    public String listarMonedas(){
        return "ID Moneda: " + idMoneda + " | " + " Moneda: " + nombreMoneda;
    }       
}