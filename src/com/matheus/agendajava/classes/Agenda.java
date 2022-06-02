package com.matheus.agendajava.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private List<Pessoa> contatos = new ArrayList<Pessoa>();

	public Agenda() {
		
	}

	public List<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(List<Pessoa> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Agenda" + contatos + "\n";
	}

	public void mostraNome() {
		contatos.forEach(x -> System.out.println(x.getNome()));
	}

	public void edita(Scanner sc) {

		System.out.println("Digite o nome do contato para editar: ");
		String nomeEditar = sc.nextLine();

		for (int i = 0; i < contatos.size(); i++) {
			Pessoa pessoa = contatos.get(i);
			if (pessoa.getNome().contains(nomeEditar)) {

				System.out.println("Oque vc quer alterar: Nome-1 Sobrenome-2 Email-3 Contato-4");
				Integer novo = sc.nextInt();
				sc.nextLine();

				if (novo == 1) {
					System.out.println("Digite o novo nome: ");
					String nomeNovo = sc.nextLine();
					pessoa.setNome(nomeNovo);
					System.out.println("Nome alterado para: " + nomeNovo);

				}
				if (novo == 2) {

					System.out.println("Digite o novo sobrenome: ");
					String sobrenomeNovo = sc.nextLine();
					pessoa.setSobrenome(sobrenomeNovo);
					System.out.println("Sobrenome alterado para: " + sobrenomeNovo);
				}
				if (novo == 3) {

					System.out.println("Digite o novo email: ");
					String novoEmail = sc.nextLine();
					pessoa.getContato().forEach(x -> x.setEmail(novoEmail));
					System.out.println("Email alterado para: " + novoEmail);
				}
				if (novo == 4) {

					System.out.println("Digite o novo ddd: ");
					String novoDDD = sc.nextLine();
					pessoa.getContato().forEach(x -> x.setDdd(novoDDD));

					System.out.println("Digite o novo numero: ");
					String novoTel = sc.nextLine();
					pessoa.getContato().forEach(x -> x.setTelefone(novoTel));

					System.out.println("DDD alterado para " + novoDDD + " Telefone para " + novoTel);
				}
			}
		}
	}

	public void mostraDetalhado(Scanner sc) {

		System.out.println("Digite o nome do contato para ver detalhado: ");
		String nomeDetalhado = sc.nextLine();

		for (int i = 0; i < contatos.size(); i++) {
			Pessoa pessoa = contatos.get(i);
			if (pessoa.getNome().contains(nomeDetalhado)) {
				System.out.println(pessoa);
			} else {
				System.err.println("Nao existe ninguem com esse nome!!!!");
			}
		}
	}

	public void exclui(Scanner sc) {

		System.out.println("Digite o nome do contato para ver detalhado: ");
		String nomeDetalhado = sc.nextLine();

		for (int i = 0; i < contatos.size(); i++) {
			Pessoa pessoa = contatos.get(i);
			if (pessoa.getNome().contains(nomeDetalhado)) {
				contatos.remove(pessoa);
			} else {
				System.err.println("Nao existe ninguem com esse nome!!!!");
			}
		}
	}
	
	public void inserirContato(Scanner sc) {
		
		Integer escolha = 0;
		
		System.out.println("Digite o nome do contato: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = sc.nextLine();
		
		List<Contato> listaContatos = new ArrayList<>();
		
		Pessoa newPessoa = new Pessoa(nome, sobrenome, listaContatos);
		
		contatos.add(newPessoa);
		
		do {
			System.out.println("Digite um email se tiver: ");
			String email = sc.nextLine();
			
			System.out.println("Digite o DDD: ");
			String ddd = sc.nextLine();
			
			System.out.println("Digite o numero: ");
			String contato = sc.nextLine();
			
			Contato newContato = new Contato(email,ddd,contato);
			
			listaContatos.add(newContato);
			
			System.out.println("Deseja adicionar mais contatos a essa pessoa? 1-SIM 0-NAO ");
			escolha = sc.nextInt();
			sc.nextLine();
			
		} while (escolha == 1);
		System.out.println("Adicionado com sucesso");
		
	}

}
