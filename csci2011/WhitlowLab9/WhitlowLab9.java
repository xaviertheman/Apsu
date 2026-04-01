package csci2011.WhitlowLab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WhitlowLab9 {
/**
 *CSCI 2011 Lab 9
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  9
 * Description: Displys use of hashMaps and sets
 */
    public static MovieActor readMovieActor(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Name of actor");
        String name = kb.nextLine();
        System.out.println("Enter name of movie");
        String movie = kb.nextLine();
        System.out.println("Enter year of movie");
        int year = kb.nextInt();
        return new MovieActor(name, movie, year);
    }

    public static void displayMovies(ArrayList<MovieActor> list){
        HashMap<String, Integer> map = new HashMap();
        for (MovieActor movieActor : list) {
            map.put(movieActor.getMovieName(),movieActor.getYear());
        }
        System.out.println("Unique movies:");
        for (String movie : map.keySet()) {
            System.out.println(movie+ " - "+ map.get(movie));
        }
    }

    public static void displayActors(ArrayList<MovieActor> list){
        HashSet<String> map = new HashSet<>();
        for (MovieActor movieActor : list) {
            map.add(movieActor.getActorName());
        }
        System.out.println("Unique actors:");
        for (String string : map) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieActor> list = new ArrayList<>();
        
        Scanner kb = new Scanner(System.in);
        String input = "";
        do {
            list.add(readMovieActor());
            System.out.println("Enter another? (y/n):");
            input = kb.next().toLowerCase();
        } while (!input.equals("n"));

        System.out.println(list);
        displayMovies(list);
        displayActors(list);

    }
}
