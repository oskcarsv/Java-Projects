
public class Camion extends Vehiculo{
    
    String placa;

    public Camion(String placa) {
        this.placa = placa;
    }
    
    public void combustible(){
        System.out.println("Uso Diesel");        
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
