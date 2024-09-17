package colecoes;

import java.util.*;

public class List {
    public static void main(String[] args) {
        // List: aceita elementos duplicados

        // Criei uma LinkedList ou ArrayList ligada e populei
        java.util.List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("JavaScript");
        linguagens.add("C#");
        linguagens.add("PHP");
        linguagens.add("Scala");
//        for (String linguagem : linguagens) {
//            System.out.println(linguagens);
//        }


        // coloca em ordem
//        Set<String> lings = new TreeSet<>(linguagens);
//        System.out.println(lings);

        // usar o metodo contains(ver se é TRUE OU FALSE)
        System.out.println("Contains: " + linguagens.contains("PHP"));
        System.out.println("Contains: " + linguagens.contains("SSD"));

        // qual posição na lista tem java?, indexof(primeira ocorrencia)
        System.out.println("IndexOf: " + linguagens.indexOf("Java"));

        // qual posição na lista tem java?, indeof(ultima ocorrencia)
        System.out.println("LastIndexOf: " + linguagens.indexOf("Scala"));

        // Como remover "java " da lista - remove
        boolean removeuJava = linguagens.remove("Java");
        System.out.println("removeuJava: " + removeuJava);
        System.out.println(linguagens);

        // Inserindo itens na lista
//        linguagens.add(0, "Cobol");
//        linguagens.add(0, "Kotolin");
//        Set<String> lings2 = new TreeSet<>(linguagens);
//        System.out.println(lings2);

        System.out.println("_____-----____---____");

        // remove todos os elementos da lista
//        linguagens.clear();
//        for (String linguagem : linguagens) {
//            System.out.println(linguagens);
//        }

        System.out.println("__________________ITERATOR_____________");
        Iterator<String> iterator = linguagens.iterator();
        while (iterator.hasNext()) {
            String linguagem = iterator.next();

            if (linguagem.equals("Python")) {
                iterator.remove();
            }
            System.out.println(linguagem);
        }


    }

}
