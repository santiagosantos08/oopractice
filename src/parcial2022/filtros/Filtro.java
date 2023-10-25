package parcial2022.filtros;

import parcial2022.modelo.ElementoAlquilable;
public interface Filtro {
    boolean cumple(ElementoAlquilable elem);
}
