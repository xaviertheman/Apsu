package day02I12I26;

import java.util.Scanner;

public class Exceptiondemo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        try {
           System.out.println("enter numerator"); 
           int numerator = kbd.nextInt();
        } catch (DivideByZeroException e) {
            System.out.println(
                
            );
        }
    }
}
