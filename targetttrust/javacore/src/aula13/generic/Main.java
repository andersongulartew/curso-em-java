package generic;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        Caixa<String> c = new Caixa("TEXTO");
//        System.out.println(c.getConteudo());


        Par<String,String> b = new Par<>("10","anderson");
        System.out.println(b.getValue());
        System.out.println(b.getKey());


//        Number number = new Number();
//        Double soma = number.soma(List.of(1,2,3));
//        System.out.println(soma);
//
//        Double soma1 = number.soma(List.of("1","2","3"));
//        System.out.println(soma1);
    }
}
