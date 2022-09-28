package org.workgroup.model;

import java.sql.Date;

public class Consultas {
    
    // Atributos consulta de fechas
    private String descripcionTransaccion;
    private Date fechaDeTransaccion; 
    private String nombreUsuario;
    
    // Historias de Transacciones
    private String usuario;
    private double saldoCuenta;
    private String identificadorPago;
    private String descripcion;
    private double montoPago;
    private Date fechaTransaccion;
    private String proveedor;
    private String servicio;
    
    
    public Consultas(){
        
    }

    public Consultas(String descripcionTransaccion, Date fechaDeTransaccion, String nombreUsuario, String usuario, double saldoCuenta, String identificadorPago, String descripcion, double montoPago, Date fechaTransaccion, String proveedor, String servicio) {
        this.descripcionTransaccion = descripcionTransaccion;
        this.fechaDeTransaccion = fechaDeTransaccion;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.saldoCuenta = saldoCuenta;
        this.identificadorPago = identificadorPago;
        this.descripcion = descripcion;
        this.montoPago = montoPago;
        this.fechaTransaccion = fechaTransaccion;
        this.proveedor = proveedor;
        this.servicio = servicio;
    }

    public String getDescripcionTransaccion() {
        return descripcionTransaccion;
    }

    public void setDescripcionTransaccion(String descripcionTransaccion) {
        this.descripcionTransaccion = descripcionTransaccion;
    }

    public Date getFechaDeTransaccion() {
        return fechaDeTransaccion;
    }

    public void setFechaDeTransaccion(Date fechaDeTransaccion) {
        this.fechaDeTransaccion = fechaDeTransaccion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getIdentificadorPago() {
        return identificadorPago;
    }

    public void setIdentificadorPago(String identificadorPago) {
        this.identificadorPago = identificadorPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Consultas{" + "descripcionTransaccion=" + descripcionTransaccion + 
                ", fechaDeTransaccion=" + fechaDeTransaccion + 
                ", nombreUsuario=" + nombreUsuario + 
                ", usuario=" + usuario + 
                ", saldoCuenta=" + saldoCuenta + 
                ", identificadorPago=" + identificadorPago + 
                ", descripcion=" + descripcion + 
                ", montoPago=" + montoPago + 
                ", fechaTransaccion=" + fechaTransaccion + 
                ", proveedor=" + proveedor + 
                ", servicio=" + servicio + '}';
    }
    
    public String consultaDeFechas(){
        return "Descripcion de Transaccion: " + descripcionTransaccion + " | " +
                "Fecha de Transaccion: " + fechaDeTransaccion + " | " +
                "Usuario: " + nombreUsuario + " | ";
        
    }
    
    public String historial(){
        return "Usuario: " + usuario + " | " +
               "Saldo en la Cuenta: " + saldoCuenta + " | " +
               "Identificador de Pago: " + identificadorPago + " | " +
               "Descripcion de Transaccion: " + descripcion + " | " +
               "Monto de Pago: " + montoPago + " | " + 
               "Fecha de Transaccion: " + fechaTransaccion + " | " +
               "Proveedor: " + proveedor + " | " +
               "Servicio: " + servicio + " | ";
    }
    
    
}
