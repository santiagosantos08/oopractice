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
        //agregar los actores sin repeticion..
        if(this.hierarchy() >= e.hierarchy()){
            this.elements.add(e);
            return true;
        }
        return false;
    }
    @Override
    public int getOscars(){
        int sum = 0;
        for(Element e: elements){
            sum += e.getOscars();
        }
        return sum;
    }
    @Override
    public int getScore(){
        int sum = 0;
        for(Element e: elements){
            sum += e.getScore();
        }
        //hacer dif no sirve si size es 0!!
        return sum / this.elements.size();
    }
    @Override
    public int hierarchy(){
        return this.hierarchy;
    }
    @Override
    public List<Movie> searchBy(Filter f){
        List<Movie> res = new ArrayList<>();
        for(Element e: elements){
            List<Movie> temp = e.searchBy(f);
            if(!temp.isEmpty()){
                res.addAll(temp);
            }
        }
        return res;
    }
    @Override
    public Saga createRestrictedCopy(Filter f){
        boolean buscando = true;
        Saga res = new Saga(this.getName());
        for(Element e: elements){
            Element temp = e.createRestrictedCopy(f);
            if(temp != null){
                buscando = false;
                res.addElement(temp);
            }
        }
        if(!buscando){
            return res;
        }
        return null;
    }
}
