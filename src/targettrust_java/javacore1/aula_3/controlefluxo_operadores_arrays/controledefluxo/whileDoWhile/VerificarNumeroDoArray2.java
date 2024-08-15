package com.targettrust.loop.whileDoWhile;

import java.util.Scanner;

public class VerificarNumeroDoArray2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);


        int[] numero = {5, 9, 4, 6, 7, 10, 25, 55, 60};
//        System.out.println("Digite um número para conferir se esta no array...");
//       int num = sc.nextInt();

        int num = 60;
        int i = 0;
        boolean verificar = false;
        do {
            if (numero[i] == num) {
                verificar = true;
                break;
            }
            i++;
        } while (i < numero.length);
        if (verificar) {
            System.out.println("o numero " + num + " esta no array.");
        } else {
            System.out.println("o numero " + num + " não está no array.");
        }
//        sc.close();
    }
}
