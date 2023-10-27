package prefinal2022.model;

import prefinal2022.filters.Filter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NoticiaVentana extends Noticia {
    private LocalDateTime vencimiento;
    public NoticiaVentana(String titulo, String tema, String texto, String autor, LocalDateTime vencimiento){
        super(titulo,tema,texto,autor);
        this.vencimiento = vencimiento;
    }
    public NoticiaVentana(NoticiaVentana n){
        super(n.getTitulo(),n.getTema(),n.getTexto(),n.getAutor());
        this.vencimiento = n.getVencimiento();
    }
    public LocalDateTime getVencimiento(){
        return this.vencimiento;
    }
    @Override
    public boolean addComentario(Comentario c){
        if(LocalDateTime.now().isBefore(this.vencimiento)){
            return super.addComentario(c);
        }
        return false;
    }
    @Override
    public NoticiaVentana copiaRestringida(Filter f){
        if(f.cumple(this)){
            return new NoticiaVentana(this);
        }
        return null;
    }
}
