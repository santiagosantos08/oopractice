package recu2021.modelo;
import recu2021.filtros.*;
import recu2021.calculadores.*;

import java.time.LocalDateTime;

public class Empresa {
    public Empresa(){

    };
    public static Contingente getContingenteBase(String nombre, String ciudad, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro mismoDestino = new FiltroIgualDestino(ciudad);
        Filtro mismaFecha = new FiltroIgualFechaPartida(fechaPartida);
        Filtro compuesto = new FiltroAnd(mismoDestino,mismaFecha);
        Calculador sumador = new CalcSuma();
        return new Contingente(nombre,ciudad,fechaPartida,fechaRegreso,compuesto,sumador);
    }
    public static Contingente getContingenteSoloFecha(String nombre, String ciudad, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro mismaFecha = new FiltroIgualFechaPartida(fechaPartida);
        Calculador sumador = new CalcSuma();
        return new Contingente(nombre,ciudad,fechaPartida,fechaRegreso,mismaFecha,sumador);
    }
    public static Contingente getContingenteSoloDestino(String nombre, String ciudad, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro mismoDestino = new FiltroIgualDestino(ciudad);
        Calculador sumador = new CalcSuma();
        return new Contingente(nombre,ciudad,fechaPartida,fechaRegreso,mismoDestino,sumador);
    }
    public static Contingente getContingenteDeudaMenorMedio(String nombre, String ciudad, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro deudaMenorAUnMedio = new FiltroDeudaMenor((float)0.5);
        Calculador sumador = new CalcSuma();
        return new Contingente(nombre,ciudad,fechaPartida,fechaRegreso,deudaMenorAUnMedio,sumador);
    }
    public static Contingente getContingenteEgresados(String nombre, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro mismoDestino = new FiltroIgualDestino("Bariloche");
        Calculador sumador = new CalcSuma();
        return new Contingente(nombre,"Bariloche",fechaPartida,fechaRegreso,mismoDestino,sumador);
    }
    public static Contingente getContingenteJubilados(String nombre, String ciudad, LocalDateTime fechaPartida, LocalDateTime fechaRegreso){
        Filtro todos = new FiltroTrue();
        Calculador promediador = new CalcPromedio();
        return new Contingente(nombre,ciudad,fechaPartida,fechaRegreso,todos,promediador);
    }
}
