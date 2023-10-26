package recu2023.filtros;

import recu2023.modelo.Curso;

public class FContieneNombre implements Filtro {
    private String valor;
    public FContieneNombre(String valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(Curso c){
        return c.getNombre().contains(valor);
    }
}
