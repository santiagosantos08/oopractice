package recu2020.model;

import recu2020.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    private List<Actor> actors;
    private String name;
    public Element(String name){
        this.name = name;
        actors = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public List<Actor> getActors(){
        return new ArrayList<>(this.actors);
    }
    public abstract int getOscars();
    public abstract int getScore();
    public abstract int hierarchy();
    public abstract List<Movie> searchBy(Filter f);
    public abstract Element createRestrictedCopy(Filter f);
}
