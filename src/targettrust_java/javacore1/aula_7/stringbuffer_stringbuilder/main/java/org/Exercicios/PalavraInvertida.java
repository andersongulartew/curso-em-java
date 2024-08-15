package org.Exercicios;

import java.util.Scanner;

public class PalavraInvertida {

    public static String inverterPalavra(String palavra) {
        StringBuilder str = new StringBuilder(palavra);
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Por favor digite uma palavra:");
        palavra = sc.nextLine();
        sc.close();
        String resultado = inverterPalavra(palavra);
        System.out.println("A palavra invertida fica : " + resultado);

    }


}
