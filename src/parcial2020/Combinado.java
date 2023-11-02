package parcial2020;

import java.util.ArrayList;
import java.util.List;

public class Combinado extends Elemento {
    private List<Elemento> elementos;
    private String titulo;
    public Combinado(String titulo, String idioma, List<Elemento> elementos){
        super(idioma);
        this.titulo = titulo;
        this.elementos = elementos;
    }
    public void addElemento(Elemento e){ this.elementos.add(e); }
    public List<Elemento> getElementos(){ return new ArrayList<>(this.elementos); }
    public int getCantPalabras(){
        int sum = 0;
        for(Elemento e: elementos){
            sum += e.getCantPalabras();
        }
        return sum;
    }
    public List<Elemento> buscar(Filtro f){
        List<Elemento> res = new ArrayList<>();
        for(Elemento e: elementos){
            List<Elemento> temp = e.buscar(f);
            if(!temp.isEmpty()){
                res.addAll(temp);
            }
        }
        return res;
    }
    public Elemento traducirA(String destino){
        List<Elemento> nuevos = new ArrayList<>();
        for(Elemento e: elementos){
            nuevos.add(e.traducirA(destino));
        }
        String tituloNuevo = Diccionario.traducir(this.getIdioma(),destino,this.titulo);
        Elemento res = new Combinado(tituloNuevo,destino,nuevos);
        return res;
    }
}
