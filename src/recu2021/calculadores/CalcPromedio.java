package recu2021.calculadores;

import java.util.ArrayList;
import java.util.List;

public class CalcPromedio implements Calculador {
    private List terminos;
    public CalcPromedio(){
        this.terminos = new ArrayList<>();
    }
    @Override
    public void agregarTermino(int n){
        terminos.add(n);
    }
    @Override
    public void resetear(){
        this.terminos.clear();
    }
    @Override
    public int calcular(){
        int sum = 0;
        for (Object n: terminos){
            sum += (int)n;
        }
        return sum/this.terminos.size();
    }
}
