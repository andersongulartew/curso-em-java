package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Exercicio5DuasListas {
    public static void main(String[] args) {

        List<String> fruta = new ArrayList<>();
        fruta.add("Maça");
        fruta.add("Laranja");
        fruta.add("Pera");
        fruta.add("Melancia");
        fruta.add("Uva");

        List<String> verdura = new ArrayList<>();
        verdura.add("Couve-Flor");
        verdura.add("Cenoura");
        verdura.add("Alface");
        verdura.add("Brócolis");
        verdura.add("Beterraba");

      System.out.println("Frutas e Verduras : ");
        fruta.addAll(verdura);
        System.out.println(fruta);

/*
        for(String item :verdura){
            fruta.add(item);
        }
        System.out.println("Frutas e Verduras : " + fruta);
*/


/*        for(int i=0; i <verdura.size(); i++){
            fruta.add(verdura.get(i));
        }
        System.out.println("Frutas e Verduras " + fruta);*/

    }


}
