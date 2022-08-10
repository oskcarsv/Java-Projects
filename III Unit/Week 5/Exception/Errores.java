public class Errores{

	public void validarCredenciales(String clave,String verificar) throws ExcepcionPersonalizada{
		
		if(!clave.equals(verificar)){
			throw new ExcepcionPersonalizada("Los valores no coinciden");
		}
		
		if(clave.length()<8){
			throw new ExcepcionPersonalizada("longitud incorrecta");
		}	
		
	}

}