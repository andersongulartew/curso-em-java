import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaListagem {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();

        Conta conta1 = new Conta("Rogerio");
        conta1.setNome("Rogerio");
        conta1.setSaldoTotal(1_000);

        Conta conta2 = new Conta("Lucas");
        conta2.setNome("Lucas");
        conta2.setSaldoTotal(50_000);

        Conta conta3 = new Conta("Gabriela");
        conta3.setNome("Gabriela");
        conta3.setSaldoTotal(80);


        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        System.out.println("Ordenando por Saldo de Conta");
        Collections.sort(contas);
        System.out.println(contas);

    }
}
