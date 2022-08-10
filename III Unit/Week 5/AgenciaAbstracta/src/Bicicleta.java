
public class Bicicleta extends Vehiculo{
    
    String placa;

    public Bicicleta(String placa) {
        this.placa = placa;
    }
    
    public void combustible(){
        System.out.println("No uso combustible");        
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }    
    
    public void mostrarPlaca(){
        System.out.println(this.getPlaca());
    }    
}
