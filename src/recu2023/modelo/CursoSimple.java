package recu2023.modelo;

import recu2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;
public class CursoSimple extends Curso {
    protected int precio, horas, nota;
    public CursoSimple(String nombre, int precio, int horas, int nota, List<String> keywords){
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
        this.nota = nota;
        this.keywords = keywords;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    @Override
    public int getPrecio(){
        return this.precio;
    }
    @Override
    public int getHoras(){
        return this.horas;
    }
    @Override
    public boolean aprobado(Alumno a){
        //implementar
        return false;
    }
    @Override
    public List<Curso> buscar(Filtro f){
        //implementar
        return new ArrayList<>();
    }
}
