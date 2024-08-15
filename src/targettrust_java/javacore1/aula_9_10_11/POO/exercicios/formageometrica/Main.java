package exercicios.formageometrica;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Area circulo : " + circulo.calcularArea());
        System.out.println("Perimetro circulo : " + circulo.calcularPerimetro());
        System.out.println("----------------------------------------------------");
        Retangulo retangulo = new Retangulo(5,6);
        System.out.println("Area Retangulo : " + retangulo.calcularArea());
        System.out.println("Perimetro Retangulo : " + retangulo.calcularPerimetro());

    }
}
