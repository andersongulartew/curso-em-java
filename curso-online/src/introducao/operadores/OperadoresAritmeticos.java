package src.introducao.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 20;

        int soma = numero1 + numero2;
        System.out.println(soma);
        System.out.println("a soma é " + (numero1 + numero2));  // outro metodo de soma sem criar uma variaval

        int multiplicacao = numero1 * numero2;
        System.out.println(multiplicacao);
        System.out.println("a multiplicação é " + (numero1 * numero2));


        int div = numero1 / numero2;
        System.out.println(div);
        System.out.println("a divisão é " + (numero1 / numero2));

        int sub = numero1 - numero2;
        System.out.println(sub);
        System.out.println("a subtração é " + (numero1 - numero2));

    }
}
