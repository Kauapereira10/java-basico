package com.kaua.praticando.java.basico.controlesdecisoesloops.decisao;

public class LoopForMaisDeUmaVariavel {
	public static void main(String[] args) {
		
		for (int i=0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; " + j);
		}
		
		// for com partes ausentes
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		System.out.println("-----------------");
		
		for (int cont = 0; cont < 10; cont +=2) {
			System.out.println("Valor de cont: " + cont);
		}
	}
}
