package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);

        sc.close();
    }
}