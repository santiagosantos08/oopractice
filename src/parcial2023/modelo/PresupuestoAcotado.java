package parcial2023.modelo;

import parcial2023.filtros.Filtro;
import parcial2023.filtros.FiltroTrue;

import java.util.List;

public class PresupuestoAcotado extends PresupuestoComplejo {
    private Filtro f1;
    public PresupuestoAcotado(String nombre){
        super(nombre);
        this.f1 = new FiltroTrue();
    }
    public PresupuestoAcotado(Presupuesto p, Filtro f){
        super(p.getNombre());
        //creo que en realidad habria que pedir el getTareas y hacerle un .buscar 1x1
        List<Tarea> temp = p.buscar(f);
        for(Tarea t: temp){
            this.addTarea(t);
        }
        this.f1 = f; //se deja el mismo filtro de creacion para el futuro
    }
    public void setFiltro(Filtro f){
        this.f1 = f;
    }
    public void resetFiltro(){
        this.f1 = new FiltroTrue();
    }
    public Filtro getFiltro(){
        Filtro res = this.f1;
        return res;
    }
    @Override
    public boolean addTarea(Tarea t){
        if(this.f1.cumple(t)){
            return super.addTarea(t);
        }
        return false;
    }
    @Override
    public String toString(){
        return super.toString() +  "["+this.getNombre()+"] PA";
    }
}
