package com.targettrust.loop.array;

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};

        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }
        System.out.println(soma);


//        Scanner sc = new Scanner(System.in);
//        int[] num = new int[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Digite a nota " + (i + 1) + ": ");
//            num[i] = sc.nextInt();
//        }
//        int soma = 0;
//        for (int i = 0; i < 3; i++) {
//            soma += num[i];
//        }
//        System.out.println("A soma é:" + soma);
//        sc.close();

    }
}

