package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio4MaiorElemento {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Maior Elemento é :");
        numeros.add(54);
        numeros.add(36);
        numeros.add(76);
        numeros.add(90);
        numeros.add(10);
        numeros.add(63);

        Integer maiorElemento = numeros.stream().max(Integer::compare).get();
        Integer maiorElemento2 = Collections.max(numeros);
        System.out.println("O maiorelemento é : " + maiorElemento);
        System.out.println("O maiorelemento2 é : " + maiorElemento2);

    }
}
