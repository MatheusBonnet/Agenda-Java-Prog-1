package com.matheus.agendajava.classes;

public class Contato {
	
	private String email;
	
	private String ddd;
	
	private String telefone;

	public Contato(String email, String ddd, String telefone) {
		super();
		this.email = email;
		this.ddd = ddd;
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return " email = "  + email + " ddd = " + ddd
				+ " telefone = " + telefone + "\n";
	}
	
	
	
}
