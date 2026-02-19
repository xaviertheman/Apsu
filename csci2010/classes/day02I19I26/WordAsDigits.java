package day02I19I26;

public class WordAsDigits {
    public static void main(String[] args) {
        displayAsWords(2020);
    }

    public static void displayAsWords(int num){
        if(num < 10){
            System.out.println(getWordFromDigit(num));
        }else{
            displayAsWords(num/10);
            System.out.println(getWordFromDigit(num% 10)+"");
        }
    }

    private static String getWordFromDigit(int digit){
        String result = null;
        switch (digit) {
            case 0: result = "zero"; break;
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "three"; break;
            case 4: result = "four"; break;
            case 5: result = "five"; break;
            case 6: result = "six"; break;
            case 7: result = "seven"; break;
            case 8: result = "eight"; break;
            case 9: result = "nine"; break;
            default:
                System.exit(0);
                break;
        }
        return result;
    }
    
}
