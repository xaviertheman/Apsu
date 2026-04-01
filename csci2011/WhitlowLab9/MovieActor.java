package csci2011.WhitlowLab9;

public class MovieActor {
/**
 *CSCI 2011 Lab 9
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  9
 */

    private String actorName;
    private String movieName;
    private int year;
    
    public MovieActor(String actorName, String movieName, int year) {
        this.actorName = actorName;
        this.movieName = movieName;
        this.year = year;
    }

    public String getActorName() {
        return actorName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return actorName + " in "+ movieName+", "+ year;
    }

    
}
