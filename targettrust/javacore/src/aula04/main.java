package aula04;

import static aula04.Switch.Altura;
import static aula04.Switch.Peso;

public class main {

    public static void main(String[] args) {
        double peso = Peso();
        double altura = Altura();

        double imc = peso / (altura * altura);
        String resultado = String.format("%.2f", imc);
        System.out.println("Seu IMC é: " + resultado);

         ClassificacaoIMC resultIMC = ClassificacaoIMC.SOBREPESO;
        switch (resultIMC) {
            case MAGRO:
                System.out.println("magro");
                break;
            case NORMAL:
                System.out.println("normal");
                break;
            case SOBREPESO:
                System.out.println("sobrepeso");
                break;

            default:
                System.out.println("error");
        }


//        String classificacao = ClassificacaoIMC.getClassificacaoPorExtenso();
//        System.out.println(classificacao);

    }



}
