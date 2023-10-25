package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;

public class FiltroContiene implements Filtro {
    private String valor;
    public FiltroContiene(String valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(ElementoAlquilable elem){
        return elem.getDescripcion().contains(valor);
    }
}
