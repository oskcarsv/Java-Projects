package Agencia;

public class Panel extends Vehiculo implements InterfaceVehiculos{
    int cilindraje;
    String placa;

    public Panel(int cilindraje, String marca, String linea, int modelo) {
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
        System.out.println("Panel esta en buen estado");
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void cantidadPuertas(int cantidadPuertas){
        System.out.println("La panel tiene "+cantidadPuertas+" puertas");
    }    
    
}
