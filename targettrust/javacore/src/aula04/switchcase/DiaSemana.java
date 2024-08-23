package aula04.switchcase;

public class DiaSemana {
    public static void main(String[] args) {

        int diaDaSemana = 2;
        switch (diaDaSemana) {
            case 1:
                System.out.println("dia util da semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 7:
                System.out.println("final de semana");
                break;
            default:
                System.out.println("dia não encontrado");
        }
    }
}
