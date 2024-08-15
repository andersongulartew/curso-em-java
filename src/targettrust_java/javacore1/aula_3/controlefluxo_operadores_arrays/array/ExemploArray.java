package com.targettrust.array;

public class ExemploArray {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 2;
        num[1] = 25;
        num[2] = 35;

        int valor =retornaPrimeiraPosicao(num);
        System.out.println(valor);
    }
    static int retornaPrimeiraPosicao(int[] num){
        if(num[0] == 0){
            return -1;
        }else{
            return num[0];
        }
    }

}
