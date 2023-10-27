package parcial2023.modelo;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends TareaBasica {
    private List<String> especialidades;
    public TareaCompleja(String nombre){
        super(nombre);
        this.especialidades = new ArrayList<>();
    }
    public boolean addEspecialidad(String n){
        if(this.especialidades.contains(n)) return false;
        this.especialidades.add(n);
        return true;
    }
    public List<String> getEspecialidades(){
        List<String> x = new ArrayList<>(this.especialidades);
        return x;
    }
    @Override
    public String toString(){
        return super.toString() + "["+this.getNombre()+"] TC";
    }
}
