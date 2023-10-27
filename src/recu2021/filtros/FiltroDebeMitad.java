package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroDebeMitad implements Filtro {
    public FiltroDebeMitad(){

    }
    @Override
    public boolean cumple(Cliente c){
        return (c.getDeuda() > (c.getPrecio() / 2));
    }
}
