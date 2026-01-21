package csci2011.WhitlowLab1;

public class WhitlowLab1 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.initialize("Hustle n flow", "Lee roy Jenkenis", 1988);
        System.out.println("Testing initialize and display:");
        movie.display();

        System.out.println();
        System.out.println("Testing set Title and get Title:");
        System.out.println("get Title returns: " + movie.getTitle());
        System.out.println("calling set Title with argument: DOTA");
        movie.setTitle("DOTA");
        System.out.println("get Title returns: " + movie.getTitle());

        System.out.println();
        System.out.println("testing director mutators");
        System.out.println("get dir returns: "+ movie.getDirector());
        movie.setDirector("The Ancient");
        System.out.println("get dir returns: "+ movie.getDirector());

        System.out.println();
        System.out.println("testing year mutators");
        System.out.println("get year returns: " + movie.getYear());
        movie.setYear(69420);
        System.out.println("get year returns: " + movie.getYear());

        System.out.println();
        System.out.println("Testing equals on different titles, same director and year");
        Movie movie1 = new Movie();
        movie1.initialize("The Wasp Woman", "Roger Corman", 1959);
        movie1.display();
        Movie movie2 = new Movie();
        movie2.initialize("A Bucket of Blood", "Roger Corman", 1959);
        movie2.display();
        System.out.println(movie1.equals(movie2));
        
        System.out.println();
        System.out.println("Testing equals on different years, same title and director");
        Movie movie3 = new Movie();
        movie3.initialize("Halloween", "John Carpenter", 1978);
        movie3.display();
        Movie movie4 = new Movie();
        movie4.initialize("Halloween", "John Carpenter", 2007);
        movie4.display();
        System.out.println(movie3.equals(movie4));

        System.out.println();
        System.out.println("Testing equals and == on objects with the same data");
        Movie movie5 = new Movie();
        movie5.initialize("Suspiria", "Dario Argento", 1977);
        movie5.display();
        Movie movie6 = new Movie();
        movie6.initialize("Suspiria", "Dario Argento", 1977);
        movie6.display();
        System.out.println("equals returns "+movie5.equals(movie6));
        System.out.println("== returns "+ (movie5 == movie6));

        System.out.println();
        System.out.println("Testing equals and == on references to the same object");
        Movie movie7 = new Movie();
        movie7.initialize("Phantasm", "Phantasm", 1979);
        movie7.display();
        Movie movie8 = movie7;
        movie8.display();
        System.out.println("equals returns "+movie7.equals(movie8));
        System.out.println("== returns "+ (movie7 == movie8));





    }
}
