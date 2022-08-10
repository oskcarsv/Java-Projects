public class ControladorLogin{
	
	Usuario user=new Usuario();
	PantallaPrincipal pPrincipal;
	ControladorProfesor cProfesor;
	int cont=0;
	
	public void verificador(String usuario,String clave) {
		
		Usuario[] user=new Usuario[2];
		Usuario[0]=new Usuario("administrador@kinal.com","admin");
		Usuario[1]=new Usuario("basico@kinal.com","bas");
		
		pPrincipal=new PantallaPrincipal();
		cProfesor=new ControladorProfesor();	
		
		for(int i=0;i<usuario.length();i++){
			
			if (usuario.charAt(i)=='@'&&(usuario.equals(user))&&(clave.equals(user))){
				System.out.println(" ");		
				System.out.println("Usuario valido");
				System.out.println("*** Bienvenido a nuestro sistema ***");
				pPrincipal.ingresoDatosProfesor();
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