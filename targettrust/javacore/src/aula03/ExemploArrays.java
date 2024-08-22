package javacore.aula03;

import java.util.Arrays;

public class ExemploArrays {

    public static void main(String[] args) {
        // Forma 1
        System.out.println("Forma 1:");
        int[] numbers = new int[5];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("---------------------------");

        // Forma 2
        System.out.println("Forma 2:");
        int[] numbers2 = {1, 2, 3, 4, 5};
        numbers2[1] = 100; // inclui o valor na posição
        System.out.println(numbers2[1]);
        System.out.println("---------------------------");

        // Forma 3
        System.out.println("Forma 3:");
        Object[] numbers3 = {1, 2, 3, "4", 5.2};
        System.out.println("---------------------------");
        System.out.println("Resultados:");

        System.out.println(Arrays.toString(numbers));
        System.out.println("--");
        System.out.println(Arrays.toString(numbers2));
        System.out.println("--");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i] + ";");
        }


    }
}
