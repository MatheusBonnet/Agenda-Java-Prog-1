package com.matheus.agendajava.classes;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Pessoa> contatos = new ArrayList<Pessoa>();
	
	public Agenda(List<Pessoa> contatos) {
		this.contatos = contatos;
	}

	public List<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(List<Pessoa> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Agenda [contatos=" + contatos + "]";
	}
	
	
	
}
