package day03I24I26;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) {
        String s;
        PrintWriter writer;
        Scanner instream = null;
        ServerSocket server = null;

        try {
            System.out.println("waiting for connection");
            server = new ServerSocket(6789);
            Socket socket = server.accept();
            //connection made set up steams;
            instream = new Scanner(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new DataOutputStream(socket.getOutputStream()));

            s = instream.nextLine();

            //output text to client
            writer.println("Well, ");
            writer.println(s+"is a fine progaming language");
            writer.flush();
            System.out.println("Closing connection from "+ s);
            instream.close();
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
