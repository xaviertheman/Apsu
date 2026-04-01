package csci2010.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WhitlowAssignment4 {
 /**
 *CSCI 2010 assignment 4
 * @ xavier whitlow
 * Course: CSCI 1010 – Assignment  4
 */
    public static ArrayList<Player> loadPlayers(String filename,ArrayList<Player> players){
        try {
            Scanner file = new Scanner(new File(filename));
            //uses parses the fille using commas and linebreaks
            file.useDelimiter("[,|\\n]");
            while (file.hasNext()) {
                String name = file.next();
                int one = file.nextInt();
                int two = file.nextInt();
                String three = file.next().trim();
                players.add(new Player(name, one, two, three));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return players;
    }

    public static void displayMenu(){
        System.out.println("Choose one of the following options:");
        System.out.println("1. Find a player by name");
        System.out.println("2. Find all players from a country");
        System.out.println("3. Find the youngest player");
        System.out.println("4. Find the oldest player");
        System.out.println("5. Exit");
    }

    public static Player findPlayerByName(ArrayList<Player> players, String name) throws NoSuchPlayerException{
        Player result = null;
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        if (result == null) {
            throw new NoSuchPlayerException();
        }
        return result;
    }

     public static ArrayList<Player> findPlayersByCountry(ArrayList<Player> players, String country) throws NoSuchPlayerException{
        ArrayList<Player> result = new ArrayList<>();
        for (Player player : players) {
            if (player.getHomeCountry().equalsIgnoreCase(country)) {
                result.add(player);
            }
        }
        if (result.isEmpty()) {
            throw new NoSuchPlayerException();
        }
        return result;
    }

    public static Player findYoungestPlayer(ArrayList<Player> players) throws NoSuchPlayerException{
        if (players.get(0) == null) {
            throw new NoSuchPlayerException();
        }

        Player youngest = players.get(0);

        for (Player player : players) {
            if (youngest.getAge()>player.getAge()) {
                youngest = player;
            }
        }
        return youngest;
    }

    public static Player findOldestPlayer(ArrayList<Player> players) throws NoSuchPlayerException{
        if (players.get(0) == null) {
            throw new NoSuchPlayerException();
        }
        
        Player oldest = players.get(0);

        for (Player player : players) {
            if (oldest.getAge()<player.getAge()) {
                oldest = player;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<Player> list = new ArrayList<>();
        loadPlayers("csci2010\\assignment4\\womenSinglesDraw.txt", list);
        int choice;
        do {
            displayMenu();
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the player's name: ");
                    kb.nextLine();
                    String name = kb.nextLine();
                    try {
                        System.out.println(findPlayerByName(list,name));
                    } catch (NoSuchPlayerException e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    System.out.println("Please enter the country:");
                    kb.nextLine();
                    String country = kb.nextLine();
                    try {
                        ArrayList<Player> lists = findPlayersByCountry(list, country);
                        for (Player player : lists) {
                            System.out.println(player.getName());
                        }
                    } catch (NoSuchPlayerException e) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    try {
                        System.out.println(findYoungestPlayer(list));
                    } catch (NoSuchPlayerException e) {
                        System.out.println(e);
                    }
                    break;

                case 4: 
                    try {
                        System.out.println(findOldestPlayer(list));
                    } catch (NoSuchPlayerException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Program Exiting");
                    break;
                default:
                    System.out.println("enter a number 1-5");
                    break;
            }
            
        } while (choice != 5);
    }

}
