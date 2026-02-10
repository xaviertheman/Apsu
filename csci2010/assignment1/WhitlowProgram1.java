package csci2010.assignment1;

import java.util.Scanner;

public class WhitlowProgram1 {
 /**
 *CSCI 2010 assignment 1
 * @ xavier whitlow
 * Course: CSCI 1011 – Assignment  1
 */

    private final static Scanner scanner = new Scanner(System.in);

    private static void displayMenu(){
        System.out.println("Choose one of the following:");
        System.out.println("1. Add an album to the collection");
        System.out.println("2. Display the albums in the collection");
        System.out.println("3. Display the songs in the collection");
        System.out.println("4. Sort the albums in the collection");
        System.out.println("5. Add a song to the playlist");
        System.out.println("6. Display the playlist");
        System.out.println("7. Clear playlist");
        System.out.println("8. Exit the program");
    }

    private static int getChoice(){
        return scanner.nextInt();
    }

    private static Album createAlbum(){
        System.out.println("Enter a Album Title");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.println("Enter a album artist");
        String artist = scanner.nextLine();
        int num_tracks = 0;
        while (num_tracks <= 0) {
            System.out.println("Please enter the number of tracks on the album *must be greater than 0*");
            num_tracks = scanner.nextInt();
        }
        Song[] tracklist = getTracklist(num_tracks, artist);
        return new Album(title, artist, tracklist);

    }

    private static Song[] getTracklist(int numberTracks,String artist){
        Song[] result = new Song[numberTracks];
        for (int i = 0; i < result.length; i++) {
            System.out.println("What is the title of the song");
            scanner.nextLine();
            String title = scanner.nextLine();
            System.out.println("What is the lenght of the song in mins");
            int mins = scanner.nextInt();
            System.out.println("What is the lenght of the song in secs");
            int secs = scanner.nextInt();

            result[i] = new Song(title, artist, mins, secs);
        }
        return result;
    }

    private static Album getAlbumFromCollection(AlbumCollection collection){
        Album album = null;
        String title;
        String artist;
        do  {
            System.out.println();
            System.out.println("Enter a  Title: ");
            System.out.println();
            title = scanner.nextLine();
            System.out.println("Enter a  artist");
            System.out.println();
            artist = scanner.nextLine();
            album = collection.findAlbum(title, artist);
        }while(album == null);
        return album;
    }

    private static Song getSongFromAlbum(Album album){
        album.displayTracklist();
        Song track = null;
        while (track == null) {
            System.out.println();
            System.out.println("choose a track number");
            System.out.println();
            track = album.getTrack(scanner.nextInt());
        }
        return track;
    }
    
public static void main(String[] args) {
    AlbumCollection albumCollection = new AlbumCollection();
    playlist play = new playlist();
    int user;
    do {
        displayMenu();
        user = getChoice();
        switch (user) {
            case 1:
                albumCollection.addAlbum(createAlbum());
                break;
            case 2:
                albumCollection.displayAlbums();
                break;
            case 3:
                albumCollection.displaySongs();
                break;
            case 4:
                albumCollection.sortAlbums();
                break;
            case 5:
                play.addSong(getSongFromAlbum(getAlbumFromCollection(albumCollection)));
                break;
            case 6:
                play.display();
                break;
            case 7:
                play.clear();
                break;
            case 8:
                System.out.println("thank you");
                break;
        
            default:
                System.out.println("Choice out of bounds");
                break;
        }
    }while (user!=8 );



}

}
