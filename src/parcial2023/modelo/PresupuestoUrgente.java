package parcial2023.modelo;


import parcial2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoUrgente extends Presupuesto {
    static int recargo = 0;
    public PresupuestoUrgente(String nombre){
        super(nombre);
    }
    public PresupuestoUrgente(Presupuesto p, Filtro f){
        super(p.getNombre());
        //
        List<Tarea> tareasOrig = p.buscar(f);
        for(Tarea x: tareasOrig){
                this.addTarea(x);
        }
        //

    }
    @Override
    public void setModificadorPrecio(int n){
        if( n < 0 ) n = 0;
         // if( n > 100 ) n = 100; recargos del mas del 100% son posibles
        this.recargo = n;
    }
    @Override
    public boolean addTarea(Tarea t){
        for(String s: t.getMateriales()){
            this.addMaterial(s);
        }
        return super.addTarea(t);
    }
    @Override
    public int getModificadorPrecio(){
        return this.recargo;
    }
    @Override
    public int getCosto(){
        int sum = 0;
        for(Tarea t: getTareas()){
            sum += t.getCosto();
        }
        return (sum + (sum/100*recargo));
    }
    @Override
    public int getTiempoEspera(){
        int max = 0;
        for(Tarea t: getTareas()){
            int temp = t.getTiempoEspera();
            if(temp > max) max = temp;
        }
        return max;
    }
    @Override
    public String toString(){
        return super.toString() + "["+this.getNombre()+"] PU";
    }
}
