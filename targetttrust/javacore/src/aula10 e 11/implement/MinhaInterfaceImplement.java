package minhainterface.implement;

import minhainterface.MinhaInterface;
import minhainterface.MinhaInterface2;

public class MinhaInterfaceImplement implements MinhaInterface, MinhaInterface2 {

    @Override
    public void metodo01(){
        System.out.println("Metodo01");
    }

    @Override
    public int metodo02() {
        System.out.println("Metodo02");

        return 0;
    }
    @Override
    public String metodo03() {
        return "Metodo03";
    }




}


