//clase hija
public class Estudiante extends Persona{
	int carnet;
	
	
	public Estudiante(String nombre,String apellido,int edad,int carnet){
		super(nombre,apellido,edad);
		this.carnet=carnet;
	}
	
	public void obtenerCarnet(int carnet){
		this.carnet=carnet;
	}
	
	public int retornarCarnet(){
		return carnet;
	}

}