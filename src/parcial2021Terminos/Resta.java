package parcial2021Terminos;

public class Resta extends Termino {
    public Resta(Expresion exp1, Expresion exp2, String operador){ super(exp1, exp2, operador); }
    public float eval(){ return exp1.eval() - exp2.eval(); }
    public Expresion getOpuesta(){ return new Suma(exp1.getOpuesta(), exp2.getOpuesta(), "+"); }
    public Expresion getNormalizada(float n){ return new Resta(exp1.getNormalizada(n),exp2.getNormalizada(n), operador); }
    public Expresion getCopia(){ return new Resta(exp1.getCopia(), exp2.getCopia(), operador); }
}
