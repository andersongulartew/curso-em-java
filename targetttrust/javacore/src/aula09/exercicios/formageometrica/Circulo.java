package aula09.exercicios.formageometrica;

public class Circulo implements FormaGeometrica {
    private double raio;
    public Circulo(double raio) {
        this.raio =raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * (raio*raio);
    }

    @Override
    public double calcularPerimetro() {
        return raio * Math.PI*2;
    }

}
