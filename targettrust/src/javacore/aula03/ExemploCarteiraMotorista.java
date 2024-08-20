package javacore.aula03;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Objects;
import java.util.Scanner;

public class ExemploCarteiraMotorista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        int idade = entrada.nextInt();
        System.out.println("Possui CNH ?");
        Boolean possuiCNH = entrada.nextBoolean();
        System.out.println("Você esta bebado ?");
        Boolean bebado = entrada.nextBoolean();

    // && = os dois devem ser IGUAIS(condição do parâmetro), senão é FALSE
        if (idade >= 18 && possuiCNH == true) {
            System.out.println("Você pode dirigir");
        } else {
            System.out.println("Você não pode dirigir");
        }

//        if(idade <= 18 && possuiCNH == true && !bebado){
//            System.out.println("pode dirigir");
//        }else{
//            System.out.println("nao pode dirigir");
//        }








        entrada.close();

    }


}
