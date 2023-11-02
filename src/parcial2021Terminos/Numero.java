package parcial2021Terminos;

import java.util.ArrayList;
import java.util.List;

public class Numero extends Expresion {
    private float valor;
    public Numero(float valor){
        super();
        this.valor = valor;
    }
    public float eval(){ return valor; }
    public List<Float> getNumeros(){
        List<Float> res = new ArrayList<>();
        res.add(valor);
        return res;
    }
    public List<String> getOperadores(){ return new ArrayList<String>(); }
    public Expresion getOpuesta(){ return new Numero(-valor); }
    public Expresion getNormalizada(float n){ return new Numero(valor/n); }
    public Expresion getCopia(){ return new Numero(valor); }
}
