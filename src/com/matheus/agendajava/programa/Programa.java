package com.matheus.agendajava.programa;

import java.util.ArrayList;
import java.util.List;

import com.matheus.agendajava.classes.Agenda;
import com.matheus.agendajava.classes.Contato;
import com.matheus.agendajava.classes.Pessoa;

public class Programa {
	
	public static void main(String args[]) {
	
		Contato contato1 = new Contato("matheus@gmail.com", "41", "984976664");
		Contato contato2 = new Contato("lucas@gmail.com", "11", "984567824");
		Contato contato3 = new Contato("luiz@gmail.com", "11", "984392345");
		
		List<Contato> contatoList1 = new ArrayList<Contato>();
		contatoList1.add(contato1);
		List<Contato> contatoList2 = new ArrayList<Contato>();
		contatoList2.add(contato2);
		List<Contato> contatoList3 = new ArrayList<Contato>();
		contatoList3.add(contato3);
		
		Pessoa pessoa1 = new Pessoa("Matheus", "Alves", contatoList1);
		Pessoa pessoa2 = new Pessoa("Lucas", "Silva", contatoList2);
		Pessoa pessoa3 = new Pessoa("Luiz", "Henrique", contatoList3);
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
	
		Agenda agenda = new Agenda(listaPessoas);
	
		System.out.println(agenda);
	
	}

}
