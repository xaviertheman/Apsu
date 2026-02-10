package csci2011.WhitlowLab2;


public class RecordCollection {
/**
 *CSCI 2011 Lab 2
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  2
 */

    private int numrecords;
    private Record[] collection;
    public RecordCollection(int max_records) {
        this.numrecords = 0;
        this.collection = new Record[max_records];
    }

    public void display(){
        if(numrecords ==0){
            System.out.println("No records in the collection");
        }else{
            for (int i = 0; i < numrecords; i++) {
                System.out.printf("Record number %02d/%02d is %s %n",i+1,numrecords,collection[i]);
            }
        }
    }

    public boolean addRecord(Record record){
        if (numrecords<this.collection.length) {
            collection[numrecords] = record;
            numrecords++;
            return true;
        }else{
            return false;
        }
    }

    public Record findRecord(String artist, String title){
        for (int i = 0; i < numrecords; i++) {
            if (collection[i].getArtist() == artist && collection[i].getTitle() == title) {
                return collection[i];
            }
        }
        return null;
    }

    public void sortRecords(){
        for (int index = 0; index < numrecords - 1; index++) {
            int min_rec = index;
            for (int next_rec = index + 1; next_rec < numrecords; next_rec++) {
                if(collection[next_rec].comesBefore(collection[min_rec])){
                    min_rec = next_rec;
                }
            }
            Record temp = this.collection[index];
            this.collection[index] = this.collection[min_rec];
            this.collection[min_rec] = temp;
        }
    }

    public int getNumrecords() {
        return numrecords;
    }

    


}
