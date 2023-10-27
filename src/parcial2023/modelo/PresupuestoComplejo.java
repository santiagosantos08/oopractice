package parcial2023.modelo;

import parcial2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoComplejo extends Presupuesto {
    int descuento;
    public PresupuestoComplejo(String nombre){
        super(nombre);
        this.descuento = 10;
    }
    public PresupuestoComplejo(Presupuesto p, Filtro f){
        super(p.getNombre());
        //creo que en realidad habria que pedir el getTareas y hacerle un .buscar 1x1
        List<Tarea> temp = p.buscar(f);
        this.descuento = 10;
        for(Tarea t: temp){
            this.addTarea(t);
        }
    }
    @Override
    public void setModificadorPrecio(int n){
        if( n < 0 ) n = 0;
        if( n > 100 ) n = 100;
        this.descuento = n;
    }
    //hacer ctor con filtro
    public boolean addTarea(Tarea t){
        List<String> temp = new ArrayList<>(t.getMateriales());
        temp.removeAll(this.getMateriales());
        for(String s: temp){
            this.addMaterial(s);
        }
        return super.addTarea(t);
    }
    @Override
    public int getModificadorPrecio(){
        return this.descuento;
    }
    @Override
    public int getCosto(){
        int sum = 0;
        for(Tarea t: getTareas()){
            sum += t.getCosto();
        }
        return (sum - (sum/100*descuento));
    }
    @Override
    public int getTiempoEspera(){
        int sum = 0;
        for(Tarea t: getTareas()){
            sum += t.getTiempoEspera();
        }
        return sum;
    }
    @Override
    public String toString(){
        return super.toString() +  "["+this.getNombre()+"] PC";
    }
}
