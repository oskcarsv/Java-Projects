package org.workgroup.model;

import java.sql.Date;

public class Usuarios {
    
    private long idUsuario;
    private String nombreUsuario;
    private String passwordUsuario;
    private String estadoUsuario;
    private Date fechaCreacionUsuario;
    private long cuiCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String sexo;
    private String nacionalidad;
    private int telefono;
    
    
    public Usuarios(){
        
    }

    public Usuarios(long idUsuario, String nombreUsuario, String passwordUsuario, String estadoUsuario, Date fechaCreacionUsuario, long cuiCliente, String nombre, String apellido, String direccion, String sexo, String nacionalidad, int telefono) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.estadoUsuario = estadoUsuario;
        this.fechaCreacionUsuario = fechaCreacionUsuario;
        this.cuiCliente = cuiCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Date getFechaCreacionUsuario() {
        return fechaCreacionUsuario;
    }

    public void setFechaCreacionUsuario(Date fechaCreacionUsuario) {
        this.fechaCreacionUsuario = fechaCreacionUsuario;
    }

    public long getCuiCliente() {
        return cuiCliente;
    }

    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + " | " +
                ", nombreUsuario=" + nombreUsuario + " | " + 
                ", passwordUsuario=" + passwordUsuario + " | " + 
                ", estadoUsuario=" + estadoUsuario + " | " + 
                ", fechaCreacionUsuario=" + fechaCreacionUsuario + " | " + 
                ", nombre=" + nombre + " | " + ", apellido=" + apellido + " | " + 
                ", direccion=" + direccion + " | " + 
                ", sexo=" + sexo + " | " + 
                ", nacionalidad=" + nacionalidad + " | " + 
                ", telefono=" + telefono + '}';
    }
    
    public String listarUsuarios(){
        return  "ID Usuario: " + idUsuario + " | " +
                "Usuario: " + nombreUsuario + " | " + 
                "Password: " + passwordUsuario + " | " + 
                "Estado: " + estadoUsuario + " | " + 
                "Fecha de Creacion: " + fechaCreacionUsuario + " | " + 
                "Nombre: " + nombre + " | " + 
                "Apellido: " + apellido + " | " + 
                "Direccion: " + direccion + " | " + 
                "Sexo: " + sexo + " | " + 
                "Nacionalidad: " + nacionalidad + " | " + 
                "Telefono: " + telefono;
        
    }
    
    
}
