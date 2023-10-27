package recu2021.modelo;

import recu2021.filtros.Filtro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Cliente {
    private int precio, deuda;
    public Pasajero(String nombre, String destino, LocalDateTime fechaPartida, LocalDateTime fechaRegreso, int precio, int deuda){
        super(nombre,destino,fechaPartida,fechaRegreso);
        this.precio = precio;
        this.deuda = deuda;
    }
    public Pasajero(Pasajero p){
        super(p.getNombre(),p.getDestino(),p.getFechaPartida(),p.getFechaRegreso());
        this.precio = p.getPrecio();
        this.deuda = p.getDeuda();
    }
    public void setPrecio(int n){
        this.precio = n;
    }
    public void setDeuda(int n){
        this.deuda = n;
    }
    @Override
    public Pasajero getMayorDeudor(){
        return this;
    }
    @Override
    public int getSize(){
        return 1;
    }
    @Override
    public int getPrecio(){
        return this.precio;
    }
    @Override
    public int getDeuda(){
        return this.deuda;
    }
    @Override
    public List<Cliente> buscar(Filtro f){
        List<Cliente> res = new ArrayList<>();
        if(f.cumple(this)){
            res.add(this);
        }
        return res;
    }
}
