package prefinal2022.model;

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
    public void addKeyword(String keyword){
        //agregar chequeo de que no este repetida antes
        this.keywords.add(keyword);
    }
    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

}
