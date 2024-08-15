package src.introducao.controledefluxo;

public class ExercicioControleDeFluxo1 {
    public static void main(String[] args) {
        /*
        .Crie uma variavel salario e imprime seu importo
        imposto:
        salario < 1000  5%
        salario >=1000 && salario < 2000  10%
        salario >= 2000 && salario < 4000 15%
        salario > 500 20%
         */

        double salario = 3500;
        double imposto;

        if (salario < 1000) {
            imposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.10;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        } else {
            imposto = salario * 0.20;
        }

        System.out.println("Imposto: " + imposto);
    }
}
