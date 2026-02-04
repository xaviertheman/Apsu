package csci2010.assignment1;

public class AlbumCollection {
    public int max_albums;
    private int numAlbums;
    private Album[] albums;

    
    public AlbumCollection(int max_albums) {
        this.max_albums = max_albums;
        this.albums = new Album[max_albums];
        this.numAlbums = 0;
    }


    public int getNumAlbums() {
        return numAlbums;
    }

    public boolean addAlbum(Album album){
        if (max_albums == this.albums.length) {
            return false;
        }else{
            for (int i = 0; i < albums.length; i++) {
                if(this.albums[i]== null){
                    this.albums[i] = album;
                    return true;
                }
                    
            }
            return false;
        }
    }

    public Album findAlbum(String title, String artist){
        for (Album album : albums) {
            if(album.getArtist().equalsIgnoreCase(artist)&& album.getTitle().equalsIgnoreCase(title)){
                return album;
            }
        }
        return null;
    }

    public void sortAlbums(){
        Album currentStart;
        for (int i = 0; i < albums.length; i++) {
            
        }
    }
    
}
