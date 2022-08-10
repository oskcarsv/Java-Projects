
public class Carro extends Vehiculo{
    
    String placa;

    public Carro(String placa) {
        this.placa = placa;
    }
    
    public void combustible(){
        System.out.println("Uso gasolina");        
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
