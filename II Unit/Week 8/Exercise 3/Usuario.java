public class Usuario{
	
	String usuario;
	String clave;
	
	public Usuario() {
		usuario="oscar@kinal.org.gt";
		clave="1234";
	}


	public String getUsuario() {
		return usuario;
	}
	public String getClave() {
		return clave;
	}
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
	public void setClave(String clave) {
		this.clave=clave;
	}

}