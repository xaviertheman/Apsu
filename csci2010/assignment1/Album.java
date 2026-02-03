package csci2010.assignment1;

public class Album {
    private String title;
    private String artist;
    private Song[] tracklist;
    public Album(String title, String artist, Song[] tracklist) {
        this.title = title;
        this.artist = artist;
        this.tracklist = new Song[tracklist.length];
        for (int i = 0; i < tracklist.length; i++) {
            this.tracklist[i] = tracklist[i];
        }
        
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getTracklist() {
        return tracklist.length;
    }
    
}
