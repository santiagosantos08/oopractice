package parcial2023.filtros;

import parcial2023.modelo.Tarea;

public class FiltroEmpleadosMenor implements Filtro {
    private int x;
    public FiltroEmpleadosMenor(int n){
        this.x = n;
    }
    @Override
    public boolean cumple(Tarea t){
        return (t.getCantEmpleados() < this.x);
    }
}
