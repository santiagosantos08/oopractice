package recu2020.model;

import recu2020.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class Saga extends Element {
    private static final int hierarchy = 1;
    private List<Actor> actors;
    private List<Element> elements;
    public Saga(String name){
        super(name);
        this.actors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }
    public boolean addElement(Element e){
        if(this.hierarchy() >= e.hierarchy()){
            this.elements.add(e);
            return true;
        }
        return false;
    }
    @Override
    public int getOscars(){
        return 0;
    }
    @Override
    public int getScore(){
        return 0;
    }
    @Override
    public int hierarchy(){
        return this.hierarchy;
    }
    @Override
    public List<Movie> searchBy(Filter f){
        return null;
    }
    @Override
    public Element createRestrictedCopy(Filter f){
        Saga res = null;
        //este primer if es para cuando dice si se deben mantener
        //los contenedores vacios o no
        //de esta forma solo se mantienen los que cumplen ya de por si como cont
        //si no lo chequeas quedan todos los contenedores y solo importan los ind
        //si chequeas que satisfaga y no este vacio solo dejas los 'clave'

        //posiblemente sea if true pensarlo bien
        if(f.satisfies(this)){
            res = new Saga(this.getName());
            for(Element e: elements){
                Element temp = e.createRestrictedCopy(f);
                if(temp != null){
                    res.addElement(temp);
                }
            }
        }
        return res;
    }
}
