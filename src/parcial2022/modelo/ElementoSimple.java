package parcial2022.modelo;

import parcial2022.utils.Precio;
import parcial2022.utils.PrecioSimple;

import java.util.ArrayList;
import java.util.List;
import parcial2022.filtros.Filtro;

public class ElementoSimple extends ElementoAlquilable {
    protected String nombre;
    protected int meses;
    protected Precio precioAlquiler;
    public ElementoSimple(){
        this.valor = 0;
        this.precioAlquiler = new PrecioSimple(0);
        this.nombre = "";
        this.descripcion = "";
        this.meses = 0;
        this.id = -1;
    }
    public ElementoSimple(String nombre, String descripcion, int meses, int id, int valorBase, Precio precioAlquiler){
        this.valor = valorBase;
        this.precioAlquiler = precioAlquiler;
        this.nombre  = nombre;
        this.descripcion = descripcion;
        this.meses = meses;
        this.id = id;
    }

    public void aumentarMeses(){
        this.meses += 1;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int getValorAlquiler(){
        return precioAlquiler.getValor();
    }
    @Override
    public int getMesesAntiguedad(){
        return meses;
    }
    @Override
    public List<ElementoAlquilable> buscar(Filtro f){
        List<ElementoAlquilable> res = new ArrayList<>();
        if(f.cumple(this)){
            res.add(this);
        }
        return res;
    }
}
