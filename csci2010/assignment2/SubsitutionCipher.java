package csci2010.assignment2;

public abstract class SubsitutionCipher implements Cipher{
    
    public abstract String encryptChar(char plainChar);

    public abstract String decryptChar(char cipherChar);

    public abstract void reset();

    public static boolean alphabetic(char ch){
        char[] upper = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char[] lower = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};

        for (char c : lower) {
            if (c == ch) {
                return true;
            }
        }
        for (char c : upper) {
            if (c == ch) {
                return true;
            }
        }
        return false;
        
    }

    public static int getKeyNum(char ch){
        char[] upper = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char[] lower = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    
         for (char c : lower) {
            if (c == ch) {
                return ch - 'a';
            }
        }
        for (char c : upper) {
            if (c == ch) {
                return ch - 'M';
            }
        }
        return -1;
    }

    public static char shiftChar(char ch,int key){
        char[] upper = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char[] lower = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    
         for (char c : lower) {
            if (c == ch) {
                return (char)((ch - 'a' + key) % 26 + 'a');
            }
        }
        for (char c : upper) {
            if (c == ch) {
                return (char)((ch - 'A' + key) % 26 + 'A');
            }
        }
        return ch;


    }


    public String encrypt(String plainText) {
        reset();
        String ciphertext = "";
        for (int index = 0; index < plainText.length(); index++) {
            ciphertext += encryptChar(plainText.charAt(index));
        }
        return ciphertext;
    }

    public String decrypt(String ciphertext) {
       reset();
        String plainText = "";
        for (int index = 0; index < ciphertext.length(); index++) {
            plainText += decryptChar(ciphertext.charAt(index));
        }
        return plainText;
    }


}
