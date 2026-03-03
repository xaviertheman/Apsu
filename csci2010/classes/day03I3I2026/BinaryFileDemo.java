package day03I3I2026;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BinaryFileDemo {
    private ObjectOutput outstream = null;

    public static void main(String[] args) {
        String filename = "numbers.dat";
        BinaryFileDemo bfd = new BinaryFileDemo();
        bfd.writeBinary(filename);
    }

    public void writeBinary(String filename){
        try{
            outstream = new ObjectOutputStream(new FileOutputStream(filename));
            Scanner kbd = new Scanner(System.in);
            System.out.println("enter a non-negative number");
            System.out.println("Place a negative at the end");
            int anInt;
            do {
                anInt = kbd.nextInt();
                outstream.writeInt(anInt);
            } while (anInt >=0);
            System.out.println("Numbers and sentinel value");
            System.out.println("Written to"+ filename);
            outstream.close();
        }catch (FileNotFoundException e){
            System.out.println("problem wit filename");
        }catch (IOException e){
            System.out.println("problem with io exception");
        }
    }
}