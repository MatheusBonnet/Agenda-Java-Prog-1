package com.matheus.agendajava.programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.matheus.agendajava.classes.Agenda;
import com.matheus.agendajava.classes.Contato;
import com.matheus.agendajava.classes.Pessoa;

public class Programa {
	
	public static void main(String args[]) {
		
	
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		Agenda agenda = new Agenda(listaPessoas);
		Scanner sc  = new Scanner(System.in);
		
		
		Integer opc = 0;
		do {
			
			opc = menu();
			
			switch (opc) {
			case 1:
				
				listaPessoas.forEach(x -> System.out.println(x.getNome()));
				
				break;
			case 2:
				
				
				
				break;
			case 3:
				Integer escolha = 0;
				
				System.out.println("Digite o nome do contato: ");
				String nome = sc.nextLine();
				
				System.out.println("Digite o sobrenome: ");
				String sobrenome = sc.nextLine();
				
				List<Contato> listaContatos = new ArrayList<>();
				
				Pessoa newPessoa = new Pessoa(nome, sobrenome, listaContatos);
				
				listaPessoas.add(newPessoa);
				
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
				
				break;
			case 4:
				
				
				break;
				
			case 5:
				
				
				break;
			default:
				System.out.println("Finalizando a aplicação...");
				System.exit(0);
				break;
			}
			
			
			
			
		}while(opc != 0);
		
		sc.close();
		
	
	}
	
	@SuppressWarnings("resource")
	public static Integer menu() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Agenda   ==========\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para listar contatos \n");
		sb.append("Digite 2 para editar um contato \n");
		sb.append("Digite 3 para inserir um contato \n");
		sb.append("Digite 4 para excluir um contato \n");
		sb.append("Digite 5 para ver um contato detalalhado \n");
		sb.append("Digite 0 para encerrar \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		if(opc == 0) {
			System.exit(0);
		}
		return opc;
	}

}
