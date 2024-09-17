package optional;

import java.util.Optional;

public class OptionalExemplo {
    public static void main(String[] args) {

        // contem um valor não nulo
        Optional<String> optionalNome = Optional.of("Anderson");
        //System.out.println(optionalNome.get());

        // indica ausencia de valor
        Optional<String> optionalVazio = Optional.empty();
        optionalNome.ifPresent(valor -> System.out.println("Vale Presente: " + valor) );
//        optionalNome.ifPresentOrElse(valor -> System.out.println("Vale Presente: " + valor) -> System.out.println("valor ausente");

        String possivelNulo = null;
        Optional<String> possivelPossivelNulo = Optional.ofNullable(possivelNulo);

/*        System.out.println(optionalNome);
        System.out.println(optionalVazio);
        System.out.println(possivelNulo);*/


//        String nome = optionalNome.orElse("nome padrao");
//        System.out.println("nome: " + optionalNome);

//        String nome2 = optionalNome.orElseGet(() -> obterNome());


    }
//    public static void obterNome() {
//        System.out.println("padrao");
//    }


}
