package org.workgroup.model;

public class Cuentas {
    private long idCuenta;
    private double saldoCuenta;
    private int idTipoCuenta;
    private int idMoneda;
    private String tipoCuenta;
    private String descripcionCuenta;
    private String moneda;
    
    
    public Cuentas(){
        
    }

    public Cuentas(long idCuenta, double saldoCuenta, int idTipoCuenta, int idMoneda, String tipoCuenta, String descripcionCuenta, String moneda) {
        this.idCuenta = idCuenta;
        this.saldoCuenta = saldoCuenta;
        this.idTipoCuenta = idTipoCuenta;
        this.idMoneda = idMoneda;
        this.tipoCuenta = tipoCuenta;
        this.descripcionCuenta = descripcionCuenta;
        this.moneda = moneda;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "idCuenta=" + idCuenta + 
                ", saldoCuenta=" + saldoCuenta + 
                ", idTipoCuenta=" + idTipoCuenta + 
                ", idMoneda=" + idMoneda + 
                ", tipoCuenta=" + tipoCuenta + 
                ", descripcionCuenta=" + descripcionCuenta + 
                ", moneda=" + moneda + '}';
    }

    public String listarCuentas(){
        return "ID Cuenta: " + idCuenta + " | " +
                "Saldo Cuenta: " + saldoCuenta +  " | " +
                "Tipo Cuenta: " + tipoCuenta + " | " +
                "Descripcion de Cuenta: " + descripcionCuenta + " | " +
                "Moneda: " + moneda;
    }
    
}
