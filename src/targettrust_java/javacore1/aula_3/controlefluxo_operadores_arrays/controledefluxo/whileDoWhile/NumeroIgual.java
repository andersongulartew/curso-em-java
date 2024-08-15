package com.targettrust.loop.whileDoWhile;

import java.util.Scanner;

public class NumeroIgual {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("Digite um numero entre 1 e 10 : ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);
            System.out.print("Digitou o numero : " + numero);
        sc.close();
    }
}
