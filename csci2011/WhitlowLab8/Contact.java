package csci2011.WhitlowLab8;

import java.io.Serializable;

public class Contact implements Serializable {

/**
 *CSCI 2011 Lab 8
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  8
 */

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + ": "+ phone+"#";
    }

    public String getName() {
        return name;
    }
    
}
