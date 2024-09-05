package aula08.wrapper;

import java.util.ArrayList;

public class Wrapper {
    // Colocando um primitivo dentro de um revestimento
    // Transformando um primitivo em um objeto
//    int valorPrimitivo = 42;
//    Integer objetoInteiro = Integer.valueOf(valorPrimitivo); // Wrapping


//    Integer objetoInteiro = 42;
//    int ValorPrimitivo1 = objetoInteiro;


    // Desembalar um primitivo do revestimento / invólucro
    // Tornar para um primitivo novamente
//    int desembulhar = objetoInteiro.intValue();// Unwrapping


    public static void main(String[] args) {
//        ArrayList<Integer> lista = new ArrayList<>();
//        lista.add(5);
//        int valor = lista.get(0);
//        System.out.println(valor);


         // == -> referência do objeto "na memória"
         // .equals -> compara os valores contidos neles
//        Integer a = 10;
//        Integer b = 10;
//        System.out.println(a==b);
//        System.out.println(a.equals(b));

//        Integer c = new Integer(10);
//        Integer d = 10;
//        System.out.println(c == d);
//        System.out.println(c.equals(d));

//        Integer valor2 = null;
//        System.out.println("valor é nulo");


//        //convertendo uma String em Integer
//        Integer numero = Integer.valueOf("42");
//
//        // convertendo um double em Double(objeto)
//        Double valorDouble = Double.valueOf(3.14);

//        int maxInt = Integer.MAX_VALUE;
//        System.out.println("máximo valor de int " + maxInt);


//        Integer x =5;
//        Integer y = 3;
//        Integer soma = x + y;
//        int resultado = soma;
//        System.out.println(soma);


//        // Classes Wrapper -> IMUTAVEIS
//        Integer as = 10;
//        Integer bs = as + 5; // cria um novo objeto integer, nao muda o "as"
//        System.out.println(as);// ainda será 10
//        System.out.println(bs);// será 15


        //primitivos
        double dx =10.3;
        float ax =10.30f;

        //wrapper
        Integer numero2 = 102;
        Long outroNumero =102l;
        Long outroNumero2 =102L;
        Long valor3 = Long.valueOf(102);




    }

}
