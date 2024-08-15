package com.targettrust.loop.whileDoWhile;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i = 0;
        double soma = 0;

        do {
            System.out.println("Digite um numero inteiro, ou zero para terminar: ");
            n = scanner.nextInt();
            if (n > 0) {
                soma += n;
                i++;
            }
        } while (n > 0);
        if(i > 0) {
            double media = soma / i;
            System.out.println("A media dos numeros é : " + media);
        }else {
            System.out.println("AValor Inválido");
        }
        scanner.close();
    }

}


