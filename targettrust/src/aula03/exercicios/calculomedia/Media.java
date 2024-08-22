package javacore.aula03.exercicios.calculomedia;

import java.util.Scanner;

public class Media {

    static double calcularMedia(double nota1, double nota2) {
        double media =(nota1 + nota2) / 2;

        if(media <= 0){
            mostrarMensagem(media);
        }
        return media;
    }

    private static void mostrarMensagem(double nota){
        if(nota >=7){
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }
    }

    public static void main(String[] args) {
        double media = calcularMedia(7,10);
        System.out.println("A média é: " + media);

//        boolean expressao = false;
//        boolean calcularMedia = !expresso;
//        System.out.println(calcularMedia);
    }
}

