package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> nome1 = Arrays.asList("Alice", "bruno", "bob");

/*    // operacao intermediaria
    java.util.stream.Stream<String> stream = nome.stream()
            .filter(nome -> nome1.length() > 5 );*/

        // operacao terminal
//        nome1.stream().forEach(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(nome1);


        // encadear operacoes de Stream
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> quadradoPares = numeros.stream().filter(n -> n % 2 = 0).map(n -> n * n).collect(Collectors.toList());
//        System.out.println(quadradoPares);


        List<String> nome2 = Arrays.asList("Alice", "Bruno", "bob");
        List<String> nomesComA = nome2.stream().filter(nome -> nome.startsWith("A")).collect(Collectors.toList());
        System.out.println(nomesComA);

//        List<Integer> numeros2 = Arrays.asList(
//                Arrays.asList(1,2,3),
//                Arrays.asList(4,5,6),
//                Arrays.asList(7,8,9),
//        );


//        List<Integer> todosNumeros2 = numeros2.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(numeros2);
//        System.out.println(todosNumeros2);


        List<Integer> numbers = Arrays.asList(1,2,3,4);
                int soma = numbers.stream()
        .reduce(10,(a,b)->a+b);
        System.out.println(soma);

    }

}
