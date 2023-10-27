package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroTrue implements Filtro {
    public FiltroTrue(){

    }
    @Override
    public boolean cumple(Cliente c){return true;}
}
