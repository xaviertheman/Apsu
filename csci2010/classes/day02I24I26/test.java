package csci2010.classes.day02I24I26;

public class test {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6,7};
        ArraySearcher search = new ArraySearcher(array);
        System.out.println("Found at: "+ search.find(1));
    }
}
