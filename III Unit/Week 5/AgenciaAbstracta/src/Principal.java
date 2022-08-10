
public class Principal {
    
    
    public static void main(String args[]){
        
        System.out.println("   ");
        System.out.println("CARRO");
        Carro c=new Carro("A123BBB");
        c.combustible();
        c.mostrarPlaca();
        
        
        System.out.println("   ");
        System.out.println("CAMION");        
        Camion ca=new Camion("C456DDD");
        ca.combustible();
        ca.mostrarPlaca();        

        
        System.out.println("   ");
        System.out.println("BICICLETA");        
        Bicicleta b=new Bicicleta("E789FFF");
        b.combustible();
        b.mostrarPlaca();        
        
    }
}
