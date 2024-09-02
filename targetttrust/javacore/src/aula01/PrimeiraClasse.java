package aula01;


import com.sun.tools.javac.Main;

import static aula01.BemVindo.mostrarSaudacao;
import static aula01.Calculos.*;



public class PrimeiraClasse {
    public static void main(String[] args) {

        System.out.println("Olá Mundo !");

        // MODELO 1
        // Modelos feitos através da clase CALCULO (não static)
        Calculos result = new Calculos();
        System.out.println(result.soma1(5, 8));
        System.out.println(result.subtrair1(10, 6));

        System.out.println("-------------------------------");

        // MODELO 2
        // Método static chamado da classe CALCULOS(nao precisa estanciar)
        int somatorio = soma2(3, 8);
        System.out.println("A soma é : " + somatorio);
        int multi = multiplicar(8, 9);
        System.out.println("A multiplicação é : " + multi);

        System.out.println("-------------------------------");

        // MODELO 3
        // Para usar este modelo, deve-se criar (metodo static) e chamá-lo em outro (metodo static void)
        mostrarSaudacao();// método static chamado da classe BemVindo
        resultadoSubtrair2();// método static chamado da classe Cálculos
    }


}
