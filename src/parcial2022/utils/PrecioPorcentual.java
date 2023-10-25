package parcial2022.utils;

public class PrecioPorcentual implements Precio {
    private int porcentaje;
    private int limitarPorcentaje(int val){
        if (val < 0) return 0;
        if (val > 100) return 100;
        return val;
    }
    public PrecioPorcentual(int porcentaje){
        this.porcentaje = limitarPorcentaje(porcentaje);
    }
    @Override
    public int getValor(int base){
        return ((base / 100) * porcentaje);
    }
}
