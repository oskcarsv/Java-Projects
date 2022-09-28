package org.workgroup.model;

public class CompaniaTelefonica {
    
    private int idCompania;
    private String nombreCompania;
    private int extensionCompania;        

    
    public CompaniaTelefonica(){
        
    }
    
    public CompaniaTelefonica(int idCompania, String nombreCompania, int extensionCompania) {
        this.idCompania = idCompania;
        this.nombreCompania = nombreCompania;
        this.extensionCompania = extensionCompania;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public int getExtensionCompania() {
        return extensionCompania;
    }

    public void setExtensionCompania(int extensionCompania) {
        this.extensionCompania = extensionCompania;
    }

    @Override
    public String toString() {
        return "CompaniaTelefonica{" + "idCompania=" + idCompania +
                ", nombreCompania=" + nombreCompania +
                ", extensionCompania=" + extensionCompania + '}';
    }
 
    
    public String listarCompaniaTelefonica(){
        return "Compania Telefonica: " + nombreCompania + " | " + " Extension: " + extensionCompania;
    }    
    
}
