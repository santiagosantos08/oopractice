package parcial2021Terminos;

import java.util.List;

public abstract class Expresion {
    public Expresion(){}
    public abstract float eval();
    public abstract List<Float> getNumeros();
    public abstract List<String> getOperadores();
    public abstract Expresion getOpuesta();
    public abstract Expresion getNormalizada(float n);
    public abstract Expresion getCopia();
}
