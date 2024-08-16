package src.introducao.controledefluxo;

public class ControleDeFluxoSwitch {
    public static void main(String[] args) {
        // SWITCH  = parecido com else if ,porem ,mais reduzida.

        byte dia = 5;
        // char, int, byte, short,enum e String
        switch (dia) {
            case 1 :
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }

        String sexo = "F";
        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


    }
}
