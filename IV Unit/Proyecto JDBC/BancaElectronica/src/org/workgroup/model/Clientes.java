package org.workgroup.model;

public class Clientes {
    
    private long cuiCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private int telefonoCliente;
    private String sexoCliente;
    private String nacionalidadCliente;
    private int idCompania;
    private int idIdentificadorCliente;
    private long dpiPasaporte;
    private String companiaTelefonica;
    private String residencia;
    
    
    
    public Clientes(){
        
    }

    public Clientes(long cuiCliente, String nombreCliente, String apellidoCliente, String direccionCliente, int telefonoCliente, String sexoCliente, String nacionalidadCliente, int idCompania, int idIdentificadorCliente, long dpiPasaporte, String companiaTelefonica, String residencia) {
        this.cuiCliente = cuiCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.sexoCliente = sexoCliente;
        this.nacionalidadCliente = nacionalidadCliente;
        this.idCompania = idCompania;
        this.idIdentificadorCliente = idIdentificadorCliente;
        this.dpiPasaporte = dpiPasaporte;
        this.companiaTelefonica = companiaTelefonica;
        this.residencia = residencia;
    }

    public long getCuiCliente() {
        return cuiCliente;
    }

    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getNacionalidadCliente() {
        return nacionalidadCliente;
    }

    public void setNacionalidadCliente(String nacionalidadCliente) {
        this.nacionalidadCliente = nacionalidadCliente;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public int getIdIdentificadorCliente() {
        return idIdentificadorCliente;
    }

    public void setIdIdentificadorCliente(int idIdentificadorCliente) {
        this.idIdentificadorCliente = idIdentificadorCliente;
    }

    public long getDpiPasaporte() {
        return dpiPasaporte;
    }

    public void setDpiPasaporte(long dpiPasaporte) {
        this.dpiPasaporte = dpiPasaporte;
    }

    public String getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(String companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cuiCliente=" + cuiCliente + 
                ", nombreCliente=" + nombreCliente + 
                ", apellidoCliente=" + apellidoCliente + 
                ", direccionCliente=" + direccionCliente + 
                ", telefonoCliente=" + telefonoCliente + 
                ", sexoCliente=" + sexoCliente + 
                ", nacionalidadCliente=" + nacionalidadCliente + 
                ", idCompania=" + idCompania + 
                ", idIdentificadorCliente=" + idIdentificadorCliente + 
                ", dpiPasaporte=" + dpiPasaporte + 
                ", companiaTelefonica=" + companiaTelefonica + 
                ", residencia=" + residencia + '}';
    }
    
    public String listarClientes(){
        return "DPI o Pasaporte: " + dpiPasaporte + " | " +
                "Nombre: " + nombreCliente +  " | " +
                "Apellido: " + apellidoCliente +  " | " +
                "Dirrecion: " + direccionCliente +  " | " +
                "Sexo: " + sexoCliente +  " | " +
                "Nacionalidad: " + nacionalidadCliente +
                "Telefono: " + telefonoCliente +  " | " + 
                "Compania Telefonica: " + companiaTelefonica  +  " | " + 
                "Residencia: " + residencia;
    }
  
}
