package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;

public class FiltroAND implements Filtro {
    private Filtro f1;
    private Filtro f2;
    public FiltroAND(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean cumple(ElementoAlquilable elem){
        return (f1.cumple(elem) && f2.cumple(elem));
    }
}
