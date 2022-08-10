import java.util.ArrayList;
public class ControladorProfesor{
	// CRUD Create Report Update Delete
	ArrayList<Profesor> arregloProfe=new ArrayList<>();

	public void ingresoArregloProfesor(String nombre,String apellido,int edad){
		arregloProfe.add(new Profesor(nombre,apellido,edad));
	}


	public void reporteProfesor(){
		for(Profesor p:arregloProfe){
			System.out.println(p.getNombre()+" "+p.getApellido());
		}
	}
	
	public void eliminarProfesor(){
		
	}
}