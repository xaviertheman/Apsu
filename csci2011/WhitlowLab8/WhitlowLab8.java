package csci2011.WhitlowLab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WhitlowLab8 {

/**
 *CSCI 2011 Lab 8
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  8
 */

    //This turns the binary file into a array so that I can mutate it
    private static Contact[] toArray(){
        try {
            ObjectInputStream intstream = new ObjectInputStream(new FileInputStream("contacts.dat"));
            Contact temp;
            //I create a array of size one to incrment from since I do not know how many objects are in the file
            Contact[] array = new Contact[1];
            try {
                temp = (Contact) intstream.readObject();
                array[0] = temp;
                //I begin to increment through the file and its object until it thorws an excpeption marking the end of the file(best way I came up with)
                while (true) {
                    Contact[] array2 = new Contact[array.length+1];
                    for (int index = 0; index < array.length; index++) {
                        array2[index] = array[index];
                    }
                    temp = (Contact) intstream.readObject();
                    array2[array2.length-1] = temp;
                    array = array2;
                }
                //The excpetion marks end the the file and therfore I may return the away
            } catch (Exception e) {
                intstream.close();
                return array;
            }
        } catch (FileNotFoundException e)  {
           System.out.println("no contacts");
        } catch (IOException e) { 
            System.out.println("Problem reading the file");
        }
        return null;
    }
    
    public static void addContact(Contact contact){
        ObjectOutputStream outputStream = null;
        try {
            ObjectInputStream intstream = new ObjectInputStream(new FileInputStream("contacts.dat"));
            Contact temp;
            Contact[] array = new Contact[1];
            try {
                temp = (Contact) intstream.readObject();
                temp = (Contact) intstream.readObject();
                array[0] = temp;
                while (true) {
                    Contact[] array2 = new Contact[array.length+1];
                    for (int index = 0; index < array.length; index++) {
                        array2[index] = array[index];
                    }
                    temp = (Contact) intstream.readObject();
                    array2[array2.length-1] = temp;
                    array = array2;
                }
            } catch (Exception e) {
                intstream.close();
                outputStream = new ObjectOutputStream(new FileOutputStream("contacts.dat"));
                for (Contact object : array) {
                    outputStream.writeObject(object);
                }
                outputStream.writeObject(contact);
                }
        } catch (FileNotFoundException e)  {
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream("contacts.dat"));
                outputStream.writeObject(contact);
            } catch (FileNotFoundException e1) {
                System.out.println("problem with filename");
            } catch (IOException e1) {
                System.out.println("problem with io exception1");
            }
            try {
                outputStream.writeObject(contact);
            } catch (IOException e1) {
                System.out.println("problem with io exception2");
            }
        } catch (IOException e) { 
            System.out.println("Problem reading the file");
        }
        
    }

    public static void findContact(String name){
        try {
            ObjectInputStream intstream = new ObjectInputStream(new FileInputStream("contacts.dat"));
            try {
                Contact contact =(Contact) intstream.readObject();
                if (contact == null) {
                    contact =(Contact) intstream.readObject();
                }
                while (!contact.getName().equals(name)) {
                    contact = (Contact) intstream.readObject();
                }
                System.out.println(contact);
            } catch (ClassNotFoundException e) {
                System.out.println("end of file Contact not find");
            }
        
        } catch (FileNotFoundException e) {
           System.out.println("No contact list found");
        } catch (IOException e) {
            System.out.println("problem with io exception");
        }
    }

    public static void updateContact(String name){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please Enter a new Number");
        String number = kb.nextLine();
        deleteContact(name);
        addContact(new Contact(name, number));
    }

    public static void deleteContact(String name){
        Contact[] contacts = toArray();
        for (int index = 0; index < contacts.length; index++) {
            if (contacts[index].getName().equals(name)) {
                contacts[index] = null;
            }
        }
        Contact[] newContacts = new Contact[contacts.length-1];
        int num = 0;
        for (int index = 0; index < contacts.length; index++) {
            if (contacts[index]!= null) {
              newContacts[num] = contacts[index];
              num++;  
            }
        }
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("contacts.dat"));
            for (Contact contact : newContacts) {
               outputStream.writeObject(contact); 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayMenu(){
        System.out.println("Press 1 to add contact");
        System.out.println("Press 2 to find contact");
        System.out.println("Press 3 to update contact");
        System.out.println("Press 4 to delete contact");
        System.out.println("Press 5 to exit from the application");
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        displayMenu();
        int userinput = kb.nextInt();
        String name;
        String number;
        while (userinput != 5) {
            switch (userinput) {
                case 1:
                    System.out.println("Enter a name for contact");
                    kb.nextLine();
                    name = kb.nextLine();
                    System.out.println("Enter a Number");
                    number = kb.nextLine();
                    addContact(new Contact(name, number));
                    break;
                case 2:
                    System.out.println("Enter a name to be found");
                    kb.nextLine();
                    name = kb.nextLine();
                    findContact(name);
                    break;
                case 3:
                    System.out.println("Enter a name for contact");
                    kb.nextLine();
                    name = kb.nextLine();
                    updateContact(name);
                    break;
                case 4:
                    System.out.println("Enter a name for contact");
                    kb.nextLine();
                    name = kb.nextLine();
                    deleteContact(name);
                    break;
                default:
                    System.out.println("incorrect choice");
                    break;
            }
            displayMenu();
            userinput = kb.nextInt();
        }
        System.out.println("thank you for use of this app");
    }
}