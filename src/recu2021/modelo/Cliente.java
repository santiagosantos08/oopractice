package recu2021.modelo;

import java.time.LocalDateTime;
import java.util.List;
import recu2021.filtros.Filtro;

public abstract class Cliente {
    private String nombre, destino;
    private LocalDateTime fechaPartida, fechaRegreso;
    public Cliente(String nombre, String destino, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        this.nombre = nombre;
        this.destino = destino;
        this.fechaPartida = fechaPartida;
        this.fechaRegreso = fechaRegreso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDestino(){
        return this.destino;
    }
    public LocalDateTime getFechaPartida(){
        return this.fechaPartida;
    }
    public LocalDateTime getFechaRegreso() {
        return this.fechaRegreso;
    }
    public abstract Pasajero getMayorDeudor();
    public abstract int getSize();
    public abstract int getPrecio();
    public abstract int getDeuda();
    public abstract List<Cliente> buscar(Filtro f);
}
