package org.Exercicios;

import java.util.Scanner;

public class SubstituirPalavras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva uma frase : ");
        String frase = entrada.nextLine();

        System.out.println("Digita a palavra a ser substituída: ");
        String palavraASubstituir = entrada.nextLine();

        System.out.println("Digite a palavra de substituição: ");
        String palavraSubstituta = entrada.nextLine();


        frase = frase.replace(palavraASubstituir, palavraSubstituta);
        System.out.println(frase);
    }
}
