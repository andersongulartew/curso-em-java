package src.introducao.controledefluxo;

public class ControleDeFluxoBreack {
    public static void main(String[] args) {
        //  BREACK - encerra a leitura na linha em que estiver o breack

        /*
        dado um valor de um carro descubra em quantas parcelas ele pode
        ser parcelado,porem as parcelas nao podem ser menores que 1000
         */
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + " :"  + valorParcela);
        }
    }
}
