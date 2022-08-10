public class ControladorLogin{
	
	Usuario user=new Usuario();
	PantallaPrincipal pPrincipal;
	ControladorPersona cPersona;
	String usuario;
	String clave;
	int cont=0;
	
	public void verificador(String usuario,String clave) {
		
		pPrincipal=new PantallaPrincipal();
		cPersona=new ControladorPersona();
		usuario=user.getUsuario();		
		
		for(int i=0;i<usuario.length();i++){
			
			if (usuario.charAt(i)=='@'&&(usuario.equals(user.getUsuario()))&&(clave.equals(user.getClave()))){
				System.out.println(" ");		
				System.out.println("Usuario valido");
				System.out.println("*** Bienvenido a nuestro sistema ***");
				pPrincipal.ingresoPersonas();
			}else{
				cont++;
			}	
			
			if (cont==usuario.length()){
				System.out.println(" ");		
				System.out.println("Usuario o clave invalidos");
			}
			
		}

	}

}