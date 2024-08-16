package src.introducao.controledefluxo;

public class ControleDeFluxoForWhileDoWhile {
    public static void main(String[] args) {
        // FOR ; WHILE ; DO WHILE

        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador ++;
        }

        contador = 0;
        do {
            System.out.println("dentro do while" + contador++);
        }while (contador < 10);

        ///////////////////

        for (int i = 0; i <= 10; i++) {
            System.out.println("O valor de i é : " + i);
        }
    }
}
