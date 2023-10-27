package prefinal2022.model;

import prefinal2022.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends Articulo {
    private String texto, autor;
    List<Comentario> comentarios;
    public Noticia(String titulo, String tema, String texto, String autor){
        super(titulo,tema);
        this.texto = texto;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
    }
    public Noticia(Noticia n){
        super(n.getTitulo(),n.getTema());
        this.texto = n.getTexto();
        this.autor = n.getAutor();
        this.comentarios = n.getComentarios();
    }
    public void addKeyword(String keyword){
        //agregar chequeo de que no este repetida antes
        this.keywords.add(keyword);
    }
    public boolean addComentario(Comentario comentario){
        this.comentarios.add(comentario);
        return true;
    }
    public boolean comentadaPor(String autor){
        for(Comentario c: comentarios){
            if(c.getAutor().equals(autor)){
                return true;
            }
        }
        return false;
    }
    public String getTexto(){
        return this.texto;
    }
    public String getAutor(){
        return this.autor;
    }
    public List<Comentario> getComentarios(){
        return new ArrayList<Comentario>(this.comentarios);
    }
    @Override
    public String getTema(){
        return this.tema;
    }
    @Override
    public int cantNoticias(Filter f){
        if(f.cumple(this)){
            return 1;
        }
        return 0;
    }
    @Override
    public Noticia copiaRestringida(Filter f){
        if(f.cumple(this)){
            return new Noticia(this);
        }
        return null;
    }
}
