package aula04.forforEach;

public class ExemploFor {
    public static void main(String[] args) {

       //for(incializa;consição;atualização "i++ = +1")
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração: " + i);

        }


        int contador = 0;
        for (;contador < 5; contador++) {
            System.out.println("Iteração: " + contador);

        }


        //forEach
        int[] numeros = {1,2,3,4,5};
        for (int numero:numeros) {
            System.out.println(numero);
        }
    }
}
