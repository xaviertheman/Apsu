package csci2010.assignment2;

import java.util.Scanner;

public class WhiltlowAssignment2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Xavier Whitlow's cipher program!");
        String answer= "Y";
        do {
            System.out.println("Do you want to [E]ncrypt or [D]ecrypt?");
            String choice1 = kb.next();
            System.out.println("Do you want to use a [S]hift cipher or a [V]igenere cipher?");
            switch (kb.next().toLowerCase()) {
                case "s":
                    System.out.println("Please enter a number between 0 and 25 to use as a key:");
                    kb.nextLine();
                    int key = kb.nextInt();
                    ShiftCiper cipher1 = new ShiftCiper(key);
                    switch (choice1.toLowerCase()) {
                        case "e":
                            System.out.println("Please enter the plaintext to be encrypted: ");
                            kb.nextLine();
                            String plaintext = kb.nextLine();
                            System.out.println("The corresponding ciphertext is: "+cipher1.encrypt(plaintext));
                            break;
                        case "d":
                            System.out.println("Please enter the ciphertext to be decrypted: ");
                            kb.nextLine();
                            String ciphertext = kb.nextLine();
                            System.out.println("The corresponding plaintext is: "+cipher1.decrypt(ciphertext));
                            break;
                        default:
                            System.out.println("Enter E or D");
                            break;
                    }
                    break;
                case "v":
                    System.out.println("Please enter a keyword: ");
                    kb.nextLine();
                    String keyword = kb.nextLine();
                    VigenereCipher cipher2 = new VigenereCipher(keyword);
                    switch (choice1.toLowerCase()) {
                        case "e":
                            System.out.println("Please enter the plaintext to be encrypted:");
                            String plaintext = kb.nextLine();
                            System.out.println("The corresponding ciphertext is: "+cipher2.encrypt(plaintext));
                            break;
                        case "d":
                            System.out.println("Please enter the ciphertext to be decrypted: ");
                            String ciphertext = kb.nextLine();
                            System.out.println("The corresponding plaintext is: "+cipher2.decrypt(ciphertext));
                            break;
                    
                        default:
                            System.out.println("Enter E or D");
                            break;
                    }
                    break;
            
                default:
                    System.out.println("Enter S or V");
                    break;
            }
        System.out.println("Do you want to continue (Y/N)?");
        answer = kb.nextLine();
        } while (answer.toLowerCase()!= "n");
    }
}
