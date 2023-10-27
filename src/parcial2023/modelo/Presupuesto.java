package parcial2023.modelo;

import parcial2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Presupuesto extends Tarea {
    private List<Tarea> tareas;
    public Presupuesto(String nombre){
        super(nombre);
        this.tareas = new ArrayList<>();
    }
    public List<Tarea> getTareas(){
        return new ArrayList<>(this.tareas);
    }
    public boolean addTarea(Tarea t){
        this.tareas.add(t);
        return true;
    }
    public abstract int getModificadorPrecio();
    @Override
    public int getCantEmpleados(){
        int parcial = -1;
        for(Tarea t: tareas){
            int temp = t.getCantEmpleados();
            if(temp > parcial){
                parcial = temp;
            }
        }
        return parcial;
    }
    public abstract void setModificadorPrecio(int n);
    @Override
    public List<Tarea> buscar(Filtro f){
        List<Tarea> x = new ArrayList<>();
        for(Tarea t: this.tareas){
            List<Tarea> temp = new ArrayList<>(t.buscar(f));
            if(!temp.isEmpty()){
                x.addAll(temp);
            }
        }
        return x;
    }
    @Override
    public String toString(){
        return super.toString() + "["+this.getNombre()+"] PR";
    }
    @Override
    public boolean eIgual(Tarea t){
        //chequear si es instancia de ota otra
        boolean iguales = true;
        Presupuesto p = (Presupuesto)t;
        List<Tarea> ext = new ArrayList<>(p.getTareas());
        if(!t.getNombre().equals(this.getNombre())){
            iguales = false;
            return iguales;
        }
        if(ext.size() == this.tareas.size() && !ext.isEmpty()){
            Iterator itExt = ext.iterator();
            Iterator itInt = this.tareas.iterator();
            while(itExt.hasNext()){
                Tarea t1 = (Tarea)itExt.next();
                Tarea t2 = (Tarea)itInt.next();
                if(!t1.eIgual(t2)) {
                    iguales = false;
                    return iguales;
                }
            }
        }
        return iguales;
    }
}
