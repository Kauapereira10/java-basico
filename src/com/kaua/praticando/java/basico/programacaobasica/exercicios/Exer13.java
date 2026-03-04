package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = sc.next().toUpperCase(); // Converte para maiúsculo

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        if (sexo.equals("M")) {

            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

        } else if (sexo.equals("F")) {

            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

        } else {

            System.out.println("Sexo inválido. Digite apenas M ou F.");

        }

        sc.close();
    }
}