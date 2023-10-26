package recu2023.modelo;

public class EspecOptativa extends Espec{
    @Override
    public boolean aprobado(Alumno a){
        int sum = 0;
        for(Curso c: cursos){
            if(c.aprobado(a)){
                sum += 1;
            }
        }
        return (sum > (getCantSubcursos()/2));
    }
}
