package recu2020.model;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name, lastName;
    private int birthYear;
    //CAMBIAR A LIST DE PELICULA CUANDO SE IMPLEMENTE
    private List<Movie> movies;
    public Actor(String name, String lastName, int birthYear){
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.movies = new ArrayList<>();
    }
    public void addMovie(Movie m){
        this.movies.add(m);
    }
    public List<Movie> getMovies(){
        return new ArrayList<Movie>(this.movies);
    }
    public String getName(){
        return  this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
}
