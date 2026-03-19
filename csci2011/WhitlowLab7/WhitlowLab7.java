package csci2011.WhitlowLab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WhitlowLab7 {

/**
 *CSCI 2011 Lab 7
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  7
 */
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

    public static Scanner openFileForReading(String file){
        Scanner scan = null;

        try {
            scan = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return scan;
    }

    public static int readLinesFromFile(Scanner scaner){
        int num = 0;
        while (scaner.hasNext()) {
            System.out.println(scaner.nextLine());
            num++;
        }
        scaner.close();
        return num;
    }

    public static int writeLinesToFile(PrintWriter file){
        System.out.println("enter text to be entered to a file, Enter a blank to exit");
        String input = null;
        int num = 0;
        Scanner kb = new Scanner(System.in);
        while (input!="") {
            input= kb.nextLine();
            file.append("\n"+input);
            num++;
        }
        file.close();
        return num-1;

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        PrintWriter file = openFileForWriting("file.txt");
        System.out.println("File opened for writing\n");

        file.write("first line of file");
        System.out.println("file written to\n");
        file.close();

        file = openFileForAppending("file.txt");
        System.out.println("File opened for appending");

        System.out.println(writeLinesToFile(file)+" Lines written to file");

        Scanner book = openFileForReading("file.txt");
        System.out.println("\n file opened for reading");

        System.out.println(readLinesFromFile(book)+" Lines read from file");
    }







}


