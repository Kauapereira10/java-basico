package com.kaua.praticando.java.basico.controlesdecisoesloops.decisao;

public class While {
	public static void main(String[] args) {
		
		int i = 1; // count 
		int max = 10;
		
		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // mesma coisa de i + i + 1; ou i += 1;
		}
		
		System.out.println("O valor de i: " + i);
	}
}
