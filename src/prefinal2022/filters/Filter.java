package prefinal2022.filters;

import prefinal2022.model.Noticia;

public interface Filter {
    boolean cumple(Noticia n);
}
