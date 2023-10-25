package parcial2022.modelo;

import parcial2022.filtros.Filtro;
public abstract class ElementoAlquilable {
    private String descripcion;
    private int id;
    public String getDescripcion(){
        return descripcion;
    }
    public int getId(){
        return id;
    }
    public abstract int getValor(); //en combos sera la suma, en los que se vencen hay que ver ant, en simple solo retornar
    public abstract int getMesesAntiguedad(); //en simples y los que se vencen retornar, en combos ver la mayor ant
}