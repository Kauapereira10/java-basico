package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios2;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean senhaValida = false;
		
		do {
			System.out.println("Digite seu nome do usuário:");
			String nome = sc.next();
			
			System.out.println("Digite sua senha:");
			String senha = sc.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				senhaValida = false;
				System.out.println("Senha invalida, nao poder ser igual ao seu nome!");
			}else {
				senhaValida = true;
				System.out.println("Nome e senha correta.");
			}
		}while(!senhaValida);
		
		
		sc.close();
	}
}
