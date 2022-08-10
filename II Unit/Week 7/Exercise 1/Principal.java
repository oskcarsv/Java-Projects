public class Principal {

	public static void main(String args[]) {
		Persona[] arregloPersona=new Persona[5];
		String nombre;
		String apellido;
		int edad;
		
		arregloPersona[0]=new Persona("Adrian","Sagastume",34);
		arregloPersona[1]=new Persona("Marco","Diaz",17);
		arregloPersona[2]=new Persona("Urial","Telgram",15);
		arregloPersona[3]=new Persona("Francisco","Paez",45);
		arregloPersona[4]=new Persona("Pedro","Velasquez",17);
		
				
		for(int x=0;x<arregloPersona.length;x++){
			
			nombre=arregloPersona[x].getNombre();
			apellido=arregloPersona[x].getApellido();
			edad=arregloPersona[x].getEdad();

			System.out.println(nombre+" "+apellido+" "+edad);
		}
		
	}

}