package recu2023.modelo;

import recu2023.filtros.Filtro;
import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    protected String nombre;
    protected List<String> keywords;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void addKeyword(String keyword){
        this.keywords.add(keyword);
    }
    public List<String> getKeywords(){
        List<String> x = new ArrayList<>();
        x = this.keywords;
        return x;
    }
    public abstract int getPrecio();
    public abstract int getHoras();
    public abstract boolean aprobado(Alumno a);
    public abstract List<Curso> buscar(Filtro f);

}
