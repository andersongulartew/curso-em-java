package aula01;

public class Calculos {

    // Estanciados
    public int soma1(int a, int b) {
        return a + b;
    }

    public int subtrair1(int a, int b) {
        return a - b;
    }

        // Não estanciados por serem static
    public static int multiplicar(int a, int b) {
        return a * b;
    }


    public static int soma2(int a, int b) {
        return a + b;
    }

    public static int subtrair2() {
        return 15 - 6;
    }
    public static void resultadoSubtrair2() {
        int sub = subtrair2();
        System.out.println(sub);
    }








}
