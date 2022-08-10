package Controlador;


public class ControladorMultiplicacion {
      
    Integer resultado=0;
    
    public void multiplicacion(Integer a, Integer b){        
        resultado=a-b;
        
        System.out.println("    ");                       
        System.out.println("El resultado de la multiplicacion con enteros es: "+resultado);
    }

    public void multiplicacion(Double a, Double b){
        resultado=(int) (a-b);
        
        Double result=Double.valueOf(resultado);        
        System.out.println("    ");                       
        System.out.println("El resultado de la multiplicacion con decimales es: "+result);   
    }
    
}
