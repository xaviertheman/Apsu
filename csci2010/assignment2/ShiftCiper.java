package csci2010.assignment2;

public class ShiftCiper extends SubsitutionCipher {
 /**
 *CSCI 2010 assignment 2
 * @ xavier whitlow
 * Course: CSCI 1010 – Assignment  2
 */
    private int key;

    public ShiftCiper(int key) {
        this.key = key;
    }


    public String encryptChar(char plainChar) {
        return ""+shiftChar(plainChar, key);
    }

  
    public String decryptChar(char cipherChar) {
       return ""+shiftChar(cipherChar, 26-key);
    }

    public void reset() {
    
    }

}
