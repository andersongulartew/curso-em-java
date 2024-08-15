package orientacaoobjetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Animal gato = new Gato("Mingau");
    Animal cachorro = new Cachorro("Rex");
    gato.emitirSom();
    cachorro.emitirSom();

    }
}