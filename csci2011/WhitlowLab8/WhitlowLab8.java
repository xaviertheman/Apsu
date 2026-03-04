package csci2011.WhitlowLab8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

public class WhitlowLab8 {
    public static PrintWriter openFileForWriting(String string){
        PrintWriter print = null;
        try {
            print = new PrintWriter(string);
        } catch (FileNotFoundException fileNotFoundException) {
           System.out.println("file not found");
            System.exit(1);
        }
        return print;
    }

    public static PrintWriter openFileForAppending(String string){
        PrintWriter print = null;
        try {
            print = new PrintWriter(new FileOutputStream(string, true

            ));
        } catch (FileNotFoundException e){
            System.out.println("file not found");
            System.exit(0);
        }

        return print;
    }

    public static int readLinesFromFile(Scanner file){
        int linesRead = 0;
        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }
        return linesRead;
    }

    public static void appendToFile(PrintWriter print,Scanner kb){
        String line = null;
        do {
            line = kb.nextLine();
            if (line.length() > 0) {
                print.append(line);
            }
        } while (line.length() >0);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        PrintWriter file = openFileForWriting("file.txt");
        System.out.println("File opened for writing");

        System.out.println("Enter text to be entered to file");
        file.write(kb.nextLine());
        System.out.println("file written to");
        file.close();

        try {
            readLinesFromFile(new Scanner(new File("file.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        




        

        

    }

}
