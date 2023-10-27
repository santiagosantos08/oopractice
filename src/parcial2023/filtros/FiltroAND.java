package parcial2023.filtros;

import parcial2023.modelo.Tarea;

public class FiltroAND implements Filtro {
    Filtro f1;
    Filtro f2;
    public FiltroAND(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override public boolean cumple(Tarea t){
        return(f1.cumple(t) && f2.cumple(t));
    }
}
