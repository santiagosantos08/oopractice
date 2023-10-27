package recu2021.filtros;

import recu2021.modelo.Cliente;

import java.time.LocalDateTime;

public class FiltroIgualFechaPartida implements Filtro {
    private LocalDateTime valor;
    public FiltroIgualFechaPartida(LocalDateTime f){
        this.valor = f;
    }
    @Override
    public boolean cumple(Cliente c){
        return (valor.equals(c.getFechaPartida()));
    }
}
