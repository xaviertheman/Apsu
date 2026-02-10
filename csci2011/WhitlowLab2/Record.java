package csci2011.WhitlowLab2;

public class Record {
/**
 *CSCI 2011 Lab 2
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  2
 */

    private String title;
    private String artist;
    private int yearRelased;

    public Record(String title, String artist, int yearRelased) {
        this.title = title;
        this.artist = artist;
        this.yearRelased = yearRelased;
    }

    public void display(){
        System.out.println(title + " - "+ artist + " ("+ yearRelased+")");
    }

    @Override
    public String toString() {
        return(title + " - "+ artist + " ("+ yearRelased+")");
    }

    public boolean comesBefore(Record record){
        if (this.artist.compareToIgnoreCase(record.getArtist())<1) {
            return true;
        }if (this.artist.compareToIgnoreCase(record.getArtist())>1) {
            return false;
        }if (this.yearRelased > yearRelased) {
            return false;
        }else{
            return true;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYearRelased() {
        return yearRelased;
    }
    
    

}
