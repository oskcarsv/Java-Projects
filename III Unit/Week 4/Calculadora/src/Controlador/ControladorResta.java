package Controlador;


public class ControladorResta {
      
    Integer resultado=0;
    
    public void resta(Integer a, Integer b){        
        resultado=a-b;
        
        System.out.println("    ");                       
        System.out.println("El resultado de la resta con enteros es: "+resultado);
    }

    public void resta(Double a, Double b){
        resultado=(int) (a-b);
        
        Double result=Double.valueOf(resultado);        
        System.out.println("    ");                       
        System.out.println("El resultado de la resta con decimales es: "+result);   
    }
    
}
