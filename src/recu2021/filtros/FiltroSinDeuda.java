package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroSinDeuda implements Filtro {
    public FiltroSinDeuda(){

    }
    @Override
    public boolean cumple(Cliente c){
        return (c.getDeuda() == 0);
    }
}
