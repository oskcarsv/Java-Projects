public class Principal{

	public static void main(String args[]){
		String usuario="admin"; //DATOS QUE EL USUARIO INGRESARA
		String clave="123467"; //DATOS QUE EL USUARIO INGRESARA
		String verificar="123456789"; //DATO PREDETERMINADO
		
		Errores error=new Errores();
		
		try{
			error.validarCredenciales(clave,verificar);
		}catch(ExcepcionPersonalizada ep){
			System.out.println(ep.getMessage());
		}finally{
			System.out.println("Tenga buen dia");
		}
		
	}

}