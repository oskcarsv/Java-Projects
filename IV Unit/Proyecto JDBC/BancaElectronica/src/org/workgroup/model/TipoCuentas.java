
package org.workgroup.model;

public class TipoCuentas {
    
    private int idTipoCuenta;
    private String nombreCuenta;
    private String descripcionCuenta;

    public TipoCuentas(){
        
    }
    
    public TipoCuentas(int idTipoCuenta, String nombreCuenta, String descripcionCuenta) {
        this.idTipoCuenta = idTipoCuenta;
        this.nombreCuenta = nombreCuenta;
        this.descripcionCuenta = descripcionCuenta;
    }

    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    @Override
    public String toString() {
        return "TipoCuentas{" + "idTipoCuenta=" + idTipoCuenta + 
                ", nombreCuenta=" + nombreCuenta + 
                ", descripcionCuenta=" + descripcionCuenta + '}';
    }
    
    public String listarTipoCuentas(){
        return "ID Tipo Cuenta: " + idTipoCuenta + " | " +  "Nombre Tipo de Cuenta: " + nombreCuenta + " | " +
                " | " + "Descripcion Tipo Cuenta: " + descripcionCuenta;
    }
    
}
