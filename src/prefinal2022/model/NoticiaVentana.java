package prefinal2022.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NoticiaVentana extends Noticia {
    private LocalDateTime vencimiento;
    public NoticiaVentana(String titulo, String tema, String texto, String autor, LocalDateTime vencimiento){
        super(titulo,tema,texto,autor);
        this.vencimiento = vencimiento;
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
}
