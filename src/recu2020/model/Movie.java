package recu2020.model;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Element {
    private int score, releaseYear, oscars;
    private List<Actor> actors;
    public Movie(String name, int score, int releaseYear, int oscars){
        super(name);
        this.score = score;
        this.releaseYear = releaseYear;
        this.oscars = oscars;
        this.actors = new ArrayList<>();
    }

}
