package src.introducao.controledefluxo;

public class ControleDeFluxoContinue {
    public static void main(String[] args) {
        // CONTINUE - faz o programa ler deste o inicio

        /*
        dado um valor de um carro descubra em quantas parcelas ele pode
        ser parcelado,porem as parcelas nao podem ser menores que 1000
         */
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000){
                continue;
            }
            System.out.println("parcela " + parcela + " :" + " R$ " + valorParcela);

        }
    }
}
