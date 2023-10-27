package recu2021.filtros;
import recu2021.modelo.Cliente;

public interface Filtro {
    boolean cumple(Cliente c);
}
