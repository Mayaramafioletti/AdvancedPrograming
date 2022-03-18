package br.com.fiap.rh;

public abstract interface FuncionarioAutenticavel {
	
	public abstract boolean autenticar (String senha);
	
	public void setSenha(String senha);
	
}
