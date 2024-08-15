package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        //numeros.forEach(numero -> System.out.println(numero));

        Operacao soma = (a,b)-> a+b;
        System.out.println(soma.calcular(1,2));
    }
}
