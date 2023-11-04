package parcial2023CiudadesEtc;

import java.time.LocalDate;

public class WrapperEjercicio2 implements CanteroAmbiental {
    private Cantero c;
    public WrapperEjercicio2(Cantero c){
        this.c = c;
    }
    public String getEspecieCA(){ return c.getEspecie(); }
    public int getMetrosCuadradosCA(){ return c.getMetros(); }
    public LocalDate getFechaPlantadoCA(){ return c.getFecha(); }
    public String toString(){
        return ("CanteroTunin "+" metros: "+c.getMetros());
    }
}
