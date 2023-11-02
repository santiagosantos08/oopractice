package parcial2020;

import java.util.Map;

public class Diccionario {
    /*
    private static Map<String, String> inglesIngles;
    private static Map<String, String> inglesAleman;
    private static Map<String, String> inglesFrances;
    private static Map<String, String> inglesEspanol;
    private static Map<String, String> inglesItaliano;
    private static Map<String, String> alemanIngles;
    private static Map<String, String> francesIngles;
    private static Map<String, String> espanolIngles;
    private static Map<String, String> italianoIngles;
     */
    private static Map<String,Map<String,String>> deInglesA;
    private static Map<String,Map<String,String>> aInglesDe;

    public static void setMapas(Map<String,Map<String,String>> engTo,Map<String,Map<String,String>> fromEng) {
        deInglesA.clear();
        aInglesDe.clear();
        deInglesA = engTo;
        aInglesDe = fromEng;
        /*
         * deInglesA :: Map<String::lengDestino,Map<String::palabraIngles,String::palabraLengDestino>>
         * aInglesDe :: Map<String::lengOrigen,Map<String::palabralengOrigen,String::palabraIngles>>
         */
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
