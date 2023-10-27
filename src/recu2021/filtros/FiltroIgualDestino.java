package recu2021.filtros;

import recu2021.modelo.Cliente;

public class FiltroIgualDestino implements Filtro {
    private String valor;
    public FiltroIgualDestino(String d){
        this.valor = d;
    }
    @Override
    public boolean cumple(Cliente c){
        return (valor.equals(c.getDestino()));
    }
}
