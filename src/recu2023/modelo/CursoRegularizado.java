package recu2023.modelo;

import java.time.LocalDateTime;

public class CursoRegularizado extends CursoSimple {
    private int notaObtenida;
    private LocalDateTime fecha;
    public CursoRegularizado(CursoSimple c, int notaObtenida, LocalDateTime fecha){
        this.nombre = c.getNombre();
        this.precio = c.getPrecio();
        this.horas = c.getHoras();
        this.keywords = c.getKeywords();
        this.nota = c.getNotaMinima();
        //===
        this.notaObtenida = notaObtenida;
        this.fecha = fecha;
    }
    //los setter estos otra vez no se si son necesarios (?
    public void setNotaObtenida(int nota){
        this.notaObtenida = nota;
    }
    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
    public int getNotaObtenida(){
        return this.notaObtenida;
    }
    public LocalDateTime getFecha(){
        return this.fecha;
    }
}
