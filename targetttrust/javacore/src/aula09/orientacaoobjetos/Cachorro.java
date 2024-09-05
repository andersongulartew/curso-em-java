package aula09.orientacaoobjetos;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("au au");
    }

}
