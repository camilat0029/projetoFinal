package projetoFinal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuario {
	
	private String usuario;
	private String senha;
	
	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario(){
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}

}
