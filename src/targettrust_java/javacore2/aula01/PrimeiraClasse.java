package aula01;


import com.sun.tools.javac.Main;

public class PrimeiraClasse {
    public static void main(String[] args) {

        System.out.println("Olá Mundo !");

        // Modelos feitos através da clase CALCULO (não static)
        Calculos result = new Calculos();
        result.soma(5, 8);
        result.subtrair(10, 6);


        // Modelo usado atraves de um método static (metodo static só aceita static)
        int subtracao = subtrair(6, 3);
        System.out.println("A subtração é: " + subtracao);
        int somatorio = soma(3,8);
        System.out.println("A soma é : " + somatorio);

    }

    public static int subtrair(int a, int b) {
        return a - b;
    }
          public static int soma(int a, int b) {
        return a + b;
    }


}
