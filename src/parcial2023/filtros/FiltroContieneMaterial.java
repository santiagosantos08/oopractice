package parcial2023.filtros;

import parcial2023.modelo.Tarea;

import java.util.List;

public class FiltroContieneMaterial implements Filtro {
    private String material;
    FiltroContieneMaterial(String m){
        this.material = m;
    }
    @Override
    public boolean cumple(Tarea t){
        List<String> x = t.getMateriales();
        return (x.contains(this.material));
    }
}
