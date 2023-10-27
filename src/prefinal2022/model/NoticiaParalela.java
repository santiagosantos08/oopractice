package prefinal2022.model;

import prefinal2022.filters.Filter;

public class NoticiaParalela extends Noticia {
    Noticia asociada;
    public NoticiaParalela(String titulo, String tema, String texto, String autor, Noticia asociada){
        super(titulo,tema,texto,autor);
        this.asociada = asociada;
    }
    public Noticia getAsociada(){
        //es la misma en realidad cambiar a que sea una copia cuando
        //haga el cosntructor por copia por ahora na
        //con un filtro true
        return asociada;
    }
    @Override
    public boolean addComentario(Comentario c){
        super.addComentario(c);
        asociada.addComentario(c);
        return true;
        //en realida es return 1 && 2 para ver q se haga bien
    }
    @Override
    public NoticiaParalela copiaRestringida(Filter f){
        return null;
    }

}
