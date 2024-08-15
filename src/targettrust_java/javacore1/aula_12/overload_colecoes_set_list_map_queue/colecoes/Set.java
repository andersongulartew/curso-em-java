package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        // Set - não aceita elementos duplicados

        // HashSet - nao garante ordenação
        listaUsandoHashSet();

        // LinkedHashset - mantém ordem de inserção
        listaUsandoLinkedHashSet();

        //TreeSet - ordena automaticamente os elementos de acordo com seu valor
        listaUsandoTreeSet();


    }

    private static void listaUsandoHashSet() {
        System.out.println("Frutas");

        java.util.Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Melão");
        frutas.add("Morango");
        frutas.add("Pepe");
        frutas.add("Uva");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("----------____________-------- :)");
    }

    private static void listaUsandoLinkedHashSet() {
        System.out.println("Pessoas");

        java.util.Set<String> pessoas = new HashSet<>();
        pessoas.add("Marcos");
        pessoas.add("Pedro");
        pessoas.add("Ana");
        pessoas.add("Joao");
        pessoas.add("André");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("----------____________-------- :)");
    }

    public static void listaUsandoTreeSet() {
        System.out.println("FABRICANTES");
        java.util.Set<String> fabricantes = new TreeSet<>();
        fabricantes.add("Ford");
        fabricantes.add("Chevrolet");
        fabricantes.add("Volkswagen");
        fabricantes.add("Toyota");
        fabricantes.add("Honda");
        for (String fabricante : fabricantes) {
            System.out.println(fabricante);
        }

        java.util.Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(50);
        numeros.add(10);
        numeros.add(20);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }


}


