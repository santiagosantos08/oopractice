package parcial2021Terminos;

import java.util.ArrayList;
import java.util.List;

public abstract class Termino extends Expresion {
    protected Expresion exp1, exp2;
    protected String operador;
    public Termino(Expresion exp1, Expresion exp2, String operador){
        super();
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operador = operador;
    }
    public String getOperador(){ return this.operador; }
    public List<Float> getNumeros(){
        List<Float> res = new ArrayList<>();
        res.addAll(exp1.getNumeros());
        res.addAll(exp2.getNumeros());
        return res;
    }
    public List<String> getOperadores(){ //ver que no esten vacios antes de agregar?
        List<String> res = new ArrayList<>();
        res.addAll(exp1.getOperadores());
        res.add(operador);
        res.addAll(exp2.getOperadores());
        return res;
    }
}
