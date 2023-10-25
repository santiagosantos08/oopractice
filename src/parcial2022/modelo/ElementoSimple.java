package parcial2022.modelo;

import parcial2022.utils.Precio;
public class ElementoSimple extends ElementoAlquilable{
    private String nombre, descripcion;
    private int meses, id, valor;
    private Precio precio;
    private ElementoSimple(String nombre, String descripcion, int meses, int id, int valorBase){
        this.valor = valorBase;

    }
    //hacer bien es solo para que no tire erroes mientras lo hago
    public int getValorAlquiler(){
        return precio.getValor();
    }
    public int getMesesAntiguedad(){
        return 0;
    }
}
