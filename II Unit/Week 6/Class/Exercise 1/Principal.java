public class Principal{
		public static void main(String args[]){
			String nombre;
			String apellido;
			int edad;
			
			Persona persona1=new Persona("David","Lopez",20);
			Persona persona2=new Persona("Karla","Suarez",14);
			Persona persona3=new Persona("Jose","Davila",18);
			
			nombre=persona1.retornarNombre();
			apellido=persona1.retornarApellido();
			edad=persona1.retornarEdad();
			
			if(edad>=18){
				System.out.println("El nombre completo de la persona 1 es: "+nombre+" "+apellido+" y es mayor de edad");
			}else{
				System.out.println("El nombre completo de la persona 1 es: "+nombre+" "+apellido+" y es menor de edad");
			}
			
			
			
			nombre=persona2.retornarNombre();
			apellido=persona2.retornarApellido();
			edad=persona2.retornarEdad();
			
			if(edad>=18){
				System.out.println("El nombre completo de la persona 2 es: "+nombre+" "+apellido+" y es mayor de edad");
			}else{
				System.out.println("El nombre completo de la persona 2 es: "+nombre+" "+apellido+" y es menor de edad");
			}
			
		
			nombre=persona3.retornarNombre();
			apellido=persona3.retornarApellido();
			edad=persona3.retornarEdad();
			
			if(edad>=18){
				System.out.println("El nombre completo de la persona 3 es: "+nombre+" "+apellido+" y es mayor de edad");
			}else{
				System.out.println("El nombre completo de la persona 3 es: "+nombre+" "+apellido+" y es menor de edad");
			}
			
		
		}
	
	
}