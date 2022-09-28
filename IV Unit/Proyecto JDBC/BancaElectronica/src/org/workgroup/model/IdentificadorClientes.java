package org.workgroup.model;

public class IdentificadorClientes {
    
    private int idIdentificadorCliente;
    private String nombreIdentificadorCliente;
    
    
    public IdentificadorClientes(){
        
    }

    public IdentificadorClientes(int idIdentificadorCliente, String nombreIdentificadorCliente) {
        this.idIdentificadorCliente = idIdentificadorCliente;
        this.nombreIdentificadorCliente = nombreIdentificadorCliente;
    }

    public int getIdIdentificadorCliente() {
        return idIdentificadorCliente;
    }

    public void setIdIdentificadorCliente(int idIdentificadorCliente) {
        this.idIdentificadorCliente = idIdentificadorCliente;
    }

    public String getNombreIdentificadorCliente() {
        return nombreIdentificadorCliente;
    }

    public void setNombreIdentificadorCliente(String nombreIdentificadorCliente) {
        this.nombreIdentificadorCliente = nombreIdentificadorCliente;
    }
    
    @Override
    public String toString() {
        return "IdentificadorClientes{" + "idIdentificadorCliente=" + idIdentificadorCliente + 
                ", nombreIdentificadorCliente=" + nombreIdentificadorCliente + '}';
    }
    
    public String listarIdentificadorClientes(){
        return "ID Identificador Clientes: " + idIdentificadorCliente + " | " +
                " Nombre Identificador Clientes: " + nombreIdentificadorCliente;        
    }
    
}