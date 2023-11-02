package prefinal2022.model;

import prefinal2022.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public abstract class Articulo {
    protected String titulo, tema;
    protected List<String> keywords;
    public Articulo(){}
    public Articulo(String titulo, String tema){
        this.keywords = new ArrayList<>();
        this.titulo = titulo;
        this.tema = tema;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public List<String> getKeywords(){
        return new ArrayList<String>(this.keywords);
    }
    public abstract String getTema();
    public abstract int cantNoticias(Filter f);
    public abstract Articulo copiaRestringida(Filter f);
}
