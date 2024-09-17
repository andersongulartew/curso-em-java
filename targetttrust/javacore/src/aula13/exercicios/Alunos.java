package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Alunos {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Alice", 5),
                new Aluno("Bob", 6),
                new Aluno("Carol", 9),
                new Aluno("David", 7),
                new Aluno("Eva", 4)
        );


        List<String> nomes = alunos.stream()
                .filter(aluno -> aluno.getNota() >= 7)
                .map(Aluno::getNome)
                .collect(Collectors.toList());

        nomes.forEach(System.out::println);

    }
}
