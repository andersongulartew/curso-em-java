package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioOrdenacao {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
//        produtos.add(new Produto("creme dental 90g", 2.49, 2.99));
//        produtos.add(new Produto("sabonete em barra Corporal 90g", 2.90, 3.90));
//        produtos.add(new Produto("Protetor Solar 30 FPS 200ml", 37.39, 39.12));
//        produtos.add(new Produto("Fralda P Confort- 50 Unidades", 44.90, 44.90));
//        produtos.add(new Produto("Condicionador 200ml", 19.80, 19.50));

        Produto cremeDental = new Produto();
        cremeDental.setNome("Creme Dental 90g");
        cremeDental.setCustoAquisicao(2.49);
        cremeDental.setValorVenda(2.99);
        System.out.println(cremeDental);


        Produto sabonete = new Produto();
        sabonete.setNome("Sabonete em Barra Corporal 90g");
        sabonete.setCustoAquisicao(2.99);
        sabonete.setValorVenda(3.30);
        System.out.println(sabonete);

        Produto protetorSolar = new Produto();
        protetorSolar.setNome("Protetor Solar 30 FPS 200ml");
        protetorSolar.setCustoAquisicao(37.39);
        protetorSolar.setValorVenda(39.12);
        System.out.println(protetorSolar);

        Produto fralda = new Produto();
        fralda.setNome("Fralda P Confort- 50 Unidades");
        fralda.setCustoAquisicao(44.90);
        fralda.setValorVenda(44.90);
        System.out.println(fralda);

        Produto condicionador = new Produto();
        condicionador.setNome("Condicionador 200ml");
        condicionador.setCustoAquisicao(18.90);
        condicionador.setValorVenda(19.50);
        System.out.println(condicionador);

        produtos.add(cremeDental);
        produtos.add(sabonete);
        produtos.add(protetorSolar);
        produtos.add(fralda);
        produtos.add(condicionador);


//        produtos.sort(Comparator.comparing(Produto::getNome));
//        System.out.println("\nProdutos ordenados pelo nome:");
//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }

        produtos.sort(Comparator.comparing(Produto::getCustoAquisicao));
        System.out.println("\nProdutos ordenados pelo custo de aquisição:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }


    }

}