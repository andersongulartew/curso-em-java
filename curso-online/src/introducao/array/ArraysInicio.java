package src.introducao.array;

public class ArraysInicio {
    public static void main(String[] args) {
        // int idades[]; - não é o recomendado mas é possível nesta ordem.

        /*
        int[] numeros = new int[5]; // primeira opção
        int[] numeros2 = {1, 2, 3, 4, 5}; // segunda opção
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // terceira opção
         */


        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;

        System.out.println("idade 1: " + idades[0]);
        System.out.println("idade 2: " + idades[1]);
        System.out.println("idade 3: " + idades[2]);

    }
}
