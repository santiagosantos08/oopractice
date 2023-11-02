package parcial2020;

import java.util.Map;

public class Diccionario {
    private static Map<String, String> inglesIngles;
    private static Map<String, String> inglesAleman;
    private static Map<String, String> inglesFrances;
    private static Map<String, String> inglesEspanol;
    private static Map<String, String> inglesItaliano;
    private static Map<String, String> alemanIngles;
    private static Map<String, String> francesIngles;
    private static Map<String, String> espanolIngles;
    private static Map<String, String> italianoIngles;

    private static Map<String,Map<String,String>> deInglesA;
    private static Map<String,Map<String,String>> aInglesDe;

    public static void setMapas(Map<String,String> ninglesIngles,Map<String,String> ninglesAleman,
                           Map<String,String> ninglesFrances,Map<String,String> ninglesEspanol,
                           Map<String,String> ninglesItaliano,Map<String,String> nalemanIngles,
                           Map<String,String> nfrancesIngles,Map<String,String> nespanolIngles,
                           Map<String,String> nitalianoIngles) {
        //posiblemente hacerles new para que no sean EL MISMO..
        inglesIngles = ninglesIngles;
        inglesAleman = ninglesAleman;
        inglesFrances = ninglesFrances;
        inglesEspanol = ninglesEspanol;
        inglesItaliano = ninglesItaliano;
        alemanIngles = nalemanIngles;
        francesIngles = nfrancesIngles;
        espanolIngles = nespanolIngles;
        italianoIngles = nitalianoIngles;
        deInglesA.clear();
        aInglesDe.clear();
        deInglesA.put("Ingles", inglesIngles);
        deInglesA.put("Aleman", inglesAleman);
        deInglesA.put("Frances", inglesFrances);
        deInglesA.put("Espanol", inglesEspanol);
        deInglesA.put("Italiano",inglesItaliano);
        aInglesDe.put("Ingles", inglesIngles);
        aInglesDe.put("Aleman", alemanIngles);
        aInglesDe.put("Frances",francesIngles);
        aInglesDe.put("Espanol", espanolIngles);
        aInglesDe.put("Italiano", italianoIngles);
    }
    public static String traducir(String origen, String destino, String palabra){
        String res = null;
        if(origen.equals("Ingles")){
            res = deInglesA.get(destino).get(palabra);
        }else if(destino.equals("Ingles")){
            res = aInglesDe.get(origen).get(palabra);
        }else{
            String temp = aInglesDe.get(origen).get(palabra);
            if(temp != null){ res = deInglesA.get(destino).get(temp); }
        }
        if (res == null){ res = "ERROR"; }
        return res;
    }
}
