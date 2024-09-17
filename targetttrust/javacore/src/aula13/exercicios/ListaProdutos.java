package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaProdutos {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", "Informática"),
            new Produto("Celular", "Eletrônico"),
            new Produto("Mouse", "Informática"),
            new Produto("Televisão", "Eletrônico"),
            new Produto("Tablet", "Informática")
        );

        Map<String, List<Produto>> produtoCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        produtoCategoria.forEach((categoria, produtoList) -> {
            System.out.println("Categoria: " + categoria);
            produtoList.forEach(produto -> System.out.println("Produto: " + produto.getNome()));
        });

    }
}
