package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 2 números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Digite 1 número real: ");
        double numReal = sc.nextDouble();

        double resultado1 = (num1 * 2) * (num2 / 2.0);
        double resultado2 = (num1 * 3) + numReal;
        double resultado3 = Math.pow(numReal, 3);

        System.out.println("Resultado 1 = " + resultado1);
        System.out.println("Resultado 2 = " + resultado2);
        System.out.println("Resultado 3 = " + resultado3);

        sc.close();
    }
}