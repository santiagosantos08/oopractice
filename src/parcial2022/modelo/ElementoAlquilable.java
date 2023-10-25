package parcial2022.modelo;

import parcial2022.filtros.Filtro;
public abstract class ElementoAlquilable {
    private String descripcion;
    private int id, valor;
    public String getDescripcion(){
        return descripcion;
    }
    public int getId(){
        return id;
    }
    public int getValor(){
        return valor;
    }
    public abstract int getValorAlquiler(); //en combos sera la suma, en los que se vencen hay que ver ant, en simple solo retornar
    public abstract int getMesesAntiguedad(); //en simples y los que se vencen retornar, en combos ver la mayor ant
}