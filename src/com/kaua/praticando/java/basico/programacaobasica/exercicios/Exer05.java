package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("%.2f m equivalem a %.2f cm%n", metros, centimetros);

        sc.close();
    }
}