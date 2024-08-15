import java.util.Comparator;

public class ClienteByCpfComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente clienteAtual, Cliente clienteOutro) {
        return clienteAtual.cpf.compareTo(clienteOutro.cpf);
    }
}
