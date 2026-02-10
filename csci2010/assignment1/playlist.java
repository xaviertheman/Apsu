package csci2010.assignment1;

public class playlist {
/**
 *CSCI 2010 assignment 1
 * @ xavier whitlow
 * Course: CSCI 1011 – Assignment  1
 */
    public static final int max_songs = 35;
    private int song_num;
    private Song[] songs;

       public playlist() {
        this.songs = new Song[max_songs];
        this.song_num = 0;
    }

    public int getSong_num() {
        return song_num;
    }

    public int getLength(){
        int length = 0;
        for (Song song : songs) {
            length += song.getLength();
        }
        return length;
    }

    public boolean addSong(Song song){
        if(song_num< max_songs){
            songs[song_num] = song;
            song_num++;
            return true;
        }
        return false;
    }

    public void display(){
        if(song_num >0){
            System.out.println("Song List");
            for (int index = 0; index < song_num; index++) {
                System.out.print(index+1+". ");
                songs[index].display();
            }
        }else{
            System.out.println("empty playlist");
        }
        
    }

    public void clear(){
        song_num = 0;
    }


    
}
