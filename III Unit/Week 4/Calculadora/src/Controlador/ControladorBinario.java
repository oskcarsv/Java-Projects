package Controlador;


public class ControladorBinario {
    

    public void binario(Integer c){
        String valor = Integer.toBinaryString(c);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }

    public void binario(Double c){
        
        Integer d = c.intValue();
        
        String valor = Integer.toBinaryString(d);
        System.out.println();
        System.out.println("El resultado de la conversion es: "+valor);      
    }


}
