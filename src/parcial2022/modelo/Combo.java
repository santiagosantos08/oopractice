package parcial2022.modelo;

import java.util.List;
import java.util.ArrayList;

public class Combo extends ElementoAlquilable {
    private List<ElementoAlquilable> elementos = new ArrayList<>();
    public Combo(int id, String descripcionCombo){
        this.id = id;
        this.valor = 0;
        this.descripcion = descripcionCombo; //el "ideal para tal y tal cosa por su xyz"
    }

    public void aggElem(ElementoAlquilable x){
        elementos.add(x);
        this.valor += x.getValor();
    }
    //el valor-decompra- se setea porque solo se suma y no cambia, la antiguedad y el precio de alquiler van a variar
    @Override
    public int getValorAlquiler() {
        int sum = 0;
        for(ElementoAlquilable x: elementos){
            sum += x.getValorAlquiler();
        }
        return sum;
    }

    @Override
    public int getMesesAntiguedad() {
        int max = 0;
        for(ElementoAlquilable x: elementos){
            if (x.getMesesAntiguedad() >= max){
                max = x.getMesesAntiguedad();
            }
        }
        return max;
    }
}
