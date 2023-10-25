package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;

public class FiltroID implements Filtro {
    private int valor;
    public FiltroID(int id){
        this.valor = id;
    }
    @Override
    public boolean cumple(ElementoAlquilable elem){
        return (elem.getId() == this.valor);
    }
}