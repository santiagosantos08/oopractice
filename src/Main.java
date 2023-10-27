import parcial2023.modelo.*;
import parcial2023.filtros.*;
public class Main {
    public static void main(String[] args) {
        Tarea tb1 = new TareaBasica("TB1");
        Tarea tb2 = new TareaBasica("TB2");
        Presupuesto pc1 = new PresupuestoComplejo("PC1");
        Presupuesto pc2 = new PresupuestoComplejo("PC2");
        pc1.addTarea(tb1);
        pc1.addTarea(tb2);
        pc2.addTarea(tb1);
        pc2.addTarea(tb2);
        pc2.addTarea(pc1);

        Filtro todo = new FiltroTrue();
        Presupuesto pc3 = new PresupuestoComplejo(pc2,todo);
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc3.eIgual(pc1));


    }
}