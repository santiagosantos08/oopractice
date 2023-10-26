package recu2023.modelo;

import recu2023.filtros.FNombreIgual;
import recu2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;
public class CursoSimple extends Curso {
    protected int precio, horas, nota;
    public CursoSimple(){
        this.nombre = "";
        this.precio = -1;
        this.horas = -1;
        this.nota = -1;
        //hace falta inicializar keywords???
    }
    public CursoSimple(String nombre, int precio, int horas, int nota, List<String> keywords){
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
        this.nota = nota;
        this.keywords = keywords;
    }
    //estos setters quiza no deban estar ya que aca no son necesarios y en CursoRegularizado ni tienen sentido
    public void setHoras(int horas){
        this.horas = horas;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setNotaMinima(int nota){
        this.nota = nota;
    }
    public int getNotaMinima(){
        return this.nota;
    }
    @Override
    public int getCantSubcursos(){
        return 1;
    }
    @Override
    public int getPrecio(){
        return this.precio;
    }
    @Override
    public int getPrecioCustom(Alumno a){
        if(aprobado(a)){
            return 0;
        }
        return getPrecio();
    }
    @Override
    public int getHoras(){
        return this.horas;
    }
    @Override
    public boolean aprobado(Alumno a){
        List<CursoRegularizado> completos = a.getCursos();
        //Filtro f = new FNombreIgual(this.nombre);
        for(CursoRegularizado x: completos){
            if (x.getNombre() == this.nombre){
                return true;
            }
        }
        return false;
    }
    @Override
    public List<Curso> buscar(Filtro f){
        List<Curso> cumple = new ArrayList<>();
        if(f.cumple(this)){
            cumple.add(this);
        }
        return cumple;
    }
}
