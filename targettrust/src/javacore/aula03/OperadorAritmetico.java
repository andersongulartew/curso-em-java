package javacore.aula03;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int valor = 1;

        valor = valor + 2;
        System.out.println(valor);

        valor = 1;
        valor += 2;
        System.out.println(valor);

        valor = 1;
        valor ++;
        System.out.println(valor);

        valor = 5;
        valor --;
        System.out.println(valor);

        valor = 1;
        -- valor;
        System.out.println(valor);


    }
}
