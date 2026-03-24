package day03I24I26;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerClient {
    
    
    public static void main(String[] args) {
        String s;
        Scanner intStream = null;
        PrintWriter outStream = null;
        try {
            Socket clienSocket = new Socket("Localhost", 6789);

            //set up steams to send/recive data
            intStream = new Scanner(new InputStreamReader(clienSocket.getInputStream()));
            outStream = new PrintWriter(new DataOutputStream(clienSocket.getOutputStream()));

            //send java to the server

            outStream.println("Java");
            outStream.flush();

            while (intStream.hasNextLine()) {
                s = intStream.next();
                System.out.println(s);
            }

            //close steams

            intStream.close();
            outStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
