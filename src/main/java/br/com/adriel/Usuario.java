package br.com.adriel;

public class Usuario extends Pessoa {
	private String login;
	private int totalViews;
	
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);	
		this.login = login;
		this.totalViews = 0;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotalViews() {
		return totalViews;
	}
	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}

	@Override
	public String toString() {
		return "Usuario{" + super.toString() + "\n[login=" + login + ", totalViews=" + totalViews + "]}";
	}
	
	
}
