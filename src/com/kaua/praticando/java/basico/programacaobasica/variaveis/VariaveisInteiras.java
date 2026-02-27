package com.kaua.praticando.java.basico.programacaobasica.variaveis;

public class VariaveisInteiras {

    public static void main(String[] args) {

        /*
         * TIPOS INTEIROS EM JAVA
         * byte  -> 8 bits
         * short -> 16 bits
         * int   -> 32 bits (mais usado)
         * long  -> 64 bits
         */

        byte idadeByte = 20;
        short idadeShort = 21;
        int idadeInt = 22;
        long idadeLong = 23L; // recomendado usar L no final

        System.out.println("Byte  : " + idadeByte);
        System.out.println("Short : " + idadeShort);
        System.out.println("Int   : " + idadeInt);
        System.out.println("Long  : " + idadeLong);
    }
}