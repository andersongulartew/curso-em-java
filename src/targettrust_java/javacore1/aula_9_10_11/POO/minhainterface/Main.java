package minhainterface;

import minhainterface.implement.MinhaInterfaceImplement;

public class Main {
    public static void main(String[] args) {

        MinhaInterface objeto = new MinhaInterfaceImplement();
        objeto.metodo01();
        int resultado = objeto.metodo02();

    }

}
