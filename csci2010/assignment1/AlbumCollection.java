package csci2010.assignment1;

public class AlbumCollection {
/**
 *CSCI 2010 assignment 1
 * @ xavier whitlow
 * Course: CSCI 1011 – Assignment  1
 */
    public final int max_albums = 30;
    private int numAlbums;
    private Album[] albums;

    
    public AlbumCollection() {
        this.albums = new Album[max_albums];
        this.numAlbums = 0;
    }


    public int getNumAlbums() {
        return numAlbums;
    }

    public boolean addAlbum(Album album){
        if (max_albums == numAlbums) {
            return false;
        }else{
            for (int i = 0; i < albums.length; i++) {
                if(this.albums[i]== null){
                    this.albums[i] = album;
                    numAlbums++;
                    return true;
                }
                    
            }
            return false;
        }
    }

    public Album findAlbum(String title, String artist){
        for (int i = 0; i < numAlbums; i++) {
            if(albums[i].getArtist().equalsIgnoreCase(artist)&& albums[i].getTitle().equalsIgnoreCase(title)){
                return albums[i];
            }
        }
        return null;
    }

    public void sortAlbums(){
        for (int index = 0; index < numAlbums - 1; index++) {
            int minAlbum_index = index;
            for (int next_album = index + 1; next_album < numAlbums; next_album++) {
                if(albums[next_album].comesBefore(albums[minAlbum_index])){
                    minAlbum_index = next_album;
                }
            }
            Album temp = this.albums[index];
            this.albums[index] = this.albums[minAlbum_index];
            this.albums[minAlbum_index] = temp;
        }
    }

    public void displayAlbums(){
        System.out.println("Albums in Collection");
        for (int index = 0; index < numAlbums; index++) {
            albums[index].displayAlbum();
        }
    }

    public void displaySongs(){
        System.out.println("Albums in Collection");
        for (int i = 0; i < numAlbums; i++) {
            System.out.print(i+1+(". "));
            albums[i].displayAlbum();
            albums[i].displayTracklist();
            System.out.println();
        }
    }
    
}
