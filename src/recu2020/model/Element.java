package recu2020.model;

import recu2020.filters.Filter;

import java.util.List;

public abstract class Element {
    private String name;
    public Element(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract int getOscars();
    public abstract int getScore();
    public abstract int hierarchy();
    public abstract List<Actor> getActors();
    public abstract List<Movie> searchBy(Filter f);
}
