package aula07.exercicios;

import java.util.Scanner;

public class ContarOcorrenciasSubstring {


    public static int contarOcorrencias(String texto, String substring) {
        if (texto == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        int contador = 0;
        int i = 0;
        while ((i = texto.indexOf(substring, i)) != -1){
            contador++;
            i += substring.length();
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String texto = entrada.nextLine();

        System.out.println("Digite a substring: ");
        String substring = entrada.nextLine();

        int ocorrencias = contarOcorrencias(texto,substring);
        System.out.println("Número de ocorrências: " + ocorrencias);

        entrada.close();

    }


}
