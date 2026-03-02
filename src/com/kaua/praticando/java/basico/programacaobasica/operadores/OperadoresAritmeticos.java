package com.kaua.praticando.java.basico.programacaobasica.operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Kaua ";
		String segundoNome = "Pereira";
		System.out.println(primeiroNome + segundoNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		// Primeiro imprimindo e depois adicionando o valor
		System.out.println(resultado++);
		// Primeiro adicionando o valor e depois imprimindo o valor
		System.out.println(++resultado);
		
		// Primeiro imprimindo e depois removendo o valor
		System.out.println(resultado--);
		// Primeiro removendo o valor e depois imprimindo o valor
		System.out.println(--resultado);
		
		
	}
}
