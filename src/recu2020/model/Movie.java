package recu2020.model;

import recu2020.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Element {
    private static final int hierarchy = 0;
    private int score, releaseYear, oscars;
    private List<Actor> actors;
    public Movie(String name, int score, int releaseYear, int oscars){
        super(name);
        this.score = score;
        this.releaseYear = releaseYear;
        this.oscars = oscars;
        this.actors = new ArrayList<>();
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }
    @Override
    public int getOscars(){
        return this.oscars;
    }
    @Override
    public int getScore(){
        return this.score;
    }
    @Override
    public int hierarchy(){
        return this.hierarchy;
    }
    @Override
    public List<Movie> searchBy(Filter f){
        List<Movie> res = new ArrayList<>();
        if(f.satisfies(this)){
            res.add(this);
        }
        return res;
    }
    public Element createRestrictedCopy(Filter f){
        if(f.satisfies(this)){
            return new Movie(getName(),getScore(),getReleaseYear(),getOscars());
        }
        return null;
    }
}
