package aula04.forforEach;

public class ExemploForContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i  == 3) {
                continue; // pula a iteração quando o i igual a 3
            }
            System.out.println(i);
        }
        System.out.println("saiu do loop com continue");
        System.out.println("-----------------------------");

        for (int i = 0; i < 5; i++) {
            if (i  == 4) {
                break;// sai do loop com break
            }
            System.out.println(i);
        }
        System.out.println("saiu do loop com break");
        System.out.println("-----------------------------");


        for (int i = 1; i <= 5; i++) {
            if (i  == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("não executa porque usou return");
        System.out.println("-----------------------------");
    }
}
