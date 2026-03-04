package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        double dobroArea = area * 2;

        System.out.println("Área do quadrado: " + area);
        System.out.println("Dobro da área: " + dobroArea);

        sc.close();
    }
}