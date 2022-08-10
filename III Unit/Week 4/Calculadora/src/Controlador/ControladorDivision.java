package Controlador;


public class ControladorDivision {
    public void division(int a, int b){
        int total=a/b;
        System.out.println("    ");               
        System.out.println("El resultado de la division es: "+total);       
    }

    public void division(double a, double b){
        double total=a/b;
        System.out.println("    ");                       
        System.out.println("El resultado de la division es: "+total);       
    }
    
    public void division(double a, int b){
        double total=a/b;
        System.out.println("    ");                       
        System.out.println("El resultado de la division es: "+total);       
    }
    
    public void division(int a, double b){
        double total=a/b;
        System.out.println("    ");                       
        System.out.println("El resultado de la division es: "+total);       
    }
  
}
