package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroDeudaMenor implements Filtro {
    private float valor;
    public FiltroDeudaMenor(float n){
        this.valor = n;
    }
    @Override
    public boolean cumple(Cliente c){
        return (c.getDeuda() < (this.valor * c.getPrecio()));
    }
}
