package br.edu.infnet.model.domain;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {

		
		return String.format("O aluno %s, com email: [%s] ",
		
				nome,
				email,
				senha);
	}
	
	
	public void impressao() {
		
    	System.out.println(this);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
