package parcial2022.modelo;

import parcial2022.utils.Precio;
import parcial2022.utils.PrecioPorcentual;
import parcial2022.utils.PrecioSimple;

public class ConVencimiento extends ElementoSimple {
    private int vencimiento,descuento,descAlquiler;
    public ConVencimiento(String nombre, String descripcion, int meses, int vencimiento, int id, int valorBase, Precio precioAlquiler, int descVencido){
        this.valor = valorBase;
        this.precioAlquiler = precioAlquiler;
        this.nombre  = nombre;
        this.descripcion = descripcion;
        this.meses = meses;
        this.id = id;
        this.vencimiento = vencimiento;
        this.descuento = descVencido;
        this.descAlquiler = 50; //%
    }

    public void setDescuentoValor(int descuento) {
        this.descuento = descuento;
    }

    public void setDescuentoAlquier(int descuento){
        this.descAlquiler = descuento;
    }

    @Override
    public int getValor(){
        if (vencimiento - meses >= 0){
            return super.getValor();
        }
        Precio descontado = new PrecioPorcentual(super.getValor(), 100 - descuento);
        return descontado.getValor();
    }
    @Override
    public int getValorAlquiler(){
        if (vencimiento - meses >= 0){
            return super.getValorAlquiler();
        }
        Precio descontado = new PrecioPorcentual(super.getValorAlquiler(), 100 - descAlquiler);
        return descontado.getValor();
    }
}
