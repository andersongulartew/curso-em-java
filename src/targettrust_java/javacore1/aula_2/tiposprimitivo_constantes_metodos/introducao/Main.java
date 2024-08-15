package com.targettrust.introducao;


public class Main {

    public static void main(String[] args) {

        // Tipos Primitivos

        int exemploInt = 128;
        float exemploFloat = 18.0f;
        long exemploLong = 2L;
        double exemploDouble = 2.0;
        char exemploChar = 'a';
        boolean exemploBoolean = true;

        String exemploString = "Hello World";
        System.out.println(exemploString);

        //*************

        MinhaPrimeiraClasse minhaPrimeiraClasse = new MinhaPrimeiraClasse();
        MinhaPrimeiraClasse minhaPrimeiraClasse2 = new MinhaPrimeiraClasse();

        System.out.println(MinhaPrimeiraClasse.totalPedidos);


    }
}
