package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroUsandoStreams {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,8,7,2,9);

        Optional<Integer> maior = num.stream().max(Integer::compareTo);
        maior.ifPresent(System.out::println);

    }
}
