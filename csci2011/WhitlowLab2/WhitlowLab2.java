package csci2011.WhitlowLab2;

public class WhitlowLab2 {

/**
 *CSCI 2011 Lab 2
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  2
 */

    public static void testComesBefore(Record record1, Record record2){
        System.out.println();
        System.out.println("testing test comes before");
        System.out.printf("record 1(%s)comes before record 2(%s) is "+ record1.comesBefore(record2)+"%n",record1,record2);
    }

    public static void testAddRecord(Record record, RecordCollection collection){
        System.out.println();
        System.out.println("Testing addRecord");
        System.out.println("Adding "+ record);
        collection.addRecord(record);
        collection.display();
    }

    public static void testRCDisplay(RecordCollection collection){
        System.out.println();
        System.out.printf("testing record display there are %02d records in this collection%n",collection.getNumrecords());
        collection.display();
    }

    public static void testFindRecord(RecordCollection collection,String title,String artist){
        System.out.println();
        System.out.println("Testing Find Record");
        System.out.println("Title is "+ title);
        System.out.println("Artist is "+ artist);
        System.out.println("result: "+collection.findRecord(artist, title));
    }

    public static void testSortRecords(RecordCollection collection){
        System.out.println("Testing sortRecords");
        collection.sortRecords();
        collection.display();
    }
    public static void main(String[] args) {
        Record record1 = new Record("Mad City", "KD", 2000);
        Record record2 = new Record("ZZZ", "XXX", 3333);
        Record record3 = new Record("sleeper","KD",4444);
        testComesBefore(record1, record2);
        testComesBefore(record1, record3);

        RecordCollection collection = new RecordCollection(4);
        testRCDisplay(collection);


        Record record4 = new Record("Unknown Pleasures", "Joy Division", 1979);
        Record record5 = new Record("Closer", "Joy Division", 1980);
        Record record6 = new Record("Disintegration", "Cure, the", 1989);
        Record record7 = new Record("New Day Rising", "Husker Du", 1985);
        testAddRecord(record7, collection);
        testAddRecord(record4, collection);
        testAddRecord(record5, collection);
        testAddRecord(record6, collection);

        testFindRecord(collection,"New Day Rising","Husker Du");
        testFindRecord(collection,"not","work");

        testSortRecords(collection);
    }
}
