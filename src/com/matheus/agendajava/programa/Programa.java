package com.matheus.agendajava.programa;

import java.util.Scanner;

import com.matheus.agendajava.classes.Agenda;

public class Programa {
	
	public static void main(String args[]) {
		
		Agenda agenda = new Agenda();
		Scanner sc  = new Scanner(System.in);
		Integer opc = 0;
		
		do {
			
			opc = menu();
			
			switch (opc) {
			case 1:
				
				agenda.mostraNome();
				
				break;
			case 2:
				
				agenda.edita(sc);
				
				break;
			case 3:
				
				agenda.inserirContato(sc);
				
				break;
			case 4:
				
				agenda.exclui(sc);
				
				break;
				
			case 5:

				agenda.mostraDetalhado(sc);
				
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
		sb.append("=========================================\n");
		sb.append("================  Agenda  ===============\n");
		sb.append("=========================================\n");
		sb.append("Digite 1 para listar contatos ===========\n");
		sb.append("Digite 2 para editar um contato =========\n");
		sb.append("Digite 3 para inserir um contato ========\n");
		sb.append("Digite 4 para excluir um contato ========\n");
		sb.append("Digite 5 para ver um contato detalalhado \n");
		sb.append("Digite 0 para encerrar ==================\n");
		sb.append("=========================================\n");
		sb.append("===============  Agenda  ================\n");
		sb.append("=========================================\n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		if(opc == 0) {
			System.exit(0);
		}
		return opc;
	}

}
