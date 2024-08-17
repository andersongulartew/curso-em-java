package javacore.aula02;

public class Carro {

    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void acelerar(){
        Motor motor = new Motor();
        motor.injetarGasolina();
        motor.acelerar();
    }

}
