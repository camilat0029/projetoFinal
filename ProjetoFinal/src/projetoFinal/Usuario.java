package projetoFinal;

public class Usuario {
	
	private String usuario;
	private String senha;
	private String identif;
	
	public Usuario(String usuario, String senha, String identif) {
		this.usuario = usuario;
		this.senha = senha;
		this.identif = identif;
	}
	
	public String getUsuario(){
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getIdentificacao() {
		return identif;
	}

}
