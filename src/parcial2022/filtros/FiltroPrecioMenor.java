package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;

public class FiltroPrecioMenor implements Filtro {
    private int valor;
    public FiltroPrecioMenor(int valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(ElementoAlquilable elem){
        return (elem.getValor() < valor);
    }
}
