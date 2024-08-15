package com.targettrust.loop.array;

public class ArrayMatriz {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2];
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[1][0] = 30;
        matriz[1][1] = 40;

        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.println("i : " +i+" j : " +j);
                System.out.println(matriz[i][j]);
            }
        }
    }
}
