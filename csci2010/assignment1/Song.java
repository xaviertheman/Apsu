package csci2010.assignment1;

public class Song {
    private String title;
    private String artist;
    private int length; // in seconds

    public Song(String title, String artist, int number_of_mins, int number_of_secs) {
        this.title = title;
        this.artist = artist;
        this.length = number_of_mins* 60 + number_of_secs;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void display(){
        System.out.printf(this.title + " - "+ this.artist + "(%02d:%02d", this.length,this.length%60);
    }



}
