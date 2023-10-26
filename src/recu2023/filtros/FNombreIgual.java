package recu2023.filtros;

import recu2023.modelo.Curso;

public class FNombreIgual implements Filtro {
    private String valor;
    public FNombreIgual(String valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(Curso c){
        return (valor == c.getNombre());
    }
}
