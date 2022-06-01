package com.matheus.agendajava.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.matheus.agendajava.classes.Agenda;
import com.matheus.agendajava.classes.Pessoa;

public class Programa {
	
	public static void main(String args[]) {
		
	
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		Agenda agendaNova = new Agenda(listaPessoas);
		Scanner sc  = new Scanner(System.in);
		
		
		Integer opc = 0;
		do {
			
			opc = menu();
			
			switch (opc) {
			case 1:
				
				agendaNova.mostraNome(agendaNova);
				
				break;
			case 2:
				
				agendaNova.edita(listaPessoas, sc);
				
				break;
			case 3:
				
				agendaNova.inserirContato(listaPessoas, sc);
				
				break;
			case 4:
				
				agendaNova.exclui(listaPessoas, sc);
				
				
				break;
				
			case 5:

				agendaNova.mostraDetalhado(listaPessoas, sc);
				
				
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
