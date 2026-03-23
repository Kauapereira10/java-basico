package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

import jdk.jfr.Percentage;

public class Exer12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora:");
		double valorHora = sc.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mes:");
		double qtdHoras = sc.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentual = 0;
		
		if (salarioBruto <= 900) {
			percentual = 0; 
		} else if (salarioBruto <= 1500) {
			percentual = 5; 
		} else if (salarioBruto <= 2500) {
			percentual = 10;
		}else {
			percentual = 20;
		}
		
		double ir = (salarioBruto / 100) * percentual;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto " + salarioBruto);
		System.out.println("INSS " + inss);
		System.out.println("FGTS " + fgts);
		System.out.println("Total de Descontos " + totalDescontos);
		System.out.println("Salario Liquido " + salarioLiquido);
		sc.close();
	}
}
