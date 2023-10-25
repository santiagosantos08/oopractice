package parcial2022.utils;

public class PrecioPorcentual implements Precio {
    private int porcentaje;
    private int valor;
    private int limitarPorcentaje(int val){ //deberia ir hasta -100 para que se pueda usar para descuentos??!
        if (val < 0) return 0;
        if (val > 100) return 100;
        return val;
    }
    public PrecioPorcentual(int valor, int porcentaje){
        this.porcentaje = limitarPorcentaje(porcentaje);
        this.valor = valor;
    }
    @Override
    public int getValor(){
        return ((valor / 100) * porcentaje);
    }
}
