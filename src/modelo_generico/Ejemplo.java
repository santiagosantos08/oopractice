package modelo_generico;
/*
public void demo(){
    Ejemplo instancia1 = new SubClaseEjemplo();
    Ejemplo instancia2 = new SubClaseEjemplo();

    Ejemplo.setValor(15);

    int n = instancia1.metodoSubClase();
    int k = instancia2.metodoSubClase();

    suponiendo que .metodoSubClase() hace un calculo con valor
    n y k deberian ya estar ambos trabajando con valor = 15 ?
}
*/

public class Ejemplo {
    private static int valor;
    Ejemplo (){ }
    public static void setValor(int n){ valor = n; }
    public static int getValor(){ return valor; }
}
