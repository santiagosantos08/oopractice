package parcial2023.modelo;

import java.util.ArrayList;
import java.util.List;
import parcial2023.filtros.Filtro;

public abstract class Tarea {
    //--
    private String nombre;
    private List<String> materiales;
    public Tarea(String nombre){
        //ctor
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }
    public Tarea(Tarea t, Filtro f){

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public List<String> getMateriales(){
        List<String> x = new ArrayList<>(this.materiales);
        return x;
    }
    public void addMaterial(String material){
        this.materiales.add(material);
    };
    public abstract int getCosto();
    public abstract int getCantEmpleados();
    public abstract int getTiempoEspera();
    public abstract List<Tarea> buscar(Filtro f);
    @Override
    public String toString(){
        return "["+nombre+"]";
    }
    public boolean eIgual(Tarea t){
        //chequear si es istancia de otra cosa ahcer un return false de toque
        return this.nombre.equals(t.getNombre());
    }
}
