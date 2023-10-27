package recu2021.modelo;

import recu2021.calculadores.Calculador;
import recu2021.filtros.Filtro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;

public class Contingente extends Cliente {
    private List<Cliente> clientes;
    private Filtro filtro;
    private Calculador calculador;
    public Contingente(String nombre, String destino, LocalDateTime fechaPartida, LocalDateTime fechaRegreso, Filtro f, Calculador c){
        super(nombre,destino,fechaPartida,fechaRegreso);
        this.filtro = f;
        this.calculador = c;
        this.clientes = new ArrayList<>();
    }
    public Contingente(Contingente c){
        super(c.getNombre(),c.getDestino(),c.getFechaPartida(),c.getFechaRegreso());
        this.filtro = c.getFiltro();
        this.calculador = c.getCalculador();
        this.clientes = c.getClientes();
    }
    public boolean addCliente(Cliente c){
        if(this.filtro.cumple(c)){
            this.clientes.add(c);
            return true;
        }
        return false;
    }
    public void setFiltro(Filtro f){
        this.filtro = f;
    }
    public void setCalculador(Calculador c){
        this.calculador = c;
    }
    public Filtro getFiltro(){
        return this.filtro;
    }
    public Calculador getCalculador(){
        return this.calculador;
    }
    public List<Cliente> getClientes(){
        return new ArrayList<>(this.clientes);
    }
    @Override
    public Pasajero getMayorDeudor(){
        if(clientes.size() == 0) return null;
        Pasajero parcial = new Pasajero(null,null,null,null,0,-1);
        for(Cliente c: clientes){
            Pasajero temp = c.getMayorDeudor();
            if(temp != null && temp.getDeuda() > parcial.getDeuda()){
                parcial = temp;
            }
        }
        return parcial;
    }
    @Override
    public int getSize(){
        int sum = 0;
        for(Cliente c: clientes){
            sum += c.getSize();
        }
        return sum;
    }
    @Override
    public int getPrecio(){
        calculador.resetear();
        for(Cliente c: clientes){
            calculador.agregarTermino(c.getPrecio());
        }
        return calculador.calcular();
    }
    @Override
    public int getDeuda(){
        int sum = 0;
        for(Cliente c: clientes){
            sum += c.getDeuda();
        }
        return sum;
    }
    @Override
    public List<Cliente> buscar(Filtro f){
        List<Cliente> res = new ArrayList<>();
        if(f.cumple(this)){
            res.add(this);
        }else{
            for(Cliente c: clientes){
                List<Cliente> temp = c.buscar(f);
                if(!temp.isEmpty()){
                    res.addAll(temp);
                }

            }
        }
        return res;
    }
}
