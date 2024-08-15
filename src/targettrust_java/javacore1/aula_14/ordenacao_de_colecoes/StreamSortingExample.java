import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
public class StreamSortingExample {
    public static void main(String[] args) {
        List<Integer> numers = List.of(3,1,4,1,5,9);

        // usando Stream
        List<Integer> listaOrdenada = (List<Integer>) numers.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(listaOrdenada);

        System.out.println("---------------------------");

         List<Integer> listaReversa= (List<Integer>) numers.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(listaReversa);




    }
}
