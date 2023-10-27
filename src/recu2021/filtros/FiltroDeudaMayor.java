package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroDeudaMayor implements Filtro {
    private int valor;
    public FiltroDeudaMayor(int n){
        this.valor = n;
    }
    @Override
    public boolean cumple(Cliente c){
        return (c.getDeuda() > this.valor);
    }
}
