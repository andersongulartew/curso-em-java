package com.targettrust.loop.whileDoWhile;

public class VerificarNumeroDoArray1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] numero = {5, 9, 4, 6, 7, 10};
//        System.out.println("Digite um número para conferir se esta no array...");
//        int num = sc.nextInt();
        int num = 6;

        boolean encontrado = false;

        int i = 0;
        while (i < numero.length) {
            if (numero[i] == num) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("o numero " + num + " esta no array.");
        } else {
            System.out.println("o numero " + num + " não está no array.");
        }

//        sc.close();


    }

}
