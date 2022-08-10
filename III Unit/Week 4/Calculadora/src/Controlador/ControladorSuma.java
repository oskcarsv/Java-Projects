package Controlador;


public class ControladorSuma {
      
    Integer resultado=0;
    
    public void suma(Integer a, Integer b){        
        resultado=a+b;
        
        System.out.println("    ");                       
        System.out.println("El resultado de la suma con enteros es: "+resultado);
    }

    public void suma(Double a, Double b){
        resultado=(int) (a+b);
        
        Double result=Double.valueOf(resultado);        
        System.out.println("    ");                       
        System.out.println("El resultado de la suma con decimales es: "+result);   
    }
    
}
