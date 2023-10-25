package parcial2022.modelo;
import parcial2022.filtros.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<ElementoAlquilable> elementos;
    private List<ElementoAlquilable> combos;
    private List<ElementoAlquilable> generarLista(List<ElementoAlquilable> completo, Filtro f){
        List<ElementoAlquilable> res = new ArrayList<>();
        for(ElementoAlquilable x: completo){
            res.addAll(x.buscar(f));
        }
        return res;
    }
    public Empresa(){
        elementos = new ArrayList<>();
        combos = new ArrayList<>();
    }
    public void agregarStock(ElementoAlquilable x){
        elementos.add(x);
    }
    public void agregarCombo(Combo x){
        combos.add(x);
    }
    public List<ElementoAlquilable> listarConDescripcion(String matchear){
        return generarLista(elementos,new FiltroContiene(matchear));
    }
    public List<ElementoAlquilable> listarTiempoValor(int meses, int valor){
        Filtro f1 = new FiltroAntiguedadMayor(meses);
        Filtro f2 = new FiltroPrecioMenor(valor);
        return generarLista(elementos,new FiltroAND(f1,f1));
    }

    public List<ElementoAlquilable> listarConId(int id){
        return generarLista(elementos,new FiltroID(id));
    }
}
