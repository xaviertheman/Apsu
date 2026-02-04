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
    public int getNumTracks() {
        return tracklist.length;
    }

    public Song getTrack(int track){
        if (track<= this.tracklist.length && track > 0) {
            return this.tracklist[track-1];
        }else{
            return null;
        }
    }
    
    public boolean comesBefore(Album other){
        if(this.artist.equalsIgnoreCase(other.getArtist())){
            if (this.title.equalsIgnoreCase(other.getTitle())) {
                return false;
            }
            if (this.title.compareToIgnoreCase(other.getTitle())>0) {
                return false;
            }else return true;
        }if (this.artist.compareToIgnoreCase(other.getArtist())>0) {
            return false;
        }else return true;

    }

    public void displayAlbum(){
        if(tracklist.length== 1){
            System.out.println(this.title + " - "+ this.artist + "("+ tracklist.length+ " "+ "track)");
        }else System.out.println(this.title + " - "+ this.artist + "("+ tracklist.length+ " "+ "tracks)");
        
    }

}
