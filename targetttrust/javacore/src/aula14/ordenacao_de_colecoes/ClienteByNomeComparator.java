import java.util.Comparator;

public class ClienteByNomeComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente clienteAtual, Cliente clienteOutro) {
        return clienteAtual.nome.compareTo(clienteOutro.nome);
    }
}
