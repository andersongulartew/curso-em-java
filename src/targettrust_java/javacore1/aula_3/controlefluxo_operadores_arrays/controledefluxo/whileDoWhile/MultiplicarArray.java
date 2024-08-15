package com.targettrust.loop.whileDoWhile;

public class MultiplicarArray {
    public static void main(String[] args) {
        int[] id = {1, 2, 3, 4};

        int i = 0;
        while (i < id.length) {
            id[i] *= 2;
            System.out.println("Array Com Valores Atualizados:" + id[i]);
            i++;
        }



    }

}

