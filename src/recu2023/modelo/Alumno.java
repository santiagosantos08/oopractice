package recu2023.modelo;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre, apellido;
    private List<CursoRegularizado> cursos; //deberia ser una ref a 'Curso' ??
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void aggCurso(CursoRegularizado c){
        cursos.add(c);
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public List<CursoRegularizado> getCursos(){
        List<CursoRegularizado> x = new ArrayList<>(cursos);
        return x;
    }
}
