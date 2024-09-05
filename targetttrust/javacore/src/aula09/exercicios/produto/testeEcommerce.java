package aula09.exercicios.produto;

public class testeEcommerce {
    public static void main(String[] args) {

        Livro livro = new Livro("Passaro", 55, "anderson");
        System.out.println("Nome do livro: " + livro.getNome() + "\n" + "Preço do livro: " + livro.getPreco() + "\n" + "Preço do livro com 10% de desconto: " + livro.calcularDesconto() + "\n" + "Autor do livro: " + livro.getAutor());

        System.out.println("---------------------------------------------------------");

        Eletronico eletronico = new Eletronico("Smartphone", 200, "Samsung");
        System.out.println("Nome do eletronico: " + eletronico.getNome() + "\n" + "Preço do eletrônico: " + eletronico.getPreco() + "\n" + "Preço do eletrônico com 5% desconto: " + eletronico.calcularDesconto() + "\n" + "Marca do eletrônico: " + eletronico.getMarca());


    }
}
