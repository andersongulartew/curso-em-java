package aula06.main.java.org.targettrust;

import java.util.Scanner;

public class IMC {

    public String calcularIMC(double peso, double altura) {

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 39.9) {
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }


    }


}


