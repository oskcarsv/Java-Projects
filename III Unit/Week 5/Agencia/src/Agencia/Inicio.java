package Agencia;

public class Inicio {
    
    public static void main(String[] args){
        System.out.println("   ");        
        System.out.println("CARRO");        
        Carro c=new Carro(1600,"Honda","Civic",2000);
        c.estadoVehiculo();
        c.setPlaca("j123abc");
        c.cantidadPuertas(4);
        System.out.println(c.getPlaca());
        
        System.out.println("   ");        
        System.out.println("MOTO");        
        Moto m=new Moto(150,"Yamaha","Cienita",2006);
        m.estadoVehiculo();
        m.setPlaca("h456efg");
        m.cantidadPuertas(0);        
        System.out.println(m.getPlaca());
        
        System.out.println("    ");        
        System.out.println("PANEL");        
        Panel p=new Panel(1600,"Hyunday","SantaFe",2015);
        p.estadoVehiculo();
        p.setPlaca("x789hij");
        p.cantidadPuertas(6);        
        System.out.println(p.getPlaca());
        
    }
    
}
