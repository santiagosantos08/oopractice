package parcial2023CiudadesEtc;

import java.util.List;

public abstract class Region {
    public Region(){}
    public abstract int getCantMetrosCondicionado(Filtro f);
    public abstract int getCantArbolesCondicionado(Filtro f);
    public abstract List<String> getEspeciesPlantadas();
    public abstract List<String> getEspeciesPermitidas();

}
