package prefinal2022.model;

import prefinal2022.filters.Filter;

import java.util.List;

public class Contenedor extends Articulo {
    private List<Articulo> articulos;
    //hacer contenedor hacer el setCual decide el tema el copia y fue

    @Override
    public String getTema() {
        return null;
    }

    @Override
    public int cantNoticias(Filter f) {
        return 0;
    }

    @Override
    public Articulo copiaRestringida(Filter f) {
        return null;
    }
}
