package parcial2022.modelo;

import parcial2022.utils.Precio;
public class ElementoSimple extends ElementoAlquilable{
    private String nombre;
    private int meses;
    private Precio precioAlquiler;
    public ElementoSimple(String nombre, String descripcion, int meses, int id, int valorBase, Precio precioAlquiler){
        this.valor = valorBase;
        this.precioAlquiler = precioAlquiler;
        this.nombre  = nombre;
        this.descripcion = descripcion;
        this.meses = meses;
        this.id = id;
    }

    public int getValorAlquiler(){
        return precioAlquiler.getValor();
    }
    public int getMesesAntiguedad(){
        return meses;
    }
}
