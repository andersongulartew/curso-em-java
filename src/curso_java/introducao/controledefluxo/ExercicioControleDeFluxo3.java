package src.introducao.controledefluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 100000

        /*
         poderiamos ter usado ( i+=2) ao invés de ( i++) para retornar os pares,
         sem necessidade do IF
         */
        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
