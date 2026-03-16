package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salario:");
		double salarioAtual = sc.nextDouble();
		
		double percentual = 0;
		
		if(salarioAtual <= 280) {
			percentual = 20;
		} else if(salarioAtual < 700) {
			percentual = 15;
		} else if(salarioAtual < 1500) {
			percentual = 10;
		}else {
			percentual = 5;
		}
		
		double valorAumento = salarioAtual * (percentual / 100);
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("Nota Fiscal:");
		System.out.println("Salario Antes: " + salarioAtual);
		System.out.println("Percentual Aplicado: " + percentual);
		System.out.println("Novo salario com base o aumento: " + novoSalario);
		
		sc.close();
	}
}
