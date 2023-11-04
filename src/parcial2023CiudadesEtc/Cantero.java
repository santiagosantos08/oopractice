package parcial2023CiudadesEtc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cantero extends Region {
    private int metros;
    private LocalDate fecha;
    private boolean plantado;
    private Compuesto padre;
    public Cantero(){
        super();
        metros = 0;
        padre = null;
        plantado = false;
        fecha = null;
    }
    public Cantero(int mts, Compuesto p){
        super();
        metros = mts;
        padre = p;
        plantado = false;
        fecha = null;
    }
    public void setMetros(int n){ this.metros = n; } //esto no se pedia la agregue ahora para verificar funcionalidad
    public int getMetros(){ return metros; }
    public LocalDate getFecha(){ return fecha; }
    public boolean isPlantado(){ return plantado; }
    public void setPlantado(){
        plantado = true;
        fecha = LocalDate.now();
    }
    public String getEspecie(){
        List<String> temp = padre.getEspeciesPermitidas();
        if(!temp.isEmpty()){ return temp.get(0); }
        return null;
    }
    public int getCantMetrosCondicionado(Filtro f){
        if(f.cumple(this)){ return metros; }
        return 0;
    }
    public int getCantArbolesCondicionado(Filtro f){
        if(f.cumple(this)){ return 1; }
        return 0;
    }
    public List<String> getEspeciesPlantadas(){
        List<String> res = new ArrayList<>();
        if(this.getEspecie() != null){ res.add(this.getEspecie()); }
        return res;
    }
    public List<String> getEspeciesPermitidas(){
        return getEspeciesPlantadas();
    }
    public String toString(){
        return ("CanteroDefault "+" metros: "+metros);
    }
}
