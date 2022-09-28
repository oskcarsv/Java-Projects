package org.workgroup.model;

import java.sql.Date;

public class Transacciones {
    
    private long idTransacciones;
    private String identificadorPago;
    private String descripcionTransaccion;
    private double montoPagoTransaccion;
    private Date fechaDeTransacion;
    private long idUsuario;
    private int idTipoProveedor;
    private long idCuenta;
    private String usuario;
    private String proveedor;
    private String servicio;
    private double saldocuenta;
    
    public Transacciones(){
        
    }

    public Transacciones(long idTransacciones, String identificadorPago, String descripcionTransaccion, double montoPagoTransaccion, Date fechaDeTransacion, long idUsuario, int idTipoProveedor, long idCuenta, String usuario, String proveedor, String servicio, double saldocuenta) {
        this.idTransacciones = idTransacciones;
        this.identificadorPago = identificadorPago;
        this.descripcionTransaccion = descripcionTransaccion;
        this.montoPagoTransaccion = montoPagoTransaccion;
        this.fechaDeTransacion = fechaDeTransacion;
        this.idUsuario = idUsuario;
        this.idTipoProveedor = idTipoProveedor;
        this.idCuenta = idCuenta;
        this.usuario = usuario;
        this.proveedor = proveedor;
        this.servicio = servicio;
        this.saldocuenta = saldocuenta;
    }

    public long getIdTransacciones() {
        return idTransacciones;
    }

    public void setIdTransacciones(long idTransacciones) {
        this.idTransacciones = idTransacciones;
    }

    public String getIdentificadorPago() {
        return identificadorPago;
    }

    public void setIdentificadorPago(String identificadorPago) {
        this.identificadorPago = identificadorPago;
    }

    public String getDescripcionTransaccion() {
        return descripcionTransaccion;
    }

    public void setDescripcionTransaccion(String descripcionTransaccion) {
        this.descripcionTransaccion = descripcionTransaccion;
    }

    public double getMontoPagoTransaccion() {
        return montoPagoTransaccion;
    }

    public void setMontoPagoTransaccion(double montoPagoTransaccion) {
        this.montoPagoTransaccion = montoPagoTransaccion;
    }

    public Date getFechaDeTransacion() {
        return fechaDeTransacion;
    }

    public void setFechaDeTransacion(Date fechaDeTransacion) {
        this.fechaDeTransacion = fechaDeTransacion;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoProveedor() {
        return idTipoProveedor;
    }

    public void setIdTipoProveedor(int idTipoProveedor) {
        this.idTipoProveedor = idTipoProveedor;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public double getSaldocuenta() {
        return saldocuenta;
    }

    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    @Override
    public String toString() {
        return "Transacciones{" + "idTransacciones=" + idTransacciones + 
                ", identificadorPago=" + identificadorPago + 
                ", descripcionTransaccion=" + descripcionTransaccion + 
                ", montoPagoTransaccion=" + montoPagoTransaccion + 
                ", fechaDeTransacion=" + fechaDeTransacion + 
                ", idUsuario=" + idUsuario + 
                ", idTipoProveedor=" + idTipoProveedor + 
                ", idCuenta=" + idCuenta + 
                ", usuario=" + usuario + 
                ", proveedor=" + proveedor + 
                ", servicio=" + servicio + 
                ", saldocuenta=" + saldocuenta + '}';
    }
    
    public String listarTransaciones(){
        return  "ID Transaccion: " + idTransacciones + " | " +
                "Identificador de Pago: " + identificadorPago + " | " + 
                "Descripcion:" + descripcionTransaccion + " | " + 
                "Monto de Pago: " + montoPagoTransaccion + " | " + 
                "Fecha de Transaccion: " + fechaDeTransacion + " | " + 
                "Usuario: " + usuario + " | " + 
                "Proveedor: " + proveedor + " | " + 
                "Servicios: " + servicio + " | " + 
                "Saldo Ceunta: " + saldocuenta;
    }
    
}
