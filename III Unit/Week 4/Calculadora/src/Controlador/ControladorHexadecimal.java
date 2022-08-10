package Controlador;


public class ControladorHexadecimal {
    
   public void hexa(Integer c){
        String valor = Integer.toHexString(c);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }

    public void hexa(Double c){
        
        Integer d = c.intValue();
        
        String valor = Integer.toHexString(d);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }
    
}
