public class Usuario{
	
	String usuario;
	String clave;
	
	public Usuario(){
		
	}
	
	public Usuario(String usuario, String clave) {
		this.usuario=usuario;
		this.clave=clave;
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