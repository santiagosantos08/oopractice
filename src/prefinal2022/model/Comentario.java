package prefinal2022.model;

public class Comentario {
    private String autor, texto;
    public Comentario(String autor, String texto){
        this.autor = autor;
        this.texto = texto;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
