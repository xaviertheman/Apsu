package csci2010.assignment2;

public class VigenereCipher extends SubsitutionCipher{
    private String keyword;
    private int kwPos;

    public VigenereCipher(String keyword) {
        this.keyword = keyword;
        this.kwPos = 0;
    }

    public String encryptChar(char plainChar) {
        char ch = keyword.charAt(kwPos);
        int keyValue = getKeyNum(ch);
        if (alphabetic(plainChar)) {
            kwPos ++;
           if (kwPos == keyword.length()) {
                kwPos= 0;
           }
        }
        if (keyValue >0) {
            return ""+shiftChar(plainChar, keyValue);
        }
        return ""+plainChar;

    }

    public String decryptChar(char cipherChar) {
        char ch = keyword.charAt(kwPos);
        if (alphabetic(cipherChar)) {
            kwPos ++;
           if (kwPos == keyword.length()) {
                kwPos= 0;
           }
        }
        int keyValue = getKeyNum(ch);
        if (keyValue >=0) {
            return ""+shiftChar(cipherChar,26-keyValue);
        }
        return ""+cipherChar;
    }

    public void reset() {
        this.kwPos = 0;
    }
    
}
