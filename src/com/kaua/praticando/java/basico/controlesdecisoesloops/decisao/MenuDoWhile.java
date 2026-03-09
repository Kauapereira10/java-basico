package com.kaua.praticando.java.basico.controlesdecisoesloops.decisao;

import java.util.Scanner;

public class MenuDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("1 - Ver perfil");
			System.out.println("2 - Editar perfil");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			
			opcao = sc.nextInt();
		}while(opcao != 0);
		
		System.out.println("Sistema encerrado.");
		
		sc.close();
	}
}
