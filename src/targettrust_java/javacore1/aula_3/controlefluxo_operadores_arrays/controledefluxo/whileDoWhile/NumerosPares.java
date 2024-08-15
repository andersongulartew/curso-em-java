package com.targettrust.loop.whileDoWhile;

public class NumerosPares {
    public static void main(String[] args) {

        int numeros = 0;
        while (numeros <= 50) {
            if (numeros % 2 == 0) {
                System.out.println(numeros);
            }
            numeros++;
        }
    }
}
