package com.targettrust.loop.array;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 2;
        num[1] = 5;
        num[2] = 7;
        num[3] = 8;
        num[4] = 10;

        int maior = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if ( num[i] > maior) {
                maior = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        System.out.println("O maior maior elemento é : " + maior);
        System.out.println("O maior menor elemento é : " + menor);

    }
}


