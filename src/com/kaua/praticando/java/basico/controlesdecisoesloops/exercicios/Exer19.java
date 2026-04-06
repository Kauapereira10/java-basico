package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero menor 1000.");
		int valor = sc.nextInt();
		
		int centenas, dezenas, unidades;
		
		centenas = valor / 100;
		dezenas = (valor % 100) / 10;
		unidades = valor % 10;
		
		String sCentena = "";
		if(centenas > 0) {
			if(centenas == 1) {
				sCentena = "1 centena";
			}else {
				sCentena = centenas + " centenas";
			}
		}
		
		String sDezenas = "";
		if(dezenas > 0) {
			if(dezenas == 1) {
				sDezenas = "1 dezena";
			}else {
				sDezenas = dezenas + " dezenas";
			}
		}
		
		String sUnidades = "";
		if(unidades > 0) {
			if(unidades == 1) {
				sUnidades = "1 unidade";
			}else {
				sUnidades = unidades + " unidades";
			}
		
		}
		
		
		sc.close();
	}
}
