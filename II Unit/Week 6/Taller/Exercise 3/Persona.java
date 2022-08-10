public class Persona{
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;	
	}
	
	
	public String retornarNombre(){
		return nombre;
	}
	
	public String retornarApellido(){
		return apellido;
	}
	
	public int retornarEdad(){
		return edad;
	}


	public void obtenerNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void obtenerApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void obtenerEdad(int edad){
		this.edad=edad;
	}
}