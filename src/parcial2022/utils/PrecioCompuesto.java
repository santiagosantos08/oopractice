package parcial2022.utils;

public class PrecioCompuesto implements Precio {
    private Precio p1;
    private Precio p2;
    public PrecioCompuesto(Precio p1, Precio p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public int getValor(){
        return p1.getValor() + p2.getValor();
    }
}
