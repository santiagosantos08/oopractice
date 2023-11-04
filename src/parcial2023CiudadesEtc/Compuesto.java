package parcial2023CiudadesEtc;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Region {
    private List<String> permitidas;
    private List<Region> elementos;
    private boolean permiteMultiples;
    private Region padre;
    public Compuesto(List<String> permitidas, List<Region> elementos, Region padre, boolean permiteMultiples){
        super();
        this.permitidas = permitidas;
        this.elementos = elementos;
        this.padre = padre;
        this.permiteMultiples = permiteMultiples;
    }
    public void addElemento(Region r){
        boolean agregar = true;
        for(String s: r.getEspeciesPermitidas()){
            if(!this.getEspeciesPermitidas().contains(s)){ agregar = false; }
        }
        if(agregar){ elementos.add(r); }
    }
    public void addEspecie(String s){
        //antes chequear if padre  != null
        if(padre.getEspeciesPermitidas().contains(s)){ permitidas.add(s); }
    }
    public void delEspecie(String s){
        boolean borrar = true;
        for(Region x: elementos){
            if(x.getEspeciesPermitidas().contains(s)){ borrar = false; }
        }
        if(borrar){ permitidas.remove(s); }
    }
    public int getCantMetrosCondicionado(Filtro f){
        int sum = 0;
        for(Region x: elementos){
            sum += x.getCantMetrosCondicionado(f);
        }
        return sum;
    }
    public int getCantArbolesCondicionado(Filtro f){
        int sum = 0;
        for(Region x: elementos){
            sum += x.getCantArbolesCondicionado(f);
        }
        return sum;
    }
    public List<String> getEspeciesPlantadas(){
        List<String> res = new ArrayList<>();
        for(Region x: elementos){
            List<String> temp = new ArrayList<>(x.getEspeciesPlantadas());
            if(!temp.isEmpty()){ res.addAll(temp); }
        }
        return res;
    }
    public List<String> getEspeciesPermitidas(){
        //esto aca esta re bostero no me acuerdo bien, la logica del parcial era mas largo
        //puede ser que le haya errado como loco lo tire de memoria..
        List<String> res = new ArrayList<>();
        if(!permitidas.isEmpty()){ // manzana  o region con una/s permitida/s
            res.addAll(permitidas);
        }else{
            List<String> temp = padre.getEspeciesPermitidas();
            if(permiteMultiples){ res.addAll(temp); } //chequear que no este vacio..
            else{ res.add(temp.get(0)); }
        }
        return res;
    }
}
