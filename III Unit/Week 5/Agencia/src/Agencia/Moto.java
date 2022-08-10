package Agencia;

public class Moto extends Vehiculo implements InterfaceVehiculos{
    int cilindraje;
    String placa;

    public Moto(int cilindraje, String marca, String linea, int modelo) {
        super(marca, linea, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    public void estadoVehiculo(){
        System.out.println("Moto esta en buen estado");
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void cantidadPuertas(int cantidadPuertas){
        System.out.println("La moto no tiene puertas");
    }    
    
}
