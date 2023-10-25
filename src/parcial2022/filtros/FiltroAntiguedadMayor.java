package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;

public class FiltroAntiguedadMayor implements Filtro {
    private int valor;
    public FiltroAntiguedadMayor(int valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(ElementoAlquilable elem){
        return (elem.getMesesAntiguedad() > valor);
    }
}
