import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClienteListagem {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "John Doe";
        cliente1.cpf = 123456789;

        Cliente cliente2= new Cliente();
        cliente2.nome = "Jonas Amparo";
        cliente2.cpf = 12454519;

        Cliente cliente3 = new Cliente();
        cliente3.nome = "Anderson Gularte";
        cliente3.cpf = 45794564;

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        System.out.println("Listagem pelo nome dos clientes: ");
        ClienteByNomeComparator comparator = new ClienteByNomeComparator();
        Collections.sort(clientes, comparator);
        System.out.println(clientes);

        System.out.println("Listagem pelo cpf dos clientes: ");
        ClienteByCpfComparator comparator2 = new ClienteByCpfComparator();
        Collections.sort(clientes,comparator2);
        System.out.println(clientes);


    }
}
