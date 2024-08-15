package exercicios;

import java.util.*;

public class Exercicio1Pessoas {
    public static void main(String[] args) {

        List<String> pessoas = new ArrayList<>();
        pessoas.add("Anderson");
        pessoas.add("Gabriel");
        pessoas.add("Eduarda");
        pessoas.add("Felipe");
        pessoas.add("BARONY");
        pessoas.add("Gabriela");
        pessoas.add("Mario");
        pessoas.add("José");
        pessoas.add("Isac");
        pessoas.add("Maria Isabel");
/*        System.out.println("PESSOA: ");
        for (String listaNomes : pessoas) {
            System.out.println(listaNomes);
        }
        System.out.println("\t");*/

        System.out.println("========================================  \n ");
        System.out.println("   MODELO_1_oficial   ");
        Set<String> primeiros = new LinkedHashSet<>(pessoas.subList(0, 5));
        System.out.println("Cinco Primeiros Nomes: ");
        System.out.println(primeiros);
        System.out.println("\n");

/*        System.out.println("========================================  \n ");
        System.out.println("   MODELO_2   ");
        System.out.println(pessoas.stream().distinct().limit(5).toList());
        System.out.println("\n");*/

/*        System.out.println("======================================== \n ");
        System.out.println("   MODELO_3   ");
        List<String> list = pessoas.subList(0, 5).stream().distinct().toList();
        System.out.println(list);*/



    }
}
