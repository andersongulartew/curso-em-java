import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSortingPerson {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alice", 20),
            new Person("Bruna", 20),
            new Person("Ana", 20),
            new Person("Anne", 20),
            new Person("Tiago", 20)
        );

        List<Person>ordenarPessoas =people.stream()
                .sorted((p1,p2) -> p1.getNome().compareTo(p2.getNome()))
                .toList();

        List<Person>ordenarPessoas2 =people.stream()
                .sorted(Comparator.comparing(Person::getNome))
                .toList();

        System.out.println(ordenarPessoas);
        System.out.println("---------------------------------");
        System.out.println(ordenarPessoas2);
    }
}
