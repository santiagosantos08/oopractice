package parcial2023.filtros;

import parcial2023.modelo.Tarea;

public class FiltroTiempoMenor implements Filtro {
    private int valor;
    public FiltroTiempoMenor(int t){
        this.valor = t;
    }
    @Override
    public boolean cumple(Tarea t){
        return (t.getTiempoEspera() < this.valor);
    }
}
