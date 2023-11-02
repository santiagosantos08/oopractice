package parcial2020;

import java.util.List;

public abstract class Elemento {
    private String idioma;
    public Elemento(String idioma){ this.idioma = idioma; }
    public String getIdioma(){ return this.idioma; }
    public abstract int getCantPalabras();
    public abstract List<Elemento> buscar(Filtro f);
    public abstract Elemento traducirA(String destino);
}
