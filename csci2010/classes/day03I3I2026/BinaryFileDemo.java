package day03I3I2026;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class BinaryFileDemo {
    private ObjectOutput outstream = null;

    public static void main(String[] args) {
        String filename = "numbers.dat";
    }

    public void writeBinary(String filename){
        try{
            outstream = new ObjectOutputStream(new FileOutputStream(filename));




            outstream.close();
        }catch (FileNotFoundException e){
            
        }catch (IOException e){

        }
    }
}