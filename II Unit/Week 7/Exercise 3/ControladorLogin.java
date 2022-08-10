public class ControladorLogin{
	
	Usuario user=new Usuario();
	PantallaPrincipal pPrincipal;
	public void verificador(String usuario,String clave) {
		
		pPrincipal=new PantallaPrincipal();
		
			if((usuario.equals(user.getUsuario()))&& clave.equals(user.getClave())){
				System.out.println("      ");
				System.out.println("*** Bienvenido a nuestro sistema ***");
				pPrincipal.ingresoPersonas();
				pPrincipal.busquedaPersona();
				pPrincipal.cambioPersona();
			}else{
				System.out.println("Error de datos");
			}
	
	}

}