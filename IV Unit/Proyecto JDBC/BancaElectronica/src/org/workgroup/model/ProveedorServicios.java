package org.workgroup.model;

public class ProveedorServicios {
    
    private int idTipoProveedor;
    private String nombreProveedorServicio;
    private String tipoServicio;
    private String descripcionServicio;
    
    
    public ProveedorServicios(){
        
    }

    public ProveedorServicios(int idTipoProveedor, String nombreProveedorServicio, String tipoServicio, String descripcionServicio) {
        this.idTipoProveedor = idTipoProveedor;
        this.nombreProveedorServicio = nombreProveedorServicio;
        this.tipoServicio = tipoServicio;
        this.descripcionServicio = descripcionServicio;
    }

    public int getIdTipoProveedor() {
        return idTipoProveedor;
    }

    public void setIdTipoProveedor(int idTipoProveedor) {
        this.idTipoProveedor = idTipoProveedor;
    }

    public String getNombreProveedorServicio() {
        return nombreProveedorServicio;
    }

    public void setNombreProveedorServicio(String nombreProveedorServicio) {
        this.nombreProveedorServicio = nombreProveedorServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    @Override
    public String toString() {
        return "ProveedorServicios{" + "idTipoProveedor=" + idTipoProveedor + 
                ", nombreProveedorServicio=" + nombreProveedorServicio + 
                ", tipoServicio=" + tipoServicio + 
                ", descripcionServicio=" + descripcionServicio + '}';
    }
    
    
    public String listarProveedoresServicios(){
        return "ID Proveedor: " + idTipoProveedor +  " | " +
                "Proveedor: " + nombreProveedorServicio +  " | " +
                "Tipo de Servicios: " + tipoServicio +  " | " +
                "Descripcion de Servicio: " + descripcionServicio;
    }
        
}
