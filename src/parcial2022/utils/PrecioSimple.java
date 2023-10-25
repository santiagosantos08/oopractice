package parcial2022.utils;

public class PrecioSimple implements Precio {
    private int precio;
    public PrecioSimple(int precio){
        this.precio = precio;
    }
    public int getValor(){
        return precio;
    }
}
