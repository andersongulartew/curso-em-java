package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    // Declaração de um array
    public static void main(String[] args) {
//        int[] numeros = new int[5];
//        numeros[0] = 100;
//        numeros[1] = 200;
//        numeros[2] = 300;
//        numeros[3] = 400;
//        numeros[4] = 500;
//        System.out.println(numeros[0]); // exibira a posição 0


        // Declaração de array
//        int[] numeros2 = {1,2,3,4,5};
//        int tamanho = numeros2.length;
//
//        int [] [] matriz;   // array multidimensional
//
//        System.out.println(numeros2);
//        System.out.println(tamanho);
//        System.out.println(Arrays.toString(numeros2));


        // Declaração de um array
        int [] anos;
        anos = new int[3];
        anos[0] = 2020;
        anos[1] = 2021;

        System.out.println(anos.length);
        System.out.println(anos[0]);
        System.out.println(anos[1]);

        anos [1] = 1987; // trocou o valor da posicao
        System.out.println(anos[0]);
        System.out.println(anos[1]);

        anos [2] = 1996; // adicionou um elemento
        System.out.println(Arrays.toString(anos));


    }
}
