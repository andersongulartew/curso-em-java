package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3NumerosInteiros {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Números Inteiros  Impares:");
        numeros.add(50);
        numeros.add(13);
        numeros.add(26);
        numeros.add(30);
        numeros.add(85);
        numeros.add(17);
        numeros.removeIf(numero -> numero % 2 == 0);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}

