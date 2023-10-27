package parcial2023.modelo;

import parcial2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class TareaBasica extends Tarea {
    private int costo, empleados, dias;
    public TareaBasica(String nombre){
        super(nombre);
        this.costo = 0;
        this.empleados = 0;
        this.dias = 0;
    }
    public void setCosto(int costo){
        this.costo = costo;
    }
    @Override
    public int getCosto(){
        return this.costo;
    }
    public void setEmpleados(int n){
        this.empleados = n;
    }
    @Override
    public int getCantEmpleados(){
        return this.empleados;
    }
    public void setDias(int d){
        this.dias = d;
    }
    @Override
    public int getTiempoEspera(){
        return this.dias;
    }
    @Override
    public List<Tarea> buscar(Filtro f){
        List<Tarea> x = new ArrayList<>();
        if(f.cumple(this)){
            x.add(this);
        }
        return x;
    }
    @Override
    public String toString(){
        return super.toString() + "["+this.getNombre()+"] TB";
    }
}
