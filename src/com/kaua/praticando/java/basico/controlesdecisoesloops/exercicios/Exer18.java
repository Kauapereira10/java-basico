package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me informa o dia do mes:");
		int dia = sc.nextInt();
		
		System.out.println("Me informa o mes:");
		int mes = sc.nextInt();
		
		System.out.println("Me informa o ano:");
		int ano = sc.nextInt();
		
		boolean dataValida = false;

		if (mes >= 1 && mes <= 12) {
		    if (mes == 2) {
		        // Lógica para Fevereiro
		        int limiteFevereiro = 28;
		        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
		            limiteFevereiro = 29;
		        }
		        if (dia >= 1 && dia <= limiteFevereiro) {
		            dataValida = true;
		        }
		    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		        // Meses de 30 dias
		        if (dia >= 1 && dia <= 30) {
		            dataValida = true;
		        }
		    } else {
		        // Meses de 31 dias
		        if (dia >= 1 && dia <= 31) {
		            dataValida = true;
		        }
		    }
		}

		// Resposta final única
		if (dataValida) {
		    System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
		} else {
		    System.out.println("Data inválida!");
		}
		
		sc.close();
	}
}
