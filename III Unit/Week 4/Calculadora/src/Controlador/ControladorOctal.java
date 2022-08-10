package Controlador;


public class ControladorOctal {
    
    public void octal(Integer c){
        String valor = Integer.toOctalString(c);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }

    public void octal(Double c){
        
        Integer d = c.intValue();
        
        String valor = Integer.toOctalString(d);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }
 
}
