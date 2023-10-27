package recu2023.modelo;

import recu2023.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;
public class Espec extends Curso {
    protected List<Curso> cursos;
    public Espec(){
        this.nombre = ""; //despues usar el setNombre de la super
        //hacerle un new a cursos y keywords??
    }
    public void addCurso(Curso c){
        //verificar que ya no exista el curso antes de agregarlo
        this.cursos.add(c);
        this.keywords.removeAll(c.getKeywords()); //saco los que ya tiene para que no se repitan
        this.keywords.addAll(c.getKeywords()); //los agrego otra ve
    }
    public List<Curso> getCursos(){
        List<Curso> x = new ArrayList<>(cursos);
        return x;
    }
    public CursoSimple getCursoMasCaro(){
        Curso resultado = new CursoSimple();
        int max = 0;
        for(Curso c: cursos){
            if(c.getCantSubcursos() > 1){
                //AA
            }
        }
        return null;
    }
    @Override
    public int getCantSubcursos(){
        int sum = 0;
        for(Curso c: cursos){
            sum += c.getCantSubcursos();
        }
        return sum;
    }
    @Override
    public int getPrecio(){
        int sum = 0;
        for(Curso c: cursos){
            sum += c.getPrecio();
        }
        return sum;
    }
    @Override
    public int getPrecioCustom(Alumno a){
        int sum = 0;
        for(Curso c: cursos){
            sum += c.getPrecioCustom(a);
        }
        return sum;
    }
    @Override
    public int getHoras(){
        int sum = 0;
        for(Curso c: cursos){
            sum += c.getHoras();
        }
        return sum;
    }
    @Override
    public boolean aprobado(Alumno a){
        boolean incompleto = false;
        for(Curso c: cursos){
            if(!c.aprobado(a)){
                incompleto = true;
            }
        }
        return !incompleto;
    }
    @Override
    public List<Curso> buscar(Filtro f) {
        List<Curso> cumple = new ArrayList<>();
        for(Curso c: cursos){
            if(!c.buscar(f).isEmpty()){
                cumple.addAll(c.buscar(f));
            }
        }
        return cumple;
    }
}
