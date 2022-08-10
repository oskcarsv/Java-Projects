package Vista;

import java.util.Scanner;
import Controlador.ControladorSuma;
import Controlador.ControladorResta;
import Controlador.ControladorMultiplicacion;
import Controlador.ControladorDivision;
import Controlador.ControladorBinario;
import Controlador.ControladorHexadecimal;
import Controlador.ControladorOctal;

public class MenuOperaciones {
    
    Scanner sc=new Scanner(System.in);
    ControladorSuma cSuma;
    ControladorResta cResta;
    ControladorMultiplicacion cMultiplicacion;
    ControladorDivision cDivision;
    ControladorBinario cBinario;
    ControladorHexadecimal cHex;
    ControladorOctal cOctal;
    MenuPrincipal mPrincipal;

    
    public void enteros(){
        cSuma=new ControladorSuma();
        cResta=new ControladorResta();
        cMultiplicacion=new ControladorMultiplicacion();
        cDivision=new ControladorDivision();
        cBinario=new ControladorBinario();
        cHex=new ControladorHexadecimal();
        cOctal=new ControladorOctal();
        mPrincipal=new MenuPrincipal();
        
        String pregunta = null;
        int opcion1;
        int a=0;
        int b=0;
        int c;
        
        System.out.println("    ");
        System.out.println("------------------------------------------------------");
        System.out.println("                ENTEROS");
        System.out.println("    ");
        System.out.println("        || MENU DE OPERACIONES ||       ");
        System.out.println("1.... Suma");
        System.out.println("2.... Resta");
        System.out.println("3.... Multiplicacion");
        System.out.println("4.... Division");
        System.out.println("5.... Convertir a Binario");
        System.out.println("6.... Convertir a Hexadecimal");
        System.out.println("7.... Convertir a Octal");
        System.out.println("8.... Regresar");
        System.out.println("9.... Salir");
        System.out.println("    ");
        System.out.println("Ingrese numero de opcion");
        opcion1=sc.nextInt();
        
        switch (opcion1){
            case 1:
                do{
                    System.out.println("    ");
                    System.out.println("**** SUMA ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el primer valor");
                    a=sc.nextInt();
                    System.out.println("    ");
                    System.out.println("Ingrese el segundo valor");
                    b=sc.nextInt();

                    cSuma.suma(a,b);                   

                    System.out.println("    ");
                    System.out.println("Desea sumar otros valores? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();   
            break;
            
            
            case 2:
                do{
                    System.out.println("    ");
                    System.out.println("**** RESTA ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el primer valor");
                    a=sc.nextInt();
                    System.out.println("    ");
                    System.out.println("Ingrese el segundo valor");
                    b=sc.nextInt();
 
                    cResta.resta(a,b);           
                    
                    System.out.println("    ");
                    System.out.println("Desea restar otros valores? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();
            break;
                
            
            case 3:
                do{
                    System.out.println("    ");
                    System.out.println("**** MULTIPLICACION ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el primer valor");
                    a=sc.nextInt();
                    System.out.println("    ");
                    System.out.println("Ingrese el segundo valor");
                    b=sc.nextInt();
                    
                    cMultiplicacion.multiplicacion(a, b);
                    
                    System.out.println("    ");
                    System.out.println("Desea multiplicar otros valores? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();                
            break;
                
            
            case 4:
                do{
                    do{
                        System.out.println("    ");
                        System.out.println("**** DIVISION ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el primer valor");
                        a=sc.nextInt();
                        System.out.println("    ");
                        System.out.println("Ingrese el segundo valor");
                        b=sc.nextInt();

                        if (b==0){
                            System.out.println("El segundo valor no puede ser 0, por favor ingrese un numero"
                            + " diferente de 0");
                          b=sc.nextInt();
                        }else{
                           cDivision.division(a, b);
                        }
                    }while(b!=0);

                    System.out.println("    ");
                    System.out.println("Desea dividir otros valores? (si / no)");
                    pregunta=sc.next();                    
                }while(pregunta.equals("si"));
                
                this.enteros();                
            break;
            
            
            case 5:
                do{
                    System.out.println("    ");
                    System.out.println("**** CONVERSION A BINARIO ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el valor que desea convertir a binario");
                    c=sc.nextInt();

                    cBinario.binario(c);
                    
                    System.out.println("    ");
                    System.out.println("Desea convertir otro valor? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();                
            break;

            
            case 6:
                do{
                    System.out.println("    ");
                    System.out.println("**** CONVERSION A HEXADECIMAL ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el valor que desea convertir a hexadecimal");
                    c=sc.nextInt();

                    cHex.hexa(c);
                    
                    System.out.println("    ");
                    System.out.println("Desea convertir otro valor? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();                
             break;
            
            
            case 7:
                do{
                    System.out.println("    ");
                    System.out.println("**** CONVERSION A OCTAL ****");
                    System.out.println("    ");
                    System.out.println("Ingrese el valor que desea convertir a octal");
                    c=sc.nextInt();

                    cOctal.octal(c);
                    
                    System.out.println("    ");
                    System.out.println("Desea convertir otro valor? (si / no)");
                    pregunta=sc.next();
                }while(pregunta.equals("si"));
                
                this.enteros();                
             break;
            
            
            case 8:
                System.out.println("    ");
                System.out.println("**** REGRESANDO AL MENU PRINCIPAL ****");
                System.out.println("    ");
                mPrincipal.inicio();
            break;
            
            
            case 9:
                System.out.println("    ");
                System.out.println("**** SALIR ****");
                System.out.println("    ");
                System.exit(0);
            break;

        }
    }
   
    public void decimales(){
            cSuma=new ControladorSuma();
            cResta=new ControladorResta();
            cMultiplicacion=new ControladorMultiplicacion();
            cDivision=new ControladorDivision();
            cBinario=new ControladorBinario();
            cHex=new ControladorHexadecimal();
            cOctal=new ControladorOctal();
            mPrincipal=new MenuPrincipal();

            String pregunta = null;
            int opcion2;
            int a=0;
            int b=0;
            int c;

            System.out.println("    ");
            System.out.println("------------------------------------------------------");
            System.out.println("                DECIMALES");
            System.out.println("    ");
            System.out.println("        || MENU DE OPERACIONES ||       ");
            System.out.println("1.... Suma");
            System.out.println("2.... Resta");
            System.out.println("3.... Multiplicacion");
            System.out.println("4.... Division");
            System.out.println("5.... Convertir a Binario");
            System.out.println("6.... Convertir a Hexadecimal");
            System.out.println("7.... Convertir a Octal");
            System.out.println("8.... Regresar");
            System.out.println("9.... Salir");
            System.out.println("    ");
            System.out.println("Ingrese numero de opcion");
            opcion2=sc.nextInt();

            switch (opcion2){
                case 1:
                    do{
                        System.out.println("    ");
                        System.out.println("**** SUMA ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el primer valor");
                        a=(int) sc.nextDouble();
                        System.out.println("    ");
                        System.out.println("Ingrese el segundo valor");
                        b=(int) sc.nextDouble();

                        cSuma.suma(a,b);                   

                        System.out.println("    ");
                        System.out.println("Desea sumar otros valores? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                break;


                case 2:
                    do{
                        System.out.println("    ");
                        System.out.println("**** RESTA ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el primer valor");
                        a=(int) sc.nextDouble();
                        System.out.println("    ");
                        System.out.println("Ingrese el segundo valor");
                        b=(int) sc.nextDouble();

                        cResta.resta(a,b);           

                        System.out.println("    ");
                        System.out.println("Desea restar otros valores? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                break;


                case 3:
                    do{
                        System.out.println("    ");
                        System.out.println("**** MULTIPLICACION ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el primer valor");
                        a=(int) sc.nextDouble();
                        System.out.println("    ");
                        System.out.println("Ingrese el segundo valor");
                        b=(int) sc.nextDouble();

                        cMultiplicacion.multiplicacion(a, b);

                        System.out.println("    ");
                        System.out.println("Desea multiplicar otros valores? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                break;


                case 4:
                    do{
                        do{
                            System.out.println("    ");
                            System.out.println("**** DIVISION ****");
                            System.out.println("    ");
                            System.out.println("Ingrese el primer valor");
                            a=(int) sc.nextDouble();
                            System.out.println("    ");
                            System.out.println("Ingrese el segundo valor");
                            b=(int) sc.nextDouble();

                            if (b==0){
                                System.out.println("El segundo valor no puede ser 0, por favor ingrese un numero"
                                + " diferente de 0");
                              b=sc.nextInt();
                            }else{
                               cDivision.division(a, b);
                            }
                        }while(b!=0);

                        System.out.println("    ");
                        System.out.println("Desea dividir otros valores? (si / no)");
                        pregunta=sc.next();                    
                    }while(pregunta.equals("si"));

                    this.decimales();   
                break;


                case 5:
                    do{
                        System.out.println("    ");
                        System.out.println("**** CONVERSION A BINARIO ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el valor que desea convertir a binario");
                        c=(int) sc.nextDouble();

                        cBinario.binario(c);

                        System.out.println("    ");
                        System.out.println("Desea convertir otro valor? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                break;


                case 6:
                    do{
                        System.out.println("    ");
                        System.out.println("**** CONVERSION A HEXADECIMAL ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el valor que desea convertir a hexadecimal");
                        c=(int) sc.nextDouble();

                        cHex.hexa(c);

                        System.out.println("    ");
                        System.out.println("Desea convertir otro valor? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                 break;


                case 7:
                    do{
                        System.out.println("    ");
                        System.out.println("**** CONVERSION A OCTAL ****");
                        System.out.println("    ");
                        System.out.println("Ingrese el valor que desea convertir a octal");
                        c=(int) sc.nextDouble();

                        cOctal.octal(c);

                        System.out.println("    ");
                        System.out.println("Desea convertir otro valor? (si / no)");
                        pregunta=sc.next();
                    }while(pregunta.equals("si"));

                    this.decimales();   
                 break;


                case 8:
                    System.out.println("    ");
                    System.out.println("**** REGRESANDO AL MENU PRINCIPAL ****");
                    System.out.println("    ");
                    mPrincipal.inicio();
                break;


                case 9:
                    System.out.println("    ");
                    System.out.println("**** SALIR ****");
                    System.out.println("    ");
                    System.exit(0);
                break;
        }
    }    
       
}