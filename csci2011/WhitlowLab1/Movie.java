package csci2011.WhitlowLab1;

public class Movie {
    private String title;
    private String director;
    private int year;

    public void initialize(String title, String director, int year){
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public void display(){
        System.out.println(title + " dir. " + director + " (" + year+ ").");
    }

    public boolean equals(Movie movie){
        if (this.title == movie.getTitle() && this.director == movie.getDirector() && this.year == movie.getYear()) {
            return true;
        }else{
            return false;
        }
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
