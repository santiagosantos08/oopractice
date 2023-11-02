package parcial2020;

import java.util.ArrayList;
import java.util.List;

public class Parrafo extends Elemento {
    private List<String> palabras;
    private boolean inmutable;
    public Parrafo(String idioma, List<String> palabras, boolean inmutable){
        super(idioma);
        this.palabras = palabras;
        this.inmutable = inmutable;
    }
    public boolean toggleInmutable(){
        this.inmutable = !this.inmutable;
        return this.inmutable;
    }
    public void addPalabra(String palabra){ this.palabras.add(palabra); }
    public List<String> getPalabras(){ return new ArrayList<>(this.palabras); }
    public int getCantPalabras(){ return this.palabras.size(); }
    public List<Elemento> buscar(Filtro f){
        List<Elemento> res = new ArrayList<>();
        if(f.cumple(this)){ res.add(this); }
        return res;
    }
    public Elemento traducirA(String destino){
        Elemento res;
        if(this.inmutable){
            res = new Parrafo(this.getIdioma(), new ArrayList<>(this.palabras), this.inmutable);
        }else{
            List<String> temp = new ArrayList<>();
            for(String p: palabras){
               temp.add(Diccionario.traducir(this.getIdioma(), destino, p));
            }
            res = new Parrafo(destino, temp, false);
        }
        return res;
    }
}
