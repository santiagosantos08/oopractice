package parcial2023.filtros;

import parcial2023.modelo.Tarea;

public class FiltroTrue implements Filtro {
    public FiltroTrue(){}
    @Override
    public boolean cumple(Tarea t){return true;}
}
