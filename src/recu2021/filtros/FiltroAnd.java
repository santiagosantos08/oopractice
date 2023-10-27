package recu2021.filtros;


import recu2021.modelo.Cliente;

public class FiltroAnd implements Filtro {
    Filtro f1;
    Filtro f2;
    public FiltroAnd(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean cumple(Cliente c){
        return (f1.cumple(c) && f2.cumple(c));
    }
}
